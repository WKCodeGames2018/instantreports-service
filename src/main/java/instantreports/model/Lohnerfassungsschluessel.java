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
import instantreports.model.LohnErfassungsSchluesselDefinitionApi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Lohnerfassungsschluessel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Lohnerfassungsschluessel   {
  @SerializedName("lohnErfassungsSchluesselDefinitionApi")
  private LohnErfassungsSchluesselDefinitionApi lohnErfassungsSchluesselDefinitionApi = null;

  @SerializedName("id")
  private String id = null;

  public Lohnerfassungsschluessel lohnErfassungsSchluesselDefinitionApi(LohnErfassungsSchluesselDefinitionApi lohnErfassungsSchluesselDefinitionApi) {
    this.lohnErfassungsSchluesselDefinitionApi = lohnErfassungsSchluesselDefinitionApi;
    return this;
  }

   /**
   * Get lohnErfassungsSchluesselDefinitionApi
   * @return lohnErfassungsSchluesselDefinitionApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public LohnErfassungsSchluesselDefinitionApi getLohnErfassungsSchluesselDefinitionApi() {
    return lohnErfassungsSchluesselDefinitionApi;
  }

  public void setLohnErfassungsSchluesselDefinitionApi(LohnErfassungsSchluesselDefinitionApi lohnErfassungsSchluesselDefinitionApi) {
    this.lohnErfassungsSchluesselDefinitionApi = lohnErfassungsSchluesselDefinitionApi;
  }

  public Lohnerfassungsschluessel id(String id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lohnerfassungsschluessel lohnerfassungsschluessel = (Lohnerfassungsschluessel) o;
    return Objects.equals(this.lohnErfassungsSchluesselDefinitionApi, lohnerfassungsschluessel.lohnErfassungsSchluesselDefinitionApi) &&
        Objects.equals(this.id, lohnerfassungsschluessel.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lohnErfassungsSchluesselDefinitionApi, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lohnerfassungsschluessel {\n");
    
    sb.append("    lohnErfassungsSchluesselDefinitionApi: ").append(toIndentedString(lohnErfassungsSchluesselDefinitionApi)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
