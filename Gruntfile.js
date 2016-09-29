/*global module:false*/

var fs = require('fs');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  grunt.initConfig({
    'clean': {
      'clean-casem-java-client-cruft': [
        'generated-sources/docs', 
        'generated-sources/gradle', 
        'generated-sources/build.gradle',
        'generated-sources/build.sbt',
        'generated-sources/git_push.sh',
        'generated-sources/gradle.properties',
        'generated-sources/gradlew',
        'generated-sources/gradlew.bat',
        'generated-sources/LICENSE',
        'generated-sources/README.md',
        'generated-sources/settings.gradle',
        'generated-sources/src/test',
        'generated-sources/src/main/AndroidManifest.xml',
        'generated-sources/src/main/java/io',
        'generated-sources/src/main/java/fi/otavanopisto/casem/auth',
        'generated-sources/src/main/java/fi/otavanopisto/casem/*.java'
      ],
      'sources': ['generated-sources/src']
    },
    'copy': {
      'copy-casem-rest-client-extras': {
        src: '**',
        dest: 'generated-sources',
        cwd: 'client-extras',
        expand: true
      }
    },
    'curl': {
      'swagger-codegen':  {
        src: 'http://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.2.1/swagger-codegen-cli-2.2.1.jar',
        dest: 'swagger-codegen-cli.jar'
      }
    },
    'shell': {
      'generate-casem-java-client': {
        command : 'mv generated-sources/pom.xml generated-sources/pom.xml.before && \
          java -jar swagger-codegen-cli.jar generate \
          -i ./swagger.yaml \
          -l java \
          --api-package fi.otavanopisto.casem.client\
          --model-package fi.otavanopisto.casem.client.model \
          --group-id fi.otavanopisto.casem.casem-rest-client \
          --artifact-id casem-rest-client\
          --artifact-version `mvn -f generated-sources/pom.xml.before -q -Dexec.executable=\'echo\' -Dexec.args=\'${project.version}\' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.3.1:exec` \
          --template-dir templates \
          --library jersey2 \
          --additional-properties dateLibrary=java8-localdatetime \
          -o generated-sources/'
      },
      'install-casem-java-client': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'generated-sources'
          }
        }
      },
      'release-casem-java-client': {
        command : 'git add src pom.xml && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'generated-sources'
          }
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('default', ['download-dependencies', 'clean:sources', 'shell:generate-casem-java-client', 'clean:clean-casem-java-client-cruft', 'copy:copy-casem-rest-client-extras', 'shell:install-casem-java-client', 'shell:release-casem-java-client' ]);
  
};