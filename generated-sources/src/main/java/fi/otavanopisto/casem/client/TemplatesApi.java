/**
 * CaseM client
 * Automatically generated client libraries for CaseM
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fi.otavanopisto.casem.client;

import fi.otavanopisto.casem.client.model.*;

import fi.otavanopisto.casem.client.model.Error;
import fi.otavanopisto.casem.client.model.Template;
import fi.otavanopisto.casem.client.model.TemplateList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-29T14:16:29.169+03:00")
public class TemplatesApi {

  private ApiClient client;
  private String baseUrl;

  public TemplatesApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Finds template with templateId
   * Finds template with templateId
   * @param templateId Template id (required)
   */
  public ApiResponse<Template> findTemplate(Long templateId) {
    Map<String, Object> queryParams = new HashMap<>();
        
    String path = String.format("%s//Templates({templateId})"
      .replaceAll("\\{" + "templateId" + "\\}", String.valueOf(templateId)), baseUrl);
      
    ResultType<Template> resultType = new ResultType<Template>() {};
    return client.doGETRequest(path, resultType, queryParams);
  }
  /**
   * List templates
   * List templates
   * @param skiptoken Skip until this id (optional)
   */
  public ApiResponse<TemplateList> listTemplates(String skiptoken) {
    Map<String, Object> queryParams = new HashMap<>();
    if (skiptoken != null)
    queryParams.put("$skiptoken", skiptoken);
    
    String path = String.format("%s//Templates", baseUrl);
      
    ResultType<TemplateList> resultType = new ResultType<TemplateList>() {};
    return client.doGETRequest(path, resultType, queryParams);
  }
  
}
