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
 * AuswertungskreisDataApi
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class AuswertungskreisDataApi   {
  @SerializedName("bilanzierungsArt")
  private String bilanzierungsArt = null;

  @SerializedName("farbeRGB")
  private String farbeRGB = null;

  @SerializedName("afaVariante")
  private Integer afaVariante = null;

  @SerializedName("startUpBilanz")
  private Boolean startUpBilanz = null;

  @SerializedName("bezeichnung")
  private String bezeichnung = null;

  @SerializedName("startUp")
  private Boolean startUp = null;

  @SerializedName("bk")
  private String bk = null;

  @SerializedName("nummer")
  private Integer nummer = null;

  public AuswertungskreisDataApi bilanzierungsArt(String bilanzierungsArt) {
    this.bilanzierungsArt = bilanzierungsArt;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return bilanzierungsArt
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getBilanzierungsArt() {
    return bilanzierungsArt;
  }

  public void setBilanzierungsArt(String bilanzierungsArt) {
    this.bilanzierungsArt = bilanzierungsArt;
  }

  public AuswertungskreisDataApi farbeRGB(String farbeRGB) {
    this.farbeRGB = farbeRGB;
    return this;
  }

   /**
   * 
   * @return farbeRGB
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFarbeRGB() {
    return farbeRGB;
  }

  public void setFarbeRGB(String farbeRGB) {
    this.farbeRGB = farbeRGB;
  }

  public AuswertungskreisDataApi afaVariante(Integer afaVariante) {
    this.afaVariante = afaVariante;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return afaVariante
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public Integer getAfaVariante() {
    return afaVariante;
  }

  public void setAfaVariante(Integer afaVariante) {
    this.afaVariante = afaVariante;
  }

  public AuswertungskreisDataApi startUpBilanz(Boolean startUpBilanz) {
    this.startUpBilanz = startUpBilanz;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return startUpBilanz
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public Boolean getStartUpBilanz() {
    return startUpBilanz;
  }

  public void setStartUpBilanz(Boolean startUpBilanz) {
    this.startUpBilanz = startUpBilanz;
  }

  public AuswertungskreisDataApi bezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return bezeichnung
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getBezeichnung() {
    return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  public AuswertungskreisDataApi startUp(Boolean startUp) {
    this.startUp = startUp;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return startUp
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public Boolean getStartUp() {
    return startUp;
  }

  public void setStartUp(Boolean startUp) {
    this.startUp = startUp;
  }

  public AuswertungskreisDataApi bk(String bk) {
    this.bk = bk;
    return this;
  }

   /**
   * 
   * @return bk
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBk() {
    return bk;
  }

  public void setBk(String bk) {
    this.bk = bk;
  }

  public AuswertungskreisDataApi nummer(Integer nummer) {
    this.nummer = nummer;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return nummer
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public Integer getNummer() {
    return nummer;
  }

  public void setNummer(Integer nummer) {
    this.nummer = nummer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuswertungskreisDataApi auswertungskreisDataApi = (AuswertungskreisDataApi) o;
    return Objects.equals(this.bilanzierungsArt, auswertungskreisDataApi.bilanzierungsArt) &&
        Objects.equals(this.farbeRGB, auswertungskreisDataApi.farbeRGB) &&
        Objects.equals(this.afaVariante, auswertungskreisDataApi.afaVariante) &&
        Objects.equals(this.startUpBilanz, auswertungskreisDataApi.startUpBilanz) &&
        Objects.equals(this.bezeichnung, auswertungskreisDataApi.bezeichnung) &&
        Objects.equals(this.startUp, auswertungskreisDataApi.startUp) &&
        Objects.equals(this.bk, auswertungskreisDataApi.bk) &&
        Objects.equals(this.nummer, auswertungskreisDataApi.nummer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bilanzierungsArt, farbeRGB, afaVariante, startUpBilanz, bezeichnung, startUp, bk, nummer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuswertungskreisDataApi {\n");
    
    sb.append("    bilanzierungsArt: ").append(toIndentedString(bilanzierungsArt)).append("\n");
    sb.append("    farbeRGB: ").append(toIndentedString(farbeRGB)).append("\n");
    sb.append("    afaVariante: ").append(toIndentedString(afaVariante)).append("\n");
    sb.append("    startUpBilanz: ").append(toIndentedString(startUpBilanz)).append("\n");
    sb.append("    bezeichnung: ").append(toIndentedString(bezeichnung)).append("\n");
    sb.append("    startUp: ").append(toIndentedString(startUp)).append("\n");
    sb.append("    bk: ").append(toIndentedString(bk)).append("\n");
    sb.append("    nummer: ").append(toIndentedString(nummer)).append("\n");
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
