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
import fi.otavanopisto.casem.client.model.ErrorOdataErrorMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * ErrorOdataError
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-29T11:00:33.220+03:00")
public class ErrorOdataError   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private ErrorOdataErrorMessage message = null;

  public ErrorOdataError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorOdataError message(ErrorOdataErrorMessage message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorOdataErrorMessage getMessage() {
    return message;
  }

  public void setMessage(ErrorOdataErrorMessage message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorOdataError errorOdataError = (ErrorOdataError) o;
    return Objects.equals(this.code, errorOdataError.code) &&
        Objects.equals(this.message, errorOdataError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorOdataError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
