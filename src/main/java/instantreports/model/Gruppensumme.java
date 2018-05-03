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
 * Gruppensumme
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Gruppensumme   {
  @SerializedName("nachKonto")
  private Long nachKonto = null;

  @SerializedName("bezeichnung")
  private String bezeichnung = null;

  @SerializedName("vonKonto")
  private Long vonKonto = null;

  @SerializedName("krNummer")
  private Integer krNummer = null;

  @SerializedName("bisKonto")
  private Long bisKonto = null;

  @SerializedName("id")
  private String id = null;

  public Gruppensumme nachKonto(Long nachKonto) {
    this.nachKonto = nachKonto;
    return this;
  }

   /**
   *  (filterable)
   * @return nachKonto
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable)")
  public Long getNachKonto() {
    return nachKonto;
  }

  public void setNachKonto(Long nachKonto) {
    this.nachKonto = nachKonto;
  }

  public Gruppensumme bezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
    return this;
  }

   /**
   *  (filterable)
   * @return bezeichnung
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable)")
  public String getBezeichnung() {
    return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  public Gruppensumme vonKonto(Long vonKonto) {
    this.vonKonto = vonKonto;
    return this;
  }

   /**
   *  (filterable)
   * @return vonKonto
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable)")
  public Long getVonKonto() {
    return vonKonto;
  }

  public void setVonKonto(Long vonKonto) {
    this.vonKonto = vonKonto;
  }

  public Gruppensumme krNummer(Integer krNummer) {
    this.krNummer = krNummer;
    return this;
  }

   /**
   *  (filterable)
   * @return krNummer
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable)")
  public Integer getKrNummer() {
    return krNummer;
  }

  public void setKrNummer(Integer krNummer) {
    this.krNummer = krNummer;
  }

  public Gruppensumme bisKonto(Long bisKonto) {
    this.bisKonto = bisKonto;
    return this;
  }

   /**
   *  (filterable)
   * @return bisKonto
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable)")
  public Long getBisKonto() {
    return bisKonto;
  }

  public void setBisKonto(Long bisKonto) {
    this.bisKonto = bisKonto;
  }

  public Gruppensumme id(String id) {
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
    Gruppensumme gruppensumme = (Gruppensumme) o;
    return Objects.equals(this.nachKonto, gruppensumme.nachKonto) &&
        Objects.equals(this.bezeichnung, gruppensumme.bezeichnung) &&
        Objects.equals(this.vonKonto, gruppensumme.vonKonto) &&
        Objects.equals(this.krNummer, gruppensumme.krNummer) &&
        Objects.equals(this.bisKonto, gruppensumme.bisKonto) &&
        Objects.equals(this.id, gruppensumme.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nachKonto, bezeichnung, vonKonto, krNummer, bisKonto, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gruppensumme {\n");
    
    sb.append("    nachKonto: ").append(toIndentedString(nachKonto)).append("\n");
    sb.append("    bezeichnung: ").append(toIndentedString(bezeichnung)).append("\n");
    sb.append("    vonKonto: ").append(toIndentedString(vonKonto)).append("\n");
    sb.append("    krNummer: ").append(toIndentedString(krNummer)).append("\n");
    sb.append("    bisKonto: ").append(toIndentedString(bisKonto)).append("\n");
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

