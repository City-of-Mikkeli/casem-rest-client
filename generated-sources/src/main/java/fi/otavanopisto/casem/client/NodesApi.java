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

import fi.otavanopisto.casem.client.model.Node;
import fi.otavanopisto.casem.client.model.Error;
import fi.otavanopisto.casem.client.model.NodeList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-29T13:50:34.751+03:00")
public class NodesApi {

  private ApiClient client;
  private String baseUrl;

  public NodesApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Finds node with nodeId
   * Finds node with nodeId
   * @param nodeId Node id (required)
   */
  public ApiResponse<Node> findNode(Long nodeId) {
    Map<String, Object> queryParams = new HashMap<>();
        
    String path = String.format("%s//Nodes({nodeId})"
      .replaceAll("\\{" + "nodeId" + "\\}", String.valueOf(nodeId)), baseUrl);
      
    ResultType<Node> resultType = new ResultType<Node>() {};
    return client.doGETRequest(path, resultType, queryParams);
  }
  /**
   * List nodes
   * List nodes
   */
  public ApiResponse<NodeList> listNodes() {
    Map<String, Object> queryParams = new HashMap<>();
        
    String path = String.format("%s//Nodes", baseUrl);
      
    ResultType<NodeList> resultType = new ResultType<NodeList>() {};
    return client.doGETRequest(path, resultType, queryParams);
  }
  
}
