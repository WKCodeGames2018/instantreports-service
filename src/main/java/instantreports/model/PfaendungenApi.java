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
import java.time.LocalDate;


/**
 * PfaendungenApi
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class PfaendungenApi   {
  @SerializedName("pfaendungBisherGetilgt")
  private String pfaendungBisherGetilgt = null;

  @SerializedName("pfaendungsart")
  private Integer pfaendungsart = null;

  @SerializedName("pfaendungEingangsdatum")
  private LocalDate pfaendungEingangsdatum = null;

  @SerializedName("pfaendungKosten")
  private String pfaendungKosten = null;

  @SerializedName("pfaendungKontonummer")
  private String pfaendungKontonummer = null;

  @SerializedName("pfaendungIban")
  private String pfaendungIban = null;

  @SerializedName("pfaendungUnterhaltspflichtige")
  private Long pfaendungUnterhaltspflichtige = null;

  @SerializedName("pfaendungBlz")
  private String pfaendungBlz = null;

  @SerializedName("pfaendungKostenArbeitgeber")
  private String pfaendungKostenArbeitgeber = null;

  @SerializedName("pfaendungEmpfaenger")
  private String pfaendungEmpfaenger = null;

  @SerializedName("pfaendungUnterhaltsbetrag")
  private String pfaendungUnterhaltsbetrag = null;

  @SerializedName("pfaendungSondertilgungen")
  private String pfaendungSondertilgungen = null;

  @SerializedName("pfaendungBetrag")
  private String pfaendungBetrag = null;

  @SerializedName("pfaendungGesamtforderung")
  private String pfaendungGesamtforderung = null;

  @SerializedName("pfaendungRestschuld")
  private String pfaendungRestschuld = null;

  @SerializedName("pfaendungBankname")
  private String pfaendungBankname = null;

  @SerializedName("pfaendungAktenzeichen")
  private String pfaendungAktenzeichen = null;

  public PfaendungenApi pfaendungBisherGetilgt(String pfaendungBisherGetilgt) {
    this.pfaendungBisherGetilgt = pfaendungBisherGetilgt;
    return this;
  }

   /**
   * 
   * @return pfaendungBisherGetilgt
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungBisherGetilgt() {
    return pfaendungBisherGetilgt;
  }

  public void setPfaendungBisherGetilgt(String pfaendungBisherGetilgt) {
    this.pfaendungBisherGetilgt = pfaendungBisherGetilgt;
  }

  public PfaendungenApi pfaendungsart(Integer pfaendungsart) {
    this.pfaendungsart = pfaendungsart;
    return this;
  }

   /**
   * 
   * @return pfaendungsart
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPfaendungsart() {
    return pfaendungsart;
  }

  public void setPfaendungsart(Integer pfaendungsart) {
    this.pfaendungsart = pfaendungsart;
  }

  public PfaendungenApi pfaendungEingangsdatum(LocalDate pfaendungEingangsdatum) {
    this.pfaendungEingangsdatum = pfaendungEingangsdatum;
    return this;
  }

   /**
   * 
   * @return pfaendungEingangsdatum
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getPfaendungEingangsdatum() {
    return pfaendungEingangsdatum;
  }

  public void setPfaendungEingangsdatum(LocalDate pfaendungEingangsdatum) {
    this.pfaendungEingangsdatum = pfaendungEingangsdatum;
  }

  public PfaendungenApi pfaendungKosten(String pfaendungKosten) {
    this.pfaendungKosten = pfaendungKosten;
    return this;
  }

   /**
   * 
   * @return pfaendungKosten
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungKosten() {
    return pfaendungKosten;
  }

  public void setPfaendungKosten(String pfaendungKosten) {
    this.pfaendungKosten = pfaendungKosten;
  }

  public PfaendungenApi pfaendungKontonummer(String pfaendungKontonummer) {
    this.pfaendungKontonummer = pfaendungKontonummer;
    return this;
  }

   /**
   * 
   * @return pfaendungKontonummer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungKontonummer() {
    return pfaendungKontonummer;
  }

  public void setPfaendungKontonummer(String pfaendungKontonummer) {
    this.pfaendungKontonummer = pfaendungKontonummer;
  }

  public PfaendungenApi pfaendungIban(String pfaendungIban) {
    this.pfaendungIban = pfaendungIban;
    return this;
  }

   /**
   * 
   * @return pfaendungIban
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungIban() {
    return pfaendungIban;
  }

  public void setPfaendungIban(String pfaendungIban) {
    this.pfaendungIban = pfaendungIban;
  }

  public PfaendungenApi pfaendungUnterhaltspflichtige(Long pfaendungUnterhaltspflichtige) {
    this.pfaendungUnterhaltspflichtige = pfaendungUnterhaltspflichtige;
    return this;
  }

   /**
   * 
   * @return pfaendungUnterhaltspflichtige
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getPfaendungUnterhaltspflichtige() {
    return pfaendungUnterhaltspflichtige;
  }

  public void setPfaendungUnterhaltspflichtige(Long pfaendungUnterhaltspflichtige) {
    this.pfaendungUnterhaltspflichtige = pfaendungUnterhaltspflichtige;
  }

  public PfaendungenApi pfaendungBlz(String pfaendungBlz) {
    this.pfaendungBlz = pfaendungBlz;
    return this;
  }

   /**
   * 
   * @return pfaendungBlz
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungBlz() {
    return pfaendungBlz;
  }

  public void setPfaendungBlz(String pfaendungBlz) {
    this.pfaendungBlz = pfaendungBlz;
  }

  public PfaendungenApi pfaendungKostenArbeitgeber(String pfaendungKostenArbeitgeber) {
    this.pfaendungKostenArbeitgeber = pfaendungKostenArbeitgeber;
    return this;
  }

   /**
   * 
   * @return pfaendungKostenArbeitgeber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungKostenArbeitgeber() {
    return pfaendungKostenArbeitgeber;
  }

  public void setPfaendungKostenArbeitgeber(String pfaendungKostenArbeitgeber) {
    this.pfaendungKostenArbeitgeber = pfaendungKostenArbeitgeber;
  }

  public PfaendungenApi pfaendungEmpfaenger(String pfaendungEmpfaenger) {
    this.pfaendungEmpfaenger = pfaendungEmpfaenger;
    return this;
  }

   /**
   * 
   * @return pfaendungEmpfaenger
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungEmpfaenger() {
    return pfaendungEmpfaenger;
  }

  public void setPfaendungEmpfaenger(String pfaendungEmpfaenger) {
    this.pfaendungEmpfaenger = pfaendungEmpfaenger;
  }

  public PfaendungenApi pfaendungUnterhaltsbetrag(String pfaendungUnterhaltsbetrag) {
    this.pfaendungUnterhaltsbetrag = pfaendungUnterhaltsbetrag;
    return this;
  }

   /**
   * 
   * @return pfaendungUnterhaltsbetrag
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungUnterhaltsbetrag() {
    return pfaendungUnterhaltsbetrag;
  }

  public void setPfaendungUnterhaltsbetrag(String pfaendungUnterhaltsbetrag) {
    this.pfaendungUnterhaltsbetrag = pfaendungUnterhaltsbetrag;
  }

  public PfaendungenApi pfaendungSondertilgungen(String pfaendungSondertilgungen) {
    this.pfaendungSondertilgungen = pfaendungSondertilgungen;
    return this;
  }

   /**
   * 
   * @return pfaendungSondertilgungen
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungSondertilgungen() {
    return pfaendungSondertilgungen;
  }

  public void setPfaendungSondertilgungen(String pfaendungSondertilgungen) {
    this.pfaendungSondertilgungen = pfaendungSondertilgungen;
  }

  public PfaendungenApi pfaendungBetrag(String pfaendungBetrag) {
    this.pfaendungBetrag = pfaendungBetrag;
    return this;
  }

   /**
   * 
   * @return pfaendungBetrag
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungBetrag() {
    return pfaendungBetrag;
  }

  public void setPfaendungBetrag(String pfaendungBetrag) {
    this.pfaendungBetrag = pfaendungBetrag;
  }

  public PfaendungenApi pfaendungGesamtforderung(String pfaendungGesamtforderung) {
    this.pfaendungGesamtforderung = pfaendungGesamtforderung;
    return this;
  }

   /**
   * 
   * @return pfaendungGesamtforderung
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungGesamtforderung() {
    return pfaendungGesamtforderung;
  }

  public void setPfaendungGesamtforderung(String pfaendungGesamtforderung) {
    this.pfaendungGesamtforderung = pfaendungGesamtforderung;
  }

  public PfaendungenApi pfaendungRestschuld(String pfaendungRestschuld) {
    this.pfaendungRestschuld = pfaendungRestschuld;
    return this;
  }

   /**
   * 
   * @return pfaendungRestschuld
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungRestschuld() {
    return pfaendungRestschuld;
  }

  public void setPfaendungRestschuld(String pfaendungRestschuld) {
    this.pfaendungRestschuld = pfaendungRestschuld;
  }

  public PfaendungenApi pfaendungBankname(String pfaendungBankname) {
    this.pfaendungBankname = pfaendungBankname;
    return this;
  }

   /**
   * 
   * @return pfaendungBankname
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungBankname() {
    return pfaendungBankname;
  }

  public void setPfaendungBankname(String pfaendungBankname) {
    this.pfaendungBankname = pfaendungBankname;
  }

  public PfaendungenApi pfaendungAktenzeichen(String pfaendungAktenzeichen) {
    this.pfaendungAktenzeichen = pfaendungAktenzeichen;
    return this;
  }

   /**
   * 
   * @return pfaendungAktenzeichen
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPfaendungAktenzeichen() {
    return pfaendungAktenzeichen;
  }

  public void setPfaendungAktenzeichen(String pfaendungAktenzeichen) {
    this.pfaendungAktenzeichen = pfaendungAktenzeichen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PfaendungenApi pfaendungenApi = (PfaendungenApi) o;
    return Objects.equals(this.pfaendungBisherGetilgt, pfaendungenApi.pfaendungBisherGetilgt) &&
        Objects.equals(this.pfaendungsart, pfaendungenApi.pfaendungsart) &&
        Objects.equals(this.pfaendungEingangsdatum, pfaendungenApi.pfaendungEingangsdatum) &&
        Objects.equals(this.pfaendungKosten, pfaendungenApi.pfaendungKosten) &&
        Objects.equals(this.pfaendungKontonummer, pfaendungenApi.pfaendungKontonummer) &&
        Objects.equals(this.pfaendungIban, pfaendungenApi.pfaendungIban) &&
        Objects.equals(this.pfaendungUnterhaltspflichtige, pfaendungenApi.pfaendungUnterhaltspflichtige) &&
        Objects.equals(this.pfaendungBlz, pfaendungenApi.pfaendungBlz) &&
        Objects.equals(this.pfaendungKostenArbeitgeber, pfaendungenApi.pfaendungKostenArbeitgeber) &&
        Objects.equals(this.pfaendungEmpfaenger, pfaendungenApi.pfaendungEmpfaenger) &&
        Objects.equals(this.pfaendungUnterhaltsbetrag, pfaendungenApi.pfaendungUnterhaltsbetrag) &&
        Objects.equals(this.pfaendungSondertilgungen, pfaendungenApi.pfaendungSondertilgungen) &&
        Objects.equals(this.pfaendungBetrag, pfaendungenApi.pfaendungBetrag) &&
        Objects.equals(this.pfaendungGesamtforderung, pfaendungenApi.pfaendungGesamtforderung) &&
        Objects.equals(this.pfaendungRestschuld, pfaendungenApi.pfaendungRestschuld) &&
        Objects.equals(this.pfaendungBankname, pfaendungenApi.pfaendungBankname) &&
        Objects.equals(this.pfaendungAktenzeichen, pfaendungenApi.pfaendungAktenzeichen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pfaendungBisherGetilgt, pfaendungsart, pfaendungEingangsdatum, pfaendungKosten, pfaendungKontonummer, pfaendungIban, pfaendungUnterhaltspflichtige, pfaendungBlz, pfaendungKostenArbeitgeber, pfaendungEmpfaenger, pfaendungUnterhaltsbetrag, pfaendungSondertilgungen, pfaendungBetrag, pfaendungGesamtforderung, pfaendungRestschuld, pfaendungBankname, pfaendungAktenzeichen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PfaendungenApi {\n");
    
    sb.append("    pfaendungBisherGetilgt: ").append(toIndentedString(pfaendungBisherGetilgt)).append("\n");
    sb.append("    pfaendungsart: ").append(toIndentedString(pfaendungsart)).append("\n");
    sb.append("    pfaendungEingangsdatum: ").append(toIndentedString(pfaendungEingangsdatum)).append("\n");
    sb.append("    pfaendungKosten: ").append(toIndentedString(pfaendungKosten)).append("\n");
    sb.append("    pfaendungKontonummer: ").append(toIndentedString(pfaendungKontonummer)).append("\n");
    sb.append("    pfaendungIban: ").append(toIndentedString(pfaendungIban)).append("\n");
    sb.append("    pfaendungUnterhaltspflichtige: ").append(toIndentedString(pfaendungUnterhaltspflichtige)).append("\n");
    sb.append("    pfaendungBlz: ").append(toIndentedString(pfaendungBlz)).append("\n");
    sb.append("    pfaendungKostenArbeitgeber: ").append(toIndentedString(pfaendungKostenArbeitgeber)).append("\n");
    sb.append("    pfaendungEmpfaenger: ").append(toIndentedString(pfaendungEmpfaenger)).append("\n");
    sb.append("    pfaendungUnterhaltsbetrag: ").append(toIndentedString(pfaendungUnterhaltsbetrag)).append("\n");
    sb.append("    pfaendungSondertilgungen: ").append(toIndentedString(pfaendungSondertilgungen)).append("\n");
    sb.append("    pfaendungBetrag: ").append(toIndentedString(pfaendungBetrag)).append("\n");
    sb.append("    pfaendungGesamtforderung: ").append(toIndentedString(pfaendungGesamtforderung)).append("\n");
    sb.append("    pfaendungRestschuld: ").append(toIndentedString(pfaendungRestschuld)).append("\n");
    sb.append("    pfaendungBankname: ").append(toIndentedString(pfaendungBankname)).append("\n");
    sb.append("    pfaendungAktenzeichen: ").append(toIndentedString(pfaendungAktenzeichen)).append("\n");
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
