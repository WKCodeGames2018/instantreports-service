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
 * TemplateDefinitionApi
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class TemplateDefinitionApi   {
  @SerializedName("standard")
  private String standard = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("lohnartenplan")
  private String lohnartenplan = null;

  @SerializedName("lohnprogramm")
  private String lohnprogramm = null;

  public TemplateDefinitionApi standard(String standard) {
    this.standard = standard;
    return this;
  }

   /**
   * 
   * @return standard
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public TemplateDefinitionApi name(String name) {
    this.name = name;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TemplateDefinitionApi lohnartenplan(String lohnartenplan) {
    this.lohnartenplan = lohnartenplan;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return lohnartenplan
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getLohnartenplan() {
    return lohnartenplan;
  }

  public void setLohnartenplan(String lohnartenplan) {
    this.lohnartenplan = lohnartenplan;
  }

  public TemplateDefinitionApi lohnprogramm(String lohnprogramm) {
    this.lohnprogramm = lohnprogramm;
    return this;
  }

   /**
   * 
   * @return lohnprogramm
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLohnprogramm() {
    return lohnprogramm;
  }

  public void setLohnprogramm(String lohnprogramm) {
    this.lohnprogramm = lohnprogramm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDefinitionApi templateDefinitionApi = (TemplateDefinitionApi) o;
    return Objects.equals(this.standard, templateDefinitionApi.standard) &&
        Objects.equals(this.name, templateDefinitionApi.name) &&
        Objects.equals(this.lohnartenplan, templateDefinitionApi.lohnartenplan) &&
        Objects.equals(this.lohnprogramm, templateDefinitionApi.lohnprogramm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standard, name, lohnartenplan, lohnprogramm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDefinitionApi {\n");
    
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lohnartenplan: ").append(toIndentedString(lohnartenplan)).append("\n");
    sb.append("    lohnprogramm: ").append(toIndentedString(lohnprogramm)).append("\n");
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

