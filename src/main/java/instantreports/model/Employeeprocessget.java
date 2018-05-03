/**
 * CPM API
 * Public API for CPM
 *
 * OpenAPI spec version: V1.0
 * Contact: info@addison.de
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


package instantreports.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Employeeprocessget
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Employeeprocessget   {
  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("EmployeeId")
  private String employeeId = null;

  public Employeeprocessget clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   *  (filterable)
   * @return clientId
  **/
  @ApiModelProperty(example = "null", value = " (filterable)")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Employeeprocessget id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "f4206901-c9b2-4e6e-8119-f7d623626060", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Employeeprocessget employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   *  (filterable)
   * @return employeeId
  **/
  @ApiModelProperty(example = "null", value = " (filterable)")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employeeprocessget employeeprocessget = (Employeeprocessget) o;
    return Objects.equals(this.clientId, employeeprocessget.clientId) &&
        Objects.equals(this.id, employeeprocessget.id) &&
        Objects.equals(this.employeeId, employeeprocessget.employeeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, id, employeeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employeeprocessget {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
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

