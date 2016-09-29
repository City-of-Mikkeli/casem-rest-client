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


package fi.otavanopisto.casem.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.otavanopisto.casem.client.model.Node;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * NodeList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-29T12:59:35.612+03:00")
public class NodeList   {
  @JsonProperty("odata.metadata")
  private String odataMetadata = null;

  @JsonProperty("value")
  private List<Node> value = new ArrayList<Node>();

  public NodeList odataMetadata(String odataMetadata) {
    this.odataMetadata = odataMetadata;
    return this;
  }

   /**
   * Get odataMetadata
   * @return odataMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOdataMetadata() {
    return odataMetadata;
  }

  public void setOdataMetadata(String odataMetadata) {
    this.odataMetadata = odataMetadata;
  }

  public NodeList value(List<Node> value) {
    this.value = value;
    return this;
  }

  public NodeList addValueItem(Node valueItem) {
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Node> getValue() {
    return value;
  }

  public void setValue(List<Node> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeList nodeList = (NodeList) o;
    return Objects.equals(this.odataMetadata, nodeList.odataMetadata) &&
        Objects.equals(this.value, nodeList.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataMetadata, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeList {\n");
    
    sb.append("    odataMetadata: ").append(toIndentedString(odataMetadata)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

