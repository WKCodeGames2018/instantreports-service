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
 * UnterlagenApi
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class UnterlagenApi   {
  @SerializedName("bescheinigungLohnsteuerabzug")
  private Boolean bescheinigungLohnsteuerabzug = null;

  @SerializedName("sonstigeUnterlagen")
  private String sonstigeUnterlagen = null;

  @SerializedName("vwlVertrag")
  private Boolean vwlVertrag = null;

  @SerializedName("schwerbehindertenausweis")
  private Boolean schwerbehindertenausweis = null;

  @SerializedName("verdienstabrechnungWeitereBeschaeftigung")
  private Boolean verdienstabrechnungWeitereBeschaeftigung = null;

  @SerializedName("pfaendungsverfuegung")
  private Boolean pfaendungsverfuegung = null;

  @SerializedName("mitgliedsbescheinigungVersorgungswerk")
  private Boolean mitgliedsbescheinigungVersorgungswerk = null;

  @SerializedName("immatrikulationsbescheinigung")
  private Boolean immatrikulationsbescheinigung = null;

  @SerializedName("arbeitsvertrag")
  private Boolean arbeitsvertrag = null;

  @SerializedName("arbeitserlaubnis")
  private Boolean arbeitserlaubnis = null;

  @SerializedName("geburtsnachweisKind")
  private Boolean geburtsnachweisKind = null;

  @SerializedName("befreiungsbescheinigungRentenversicherung")
  private Boolean befreiungsbescheinigungRentenversicherung = null;

  @SerializedName("mitgliedsbescheinigungKrankenkasse")
  private Boolean mitgliedsbescheinigungKrankenkasse = null;

  @SerializedName("aufenthaltsgenehmigung")
  private Boolean aufenthaltsgenehmigung = null;

  @SerializedName("beitragsbescheinigungPrivateKv")
  private Boolean beitragsbescheinigungPrivateKv = null;

  @SerializedName("altersvorsorgevertrag")
  private Boolean altersvorsorgevertrag = null;

  @SerializedName("bescheinigungBasisabsicherungPrivateKv")
  private Boolean bescheinigungBasisabsicherungPrivateKv = null;

  public UnterlagenApi bescheinigungLohnsteuerabzug(Boolean bescheinigungLohnsteuerabzug) {
    this.bescheinigungLohnsteuerabzug = bescheinigungLohnsteuerabzug;
    return this;
  }

   /**
   * 
   * @return bescheinigungLohnsteuerabzug
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getBescheinigungLohnsteuerabzug() {
    return bescheinigungLohnsteuerabzug;
  }

  public void setBescheinigungLohnsteuerabzug(Boolean bescheinigungLohnsteuerabzug) {
    this.bescheinigungLohnsteuerabzug = bescheinigungLohnsteuerabzug;
  }

  public UnterlagenApi sonstigeUnterlagen(String sonstigeUnterlagen) {
    this.sonstigeUnterlagen = sonstigeUnterlagen;
    return this;
  }

   /**
   * 
   * @return sonstigeUnterlagen
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSonstigeUnterlagen() {
    return sonstigeUnterlagen;
  }

  public void setSonstigeUnterlagen(String sonstigeUnterlagen) {
    this.sonstigeUnterlagen = sonstigeUnterlagen;
  }

  public UnterlagenApi vwlVertrag(Boolean vwlVertrag) {
    this.vwlVertrag = vwlVertrag;
    return this;
  }

   /**
   * 
   * @return vwlVertrag
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVwlVertrag() {
    return vwlVertrag;
  }

  public void setVwlVertrag(Boolean vwlVertrag) {
    this.vwlVertrag = vwlVertrag;
  }

  public UnterlagenApi schwerbehindertenausweis(Boolean schwerbehindertenausweis) {
    this.schwerbehindertenausweis = schwerbehindertenausweis;
    return this;
  }

   /**
   * 
   * @return schwerbehindertenausweis
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSchwerbehindertenausweis() {
    return schwerbehindertenausweis;
  }

  public void setSchwerbehindertenausweis(Boolean schwerbehindertenausweis) {
    this.schwerbehindertenausweis = schwerbehindertenausweis;
  }

  public UnterlagenApi verdienstabrechnungWeitereBeschaeftigung(Boolean verdienstabrechnungWeitereBeschaeftigung) {
    this.verdienstabrechnungWeitereBeschaeftigung = verdienstabrechnungWeitereBeschaeftigung;
    return this;
  }

   /**
   * 
   * @return verdienstabrechnungWeitereBeschaeftigung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVerdienstabrechnungWeitereBeschaeftigung() {
    return verdienstabrechnungWeitereBeschaeftigung;
  }

  public void setVerdienstabrechnungWeitereBeschaeftigung(Boolean verdienstabrechnungWeitereBeschaeftigung) {
    this.verdienstabrechnungWeitereBeschaeftigung = verdienstabrechnungWeitereBeschaeftigung;
  }

  public UnterlagenApi pfaendungsverfuegung(Boolean pfaendungsverfuegung) {
    this.pfaendungsverfuegung = pfaendungsverfuegung;
    return this;
  }

   /**
   * 
   * @return pfaendungsverfuegung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPfaendungsverfuegung() {
    return pfaendungsverfuegung;
  }

  public void setPfaendungsverfuegung(Boolean pfaendungsverfuegung) {
    this.pfaendungsverfuegung = pfaendungsverfuegung;
  }

  public UnterlagenApi mitgliedsbescheinigungVersorgungswerk(Boolean mitgliedsbescheinigungVersorgungswerk) {
    this.mitgliedsbescheinigungVersorgungswerk = mitgliedsbescheinigungVersorgungswerk;
    return this;
  }

   /**
   * 
   * @return mitgliedsbescheinigungVersorgungswerk
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMitgliedsbescheinigungVersorgungswerk() {
    return mitgliedsbescheinigungVersorgungswerk;
  }

  public void setMitgliedsbescheinigungVersorgungswerk(Boolean mitgliedsbescheinigungVersorgungswerk) {
    this.mitgliedsbescheinigungVersorgungswerk = mitgliedsbescheinigungVersorgungswerk;
  }

  public UnterlagenApi immatrikulationsbescheinigung(Boolean immatrikulationsbescheinigung) {
    this.immatrikulationsbescheinigung = immatrikulationsbescheinigung;
    return this;
  }

   /**
   * 
   * @return immatrikulationsbescheinigung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getImmatrikulationsbescheinigung() {
    return immatrikulationsbescheinigung;
  }

  public void setImmatrikulationsbescheinigung(Boolean immatrikulationsbescheinigung) {
    this.immatrikulationsbescheinigung = immatrikulationsbescheinigung;
  }

  public UnterlagenApi arbeitsvertrag(Boolean arbeitsvertrag) {
    this.arbeitsvertrag = arbeitsvertrag;
    return this;
  }

   /**
   * 
   * @return arbeitsvertrag
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getArbeitsvertrag() {
    return arbeitsvertrag;
  }

  public void setArbeitsvertrag(Boolean arbeitsvertrag) {
    this.arbeitsvertrag = arbeitsvertrag;
  }

  public UnterlagenApi arbeitserlaubnis(Boolean arbeitserlaubnis) {
    this.arbeitserlaubnis = arbeitserlaubnis;
    return this;
  }

   /**
   * 
   * @return arbeitserlaubnis
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getArbeitserlaubnis() {
    return arbeitserlaubnis;
  }

  public void setArbeitserlaubnis(Boolean arbeitserlaubnis) {
    this.arbeitserlaubnis = arbeitserlaubnis;
  }

  public UnterlagenApi geburtsnachweisKind(Boolean geburtsnachweisKind) {
    this.geburtsnachweisKind = geburtsnachweisKind;
    return this;
  }

   /**
   * 
   * @return geburtsnachweisKind
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getGeburtsnachweisKind() {
    return geburtsnachweisKind;
  }

  public void setGeburtsnachweisKind(Boolean geburtsnachweisKind) {
    this.geburtsnachweisKind = geburtsnachweisKind;
  }

  public UnterlagenApi befreiungsbescheinigungRentenversicherung(Boolean befreiungsbescheinigungRentenversicherung) {
    this.befreiungsbescheinigungRentenversicherung = befreiungsbescheinigungRentenversicherung;
    return this;
  }

   /**
   * 
   * @return befreiungsbescheinigungRentenversicherung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getBefreiungsbescheinigungRentenversicherung() {
    return befreiungsbescheinigungRentenversicherung;
  }

  public void setBefreiungsbescheinigungRentenversicherung(Boolean befreiungsbescheinigungRentenversicherung) {
    this.befreiungsbescheinigungRentenversicherung = befreiungsbescheinigungRentenversicherung;
  }

  public UnterlagenApi mitgliedsbescheinigungKrankenkasse(Boolean mitgliedsbescheinigungKrankenkasse) {
    this.mitgliedsbescheinigungKrankenkasse = mitgliedsbescheinigungKrankenkasse;
    return this;
  }

   /**
   * 
   * @return mitgliedsbescheinigungKrankenkasse
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMitgliedsbescheinigungKrankenkasse() {
    return mitgliedsbescheinigungKrankenkasse;
  }

  public void setMitgliedsbescheinigungKrankenkasse(Boolean mitgliedsbescheinigungKrankenkasse) {
    this.mitgliedsbescheinigungKrankenkasse = mitgliedsbescheinigungKrankenkasse;
  }

  public UnterlagenApi aufenthaltsgenehmigung(Boolean aufenthaltsgenehmigung) {
    this.aufenthaltsgenehmigung = aufenthaltsgenehmigung;
    return this;
  }

   /**
   * 
   * @return aufenthaltsgenehmigung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAufenthaltsgenehmigung() {
    return aufenthaltsgenehmigung;
  }

  public void setAufenthaltsgenehmigung(Boolean aufenthaltsgenehmigung) {
    this.aufenthaltsgenehmigung = aufenthaltsgenehmigung;
  }

  public UnterlagenApi beitragsbescheinigungPrivateKv(Boolean beitragsbescheinigungPrivateKv) {
    this.beitragsbescheinigungPrivateKv = beitragsbescheinigungPrivateKv;
    return this;
  }

   /**
   * 
   * @return beitragsbescheinigungPrivateKv
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getBeitragsbescheinigungPrivateKv() {
    return beitragsbescheinigungPrivateKv;
  }

  public void setBeitragsbescheinigungPrivateKv(Boolean beitragsbescheinigungPrivateKv) {
    this.beitragsbescheinigungPrivateKv = beitragsbescheinigungPrivateKv;
  }

  public UnterlagenApi altersvorsorgevertrag(Boolean altersvorsorgevertrag) {
    this.altersvorsorgevertrag = altersvorsorgevertrag;
    return this;
  }

   /**
   * 
   * @return altersvorsorgevertrag
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAltersvorsorgevertrag() {
    return altersvorsorgevertrag;
  }

  public void setAltersvorsorgevertrag(Boolean altersvorsorgevertrag) {
    this.altersvorsorgevertrag = altersvorsorgevertrag;
  }

  public UnterlagenApi bescheinigungBasisabsicherungPrivateKv(Boolean bescheinigungBasisabsicherungPrivateKv) {
    this.bescheinigungBasisabsicherungPrivateKv = bescheinigungBasisabsicherungPrivateKv;
    return this;
  }

   /**
   * 
   * @return bescheinigungBasisabsicherungPrivateKv
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getBescheinigungBasisabsicherungPrivateKv() {
    return bescheinigungBasisabsicherungPrivateKv;
  }

  public void setBescheinigungBasisabsicherungPrivateKv(Boolean bescheinigungBasisabsicherungPrivateKv) {
    this.bescheinigungBasisabsicherungPrivateKv = bescheinigungBasisabsicherungPrivateKv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnterlagenApi unterlagenApi = (UnterlagenApi) o;
    return Objects.equals(this.bescheinigungLohnsteuerabzug, unterlagenApi.bescheinigungLohnsteuerabzug) &&
        Objects.equals(this.sonstigeUnterlagen, unterlagenApi.sonstigeUnterlagen) &&
        Objects.equals(this.vwlVertrag, unterlagenApi.vwlVertrag) &&
        Objects.equals(this.schwerbehindertenausweis, unterlagenApi.schwerbehindertenausweis) &&
        Objects.equals(this.verdienstabrechnungWeitereBeschaeftigung, unterlagenApi.verdienstabrechnungWeitereBeschaeftigung) &&
        Objects.equals(this.pfaendungsverfuegung, unterlagenApi.pfaendungsverfuegung) &&
        Objects.equals(this.mitgliedsbescheinigungVersorgungswerk, unterlagenApi.mitgliedsbescheinigungVersorgungswerk) &&
        Objects.equals(this.immatrikulationsbescheinigung, unterlagenApi.immatrikulationsbescheinigung) &&
        Objects.equals(this.arbeitsvertrag, unterlagenApi.arbeitsvertrag) &&
        Objects.equals(this.arbeitserlaubnis, unterlagenApi.arbeitserlaubnis) &&
        Objects.equals(this.geburtsnachweisKind, unterlagenApi.geburtsnachweisKind) &&
        Objects.equals(this.befreiungsbescheinigungRentenversicherung, unterlagenApi.befreiungsbescheinigungRentenversicherung) &&
        Objects.equals(this.mitgliedsbescheinigungKrankenkasse, unterlagenApi.mitgliedsbescheinigungKrankenkasse) &&
        Objects.equals(this.aufenthaltsgenehmigung, unterlagenApi.aufenthaltsgenehmigung) &&
        Objects.equals(this.beitragsbescheinigungPrivateKv, unterlagenApi.beitragsbescheinigungPrivateKv) &&
        Objects.equals(this.altersvorsorgevertrag, unterlagenApi.altersvorsorgevertrag) &&
        Objects.equals(this.bescheinigungBasisabsicherungPrivateKv, unterlagenApi.bescheinigungBasisabsicherungPrivateKv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bescheinigungLohnsteuerabzug, sonstigeUnterlagen, vwlVertrag, schwerbehindertenausweis, verdienstabrechnungWeitereBeschaeftigung, pfaendungsverfuegung, mitgliedsbescheinigungVersorgungswerk, immatrikulationsbescheinigung, arbeitsvertrag, arbeitserlaubnis, geburtsnachweisKind, befreiungsbescheinigungRentenversicherung, mitgliedsbescheinigungKrankenkasse, aufenthaltsgenehmigung, beitragsbescheinigungPrivateKv, altersvorsorgevertrag, bescheinigungBasisabsicherungPrivateKv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnterlagenApi {\n");
    
    sb.append("    bescheinigungLohnsteuerabzug: ").append(toIndentedString(bescheinigungLohnsteuerabzug)).append("\n");
    sb.append("    sonstigeUnterlagen: ").append(toIndentedString(sonstigeUnterlagen)).append("\n");
    sb.append("    vwlVertrag: ").append(toIndentedString(vwlVertrag)).append("\n");
    sb.append("    schwerbehindertenausweis: ").append(toIndentedString(schwerbehindertenausweis)).append("\n");
    sb.append("    verdienstabrechnungWeitereBeschaeftigung: ").append(toIndentedString(verdienstabrechnungWeitereBeschaeftigung)).append("\n");
    sb.append("    pfaendungsverfuegung: ").append(toIndentedString(pfaendungsverfuegung)).append("\n");
    sb.append("    mitgliedsbescheinigungVersorgungswerk: ").append(toIndentedString(mitgliedsbescheinigungVersorgungswerk)).append("\n");
    sb.append("    immatrikulationsbescheinigung: ").append(toIndentedString(immatrikulationsbescheinigung)).append("\n");
    sb.append("    arbeitsvertrag: ").append(toIndentedString(arbeitsvertrag)).append("\n");
    sb.append("    arbeitserlaubnis: ").append(toIndentedString(arbeitserlaubnis)).append("\n");
    sb.append("    geburtsnachweisKind: ").append(toIndentedString(geburtsnachweisKind)).append("\n");
    sb.append("    befreiungsbescheinigungRentenversicherung: ").append(toIndentedString(befreiungsbescheinigungRentenversicherung)).append("\n");
    sb.append("    mitgliedsbescheinigungKrankenkasse: ").append(toIndentedString(mitgliedsbescheinigungKrankenkasse)).append("\n");
    sb.append("    aufenthaltsgenehmigung: ").append(toIndentedString(aufenthaltsgenehmigung)).append("\n");
    sb.append("    beitragsbescheinigungPrivateKv: ").append(toIndentedString(beitragsbescheinigungPrivateKv)).append("\n");
    sb.append("    altersvorsorgevertrag: ").append(toIndentedString(altersvorsorgevertrag)).append("\n");
    sb.append("    bescheinigungBasisabsicherungPrivateKv: ").append(toIndentedString(bescheinigungBasisabsicherungPrivateKv)).append("\n");
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

