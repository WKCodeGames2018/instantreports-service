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
 * WeitereEinnahmenApi
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class WeitereEinnahmenApi   {
  @SerializedName("einkuenfteMehrfachbeschaeftigung")
  private Boolean einkuenfteMehrfachbeschaeftigung = null;

  @SerializedName("pvBrutto")
  private String pvBrutto = null;

  @SerializedName("avBrutto")
  private String avBrutto = null;

  @SerializedName("pvAgZuschuss")
  private String pvAgZuschuss = null;

  @SerializedName("versorgungsbezug")
  private Boolean versorgungsbezug = null;

  @SerializedName("kvAgZuschuss")
  private String kvAgZuschuss = null;

  @SerializedName("gesetzlicheRente")
  private Boolean gesetzlicheRente = null;

  @SerializedName("rvBrutto")
  private String rvBrutto = null;

  @SerializedName("kvBrutto")
  private String kvBrutto = null;

  @SerializedName("arbeitslosengeld")
  private Boolean arbeitslosengeld = null;

  public WeitereEinnahmenApi einkuenfteMehrfachbeschaeftigung(Boolean einkuenfteMehrfachbeschaeftigung) {
    this.einkuenfteMehrfachbeschaeftigung = einkuenfteMehrfachbeschaeftigung;
    return this;
  }

   /**
   * 
   * @return einkuenfteMehrfachbeschaeftigung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEinkuenfteMehrfachbeschaeftigung() {
    return einkuenfteMehrfachbeschaeftigung;
  }

  public void setEinkuenfteMehrfachbeschaeftigung(Boolean einkuenfteMehrfachbeschaeftigung) {
    this.einkuenfteMehrfachbeschaeftigung = einkuenfteMehrfachbeschaeftigung;
  }

  public WeitereEinnahmenApi pvBrutto(String pvBrutto) {
    this.pvBrutto = pvBrutto;
    return this;
  }

   /**
   * 
   * @return pvBrutto
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPvBrutto() {
    return pvBrutto;
  }

  public void setPvBrutto(String pvBrutto) {
    this.pvBrutto = pvBrutto;
  }

  public WeitereEinnahmenApi avBrutto(String avBrutto) {
    this.avBrutto = avBrutto;
    return this;
  }

   /**
   * 
   * @return avBrutto
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAvBrutto() {
    return avBrutto;
  }

  public void setAvBrutto(String avBrutto) {
    this.avBrutto = avBrutto;
  }

  public WeitereEinnahmenApi pvAgZuschuss(String pvAgZuschuss) {
    this.pvAgZuschuss = pvAgZuschuss;
    return this;
  }

   /**
   * 
   * @return pvAgZuschuss
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPvAgZuschuss() {
    return pvAgZuschuss;
  }

  public void setPvAgZuschuss(String pvAgZuschuss) {
    this.pvAgZuschuss = pvAgZuschuss;
  }

  public WeitereEinnahmenApi versorgungsbezug(Boolean versorgungsbezug) {
    this.versorgungsbezug = versorgungsbezug;
    return this;
  }

   /**
   * 
   * @return versorgungsbezug
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVersorgungsbezug() {
    return versorgungsbezug;
  }

  public void setVersorgungsbezug(Boolean versorgungsbezug) {
    this.versorgungsbezug = versorgungsbezug;
  }

  public WeitereEinnahmenApi kvAgZuschuss(String kvAgZuschuss) {
    this.kvAgZuschuss = kvAgZuschuss;
    return this;
  }

   /**
   * 
   * @return kvAgZuschuss
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKvAgZuschuss() {
    return kvAgZuschuss;
  }

  public void setKvAgZuschuss(String kvAgZuschuss) {
    this.kvAgZuschuss = kvAgZuschuss;
  }

  public WeitereEinnahmenApi gesetzlicheRente(Boolean gesetzlicheRente) {
    this.gesetzlicheRente = gesetzlicheRente;
    return this;
  }

   /**
   * 
   * @return gesetzlicheRente
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getGesetzlicheRente() {
    return gesetzlicheRente;
  }

  public void setGesetzlicheRente(Boolean gesetzlicheRente) {
    this.gesetzlicheRente = gesetzlicheRente;
  }

  public WeitereEinnahmenApi rvBrutto(String rvBrutto) {
    this.rvBrutto = rvBrutto;
    return this;
  }

   /**
   * 
   * @return rvBrutto
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRvBrutto() {
    return rvBrutto;
  }

  public void setRvBrutto(String rvBrutto) {
    this.rvBrutto = rvBrutto;
  }

  public WeitereEinnahmenApi kvBrutto(String kvBrutto) {
    this.kvBrutto = kvBrutto;
    return this;
  }

   /**
   * 
   * @return kvBrutto
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKvBrutto() {
    return kvBrutto;
  }

  public void setKvBrutto(String kvBrutto) {
    this.kvBrutto = kvBrutto;
  }

  public WeitereEinnahmenApi arbeitslosengeld(Boolean arbeitslosengeld) {
    this.arbeitslosengeld = arbeitslosengeld;
    return this;
  }

   /**
   * 
   * @return arbeitslosengeld
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getArbeitslosengeld() {
    return arbeitslosengeld;
  }

  public void setArbeitslosengeld(Boolean arbeitslosengeld) {
    this.arbeitslosengeld = arbeitslosengeld;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeitereEinnahmenApi weitereEinnahmenApi = (WeitereEinnahmenApi) o;
    return Objects.equals(this.einkuenfteMehrfachbeschaeftigung, weitereEinnahmenApi.einkuenfteMehrfachbeschaeftigung) &&
        Objects.equals(this.pvBrutto, weitereEinnahmenApi.pvBrutto) &&
        Objects.equals(this.avBrutto, weitereEinnahmenApi.avBrutto) &&
        Objects.equals(this.pvAgZuschuss, weitereEinnahmenApi.pvAgZuschuss) &&
        Objects.equals(this.versorgungsbezug, weitereEinnahmenApi.versorgungsbezug) &&
        Objects.equals(this.kvAgZuschuss, weitereEinnahmenApi.kvAgZuschuss) &&
        Objects.equals(this.gesetzlicheRente, weitereEinnahmenApi.gesetzlicheRente) &&
        Objects.equals(this.rvBrutto, weitereEinnahmenApi.rvBrutto) &&
        Objects.equals(this.kvBrutto, weitereEinnahmenApi.kvBrutto) &&
        Objects.equals(this.arbeitslosengeld, weitereEinnahmenApi.arbeitslosengeld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(einkuenfteMehrfachbeschaeftigung, pvBrutto, avBrutto, pvAgZuschuss, versorgungsbezug, kvAgZuschuss, gesetzlicheRente, rvBrutto, kvBrutto, arbeitslosengeld);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeitereEinnahmenApi {\n");
    
    sb.append("    einkuenfteMehrfachbeschaeftigung: ").append(toIndentedString(einkuenfteMehrfachbeschaeftigung)).append("\n");
    sb.append("    pvBrutto: ").append(toIndentedString(pvBrutto)).append("\n");
    sb.append("    avBrutto: ").append(toIndentedString(avBrutto)).append("\n");
    sb.append("    pvAgZuschuss: ").append(toIndentedString(pvAgZuschuss)).append("\n");
    sb.append("    versorgungsbezug: ").append(toIndentedString(versorgungsbezug)).append("\n");
    sb.append("    kvAgZuschuss: ").append(toIndentedString(kvAgZuschuss)).append("\n");
    sb.append("    gesetzlicheRente: ").append(toIndentedString(gesetzlicheRente)).append("\n");
    sb.append("    rvBrutto: ").append(toIndentedString(rvBrutto)).append("\n");
    sb.append("    kvBrutto: ").append(toIndentedString(kvBrutto)).append("\n");
    sb.append("    arbeitslosengeld: ").append(toIndentedString(arbeitslosengeld)).append("\n");
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

