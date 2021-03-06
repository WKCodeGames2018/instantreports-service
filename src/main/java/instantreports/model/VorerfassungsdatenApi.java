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
 * VorerfassungsdatenApi
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class VorerfassungsdatenApi   {
  @SerializedName("altersvorsorge")
  private Boolean altersvorsorge = null;

  @SerializedName("weitereEinnahmen")
  private Boolean weitereEinnahmen = null;

  @SerializedName("abgeschlossen")
  private Boolean abgeschlossen = null;

  @SerializedName("weitereMitarbeiterdaten")
  private Boolean weitereMitarbeiterdaten = null;

  @SerializedName("vwl")
  private Boolean vwl = null;

  @SerializedName("dauerauftraegePfaendungen")
  private Boolean dauerauftraegePfaendungen = null;

  @SerializedName("unterlagen")
  private Boolean unterlagen = null;

  public VorerfassungsdatenApi altersvorsorge(Boolean altersvorsorge) {
    this.altersvorsorge = altersvorsorge;
    return this;
  }

   /**
   * 
   * @return altersvorsorge
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAltersvorsorge() {
    return altersvorsorge;
  }

  public void setAltersvorsorge(Boolean altersvorsorge) {
    this.altersvorsorge = altersvorsorge;
  }

  public VorerfassungsdatenApi weitereEinnahmen(Boolean weitereEinnahmen) {
    this.weitereEinnahmen = weitereEinnahmen;
    return this;
  }

   /**
   * 
   * @return weitereEinnahmen
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getWeitereEinnahmen() {
    return weitereEinnahmen;
  }

  public void setWeitereEinnahmen(Boolean weitereEinnahmen) {
    this.weitereEinnahmen = weitereEinnahmen;
  }

  public VorerfassungsdatenApi abgeschlossen(Boolean abgeschlossen) {
    this.abgeschlossen = abgeschlossen;
    return this;
  }

   /**
   * 
   * @return abgeschlossen
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAbgeschlossen() {
    return abgeschlossen;
  }

  public void setAbgeschlossen(Boolean abgeschlossen) {
    this.abgeschlossen = abgeschlossen;
  }

  public VorerfassungsdatenApi weitereMitarbeiterdaten(Boolean weitereMitarbeiterdaten) {
    this.weitereMitarbeiterdaten = weitereMitarbeiterdaten;
    return this;
  }

   /**
   * 
   * @return weitereMitarbeiterdaten
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getWeitereMitarbeiterdaten() {
    return weitereMitarbeiterdaten;
  }

  public void setWeitereMitarbeiterdaten(Boolean weitereMitarbeiterdaten) {
    this.weitereMitarbeiterdaten = weitereMitarbeiterdaten;
  }

  public VorerfassungsdatenApi vwl(Boolean vwl) {
    this.vwl = vwl;
    return this;
  }

   /**
   * 
   * @return vwl
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVwl() {
    return vwl;
  }

  public void setVwl(Boolean vwl) {
    this.vwl = vwl;
  }

  public VorerfassungsdatenApi dauerauftraegePfaendungen(Boolean dauerauftraegePfaendungen) {
    this.dauerauftraegePfaendungen = dauerauftraegePfaendungen;
    return this;
  }

   /**
   * 
   * @return dauerauftraegePfaendungen
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDauerauftraegePfaendungen() {
    return dauerauftraegePfaendungen;
  }

  public void setDauerauftraegePfaendungen(Boolean dauerauftraegePfaendungen) {
    this.dauerauftraegePfaendungen = dauerauftraegePfaendungen;
  }

  public VorerfassungsdatenApi unterlagen(Boolean unterlagen) {
    this.unterlagen = unterlagen;
    return this;
  }

   /**
   * 
   * @return unterlagen
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUnterlagen() {
    return unterlagen;
  }

  public void setUnterlagen(Boolean unterlagen) {
    this.unterlagen = unterlagen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VorerfassungsdatenApi vorerfassungsdatenApi = (VorerfassungsdatenApi) o;
    return Objects.equals(this.altersvorsorge, vorerfassungsdatenApi.altersvorsorge) &&
        Objects.equals(this.weitereEinnahmen, vorerfassungsdatenApi.weitereEinnahmen) &&
        Objects.equals(this.abgeschlossen, vorerfassungsdatenApi.abgeschlossen) &&
        Objects.equals(this.weitereMitarbeiterdaten, vorerfassungsdatenApi.weitereMitarbeiterdaten) &&
        Objects.equals(this.vwl, vorerfassungsdatenApi.vwl) &&
        Objects.equals(this.dauerauftraegePfaendungen, vorerfassungsdatenApi.dauerauftraegePfaendungen) &&
        Objects.equals(this.unterlagen, vorerfassungsdatenApi.unterlagen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altersvorsorge, weitereEinnahmen, abgeschlossen, weitereMitarbeiterdaten, vwl, dauerauftraegePfaendungen, unterlagen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VorerfassungsdatenApi {\n");
    
    sb.append("    altersvorsorge: ").append(toIndentedString(altersvorsorge)).append("\n");
    sb.append("    weitereEinnahmen: ").append(toIndentedString(weitereEinnahmen)).append("\n");
    sb.append("    abgeschlossen: ").append(toIndentedString(abgeschlossen)).append("\n");
    sb.append("    weitereMitarbeiterdaten: ").append(toIndentedString(weitereMitarbeiterdaten)).append("\n");
    sb.append("    vwl: ").append(toIndentedString(vwl)).append("\n");
    sb.append("    dauerauftraegePfaendungen: ").append(toIndentedString(dauerauftraegePfaendungen)).append("\n");
    sb.append("    unterlagen: ").append(toIndentedString(unterlagen)).append("\n");
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

