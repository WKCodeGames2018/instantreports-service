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
 * Tagdefinition
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Tagdefinition   {
  @SerializedName("singleton")
  private Boolean singleton = null;

  @SerializedName("systemTag")
  private Boolean systemTag = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tagTyp")
  private String tagTyp = null;

  @SerializedName("id")
  private String id = null;

  public Tagdefinition singleton(Boolean singleton) {
    this.singleton = singleton;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return singleton
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public Boolean getSingleton() {
    return singleton;
  }

  public void setSingleton(Boolean singleton) {
    this.singleton = singleton;
  }

  public Tagdefinition systemTag(Boolean systemTag) {
    this.systemTag = systemTag;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return systemTag
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public Boolean getSystemTag() {
    return systemTag;
  }

  public void setSystemTag(Boolean systemTag) {
    this.systemTag = systemTag;
  }

  public Tagdefinition name(String name) {
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

  public Tagdefinition tagTyp(String tagTyp) {
    this.tagTyp = tagTyp;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return tagTyp
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getTagTyp() {
    return tagTyp;
  }

  public void setTagTyp(String tagTyp) {
    this.tagTyp = tagTyp;
  }

  public Tagdefinition id(String id) {
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
    Tagdefinition tagdefinition = (Tagdefinition) o;
    return Objects.equals(this.singleton, tagdefinition.singleton) &&
        Objects.equals(this.systemTag, tagdefinition.systemTag) &&
        Objects.equals(this.name, tagdefinition.name) &&
        Objects.equals(this.tagTyp, tagdefinition.tagTyp) &&
        Objects.equals(this.id, tagdefinition.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(singleton, systemTag, name, tagTyp, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tagdefinition {\n");
    
    sb.append("    singleton: ").append(toIndentedString(singleton)).append("\n");
    sb.append("    systemTag: ").append(toIndentedString(systemTag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tagTyp: ").append(toIndentedString(tagTyp)).append("\n");
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
