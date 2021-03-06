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
import instantreports.model.AuswertungskreisDataApi;
import instantreports.model.BuchungskreisDataApi;
import instantreports.model.WirtschaftsjahrDataApi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Einstellungen
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Einstellungen   {
  @SerializedName("auswertungskreisDatas")
  private List<AuswertungskreisDataApi> auswertungskreisDatas = new ArrayList<AuswertungskreisDataApi>();

  @SerializedName("wirtschaftsjahrDatas")
  private List<WirtschaftsjahrDataApi> wirtschaftsjahrDatas = new ArrayList<WirtschaftsjahrDataApi>();

  @SerializedName("id")
  private String id = null;

  @SerializedName("buchungskreisDatas")
  private List<BuchungskreisDataApi> buchungskreisDatas = new ArrayList<BuchungskreisDataApi>();

  public Einstellungen auswertungskreisDatas(List<AuswertungskreisDataApi> auswertungskreisDatas) {
    this.auswertungskreisDatas = auswertungskreisDatas;
    return this;
  }

  public Einstellungen addAuswertungskreisDatasItem(AuswertungskreisDataApi auswertungskreisDatasItem) {
    this.auswertungskreisDatas.add(auswertungskreisDatasItem);
    return this;
  }

   /**
   * Get auswertungskreisDatas
   * @return auswertungskreisDatas
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AuswertungskreisDataApi> getAuswertungskreisDatas() {
    return auswertungskreisDatas;
  }

  public void setAuswertungskreisDatas(List<AuswertungskreisDataApi> auswertungskreisDatas) {
    this.auswertungskreisDatas = auswertungskreisDatas;
  }

  public Einstellungen wirtschaftsjahrDatas(List<WirtschaftsjahrDataApi> wirtschaftsjahrDatas) {
    this.wirtschaftsjahrDatas = wirtschaftsjahrDatas;
    return this;
  }

  public Einstellungen addWirtschaftsjahrDatasItem(WirtschaftsjahrDataApi wirtschaftsjahrDatasItem) {
    this.wirtschaftsjahrDatas.add(wirtschaftsjahrDatasItem);
    return this;
  }

   /**
   * Get wirtschaftsjahrDatas
   * @return wirtschaftsjahrDatas
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WirtschaftsjahrDataApi> getWirtschaftsjahrDatas() {
    return wirtschaftsjahrDatas;
  }

  public void setWirtschaftsjahrDatas(List<WirtschaftsjahrDataApi> wirtschaftsjahrDatas) {
    this.wirtschaftsjahrDatas = wirtschaftsjahrDatas;
  }

  public Einstellungen id(String id) {
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

  public Einstellungen buchungskreisDatas(List<BuchungskreisDataApi> buchungskreisDatas) {
    this.buchungskreisDatas = buchungskreisDatas;
    return this;
  }

  public Einstellungen addBuchungskreisDatasItem(BuchungskreisDataApi buchungskreisDatasItem) {
    this.buchungskreisDatas.add(buchungskreisDatasItem);
    return this;
  }

   /**
   * Get buchungskreisDatas
   * @return buchungskreisDatas
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BuchungskreisDataApi> getBuchungskreisDatas() {
    return buchungskreisDatas;
  }

  public void setBuchungskreisDatas(List<BuchungskreisDataApi> buchungskreisDatas) {
    this.buchungskreisDatas = buchungskreisDatas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Einstellungen einstellungen = (Einstellungen) o;
    return Objects.equals(this.auswertungskreisDatas, einstellungen.auswertungskreisDatas) &&
        Objects.equals(this.wirtschaftsjahrDatas, einstellungen.wirtschaftsjahrDatas) &&
        Objects.equals(this.id, einstellungen.id) &&
        Objects.equals(this.buchungskreisDatas, einstellungen.buchungskreisDatas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auswertungskreisDatas, wirtschaftsjahrDatas, id, buchungskreisDatas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Einstellungen {\n");
    
    sb.append("    auswertungskreisDatas: ").append(toIndentedString(auswertungskreisDatas)).append("\n");
    sb.append("    wirtschaftsjahrDatas: ").append(toIndentedString(wirtschaftsjahrDatas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buchungskreisDatas: ").append(toIndentedString(buchungskreisDatas)).append("\n");
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

