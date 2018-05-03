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
 * CommunicationApi
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class CommunicationApi   {
  @SerializedName("haupttelefon")
  private Boolean haupttelefon = null;

  @SerializedName("bezeichnung")
  private String bezeichnung = null;

  @SerializedName("durchwahl")
  private String durchwahl = null;

  @SerializedName("typ")
  private String typ = null;

  @SerializedName("nummer")
  private String nummer = null;

  public CommunicationApi haupttelefon(Boolean haupttelefon) {
    this.haupttelefon = haupttelefon;
    return this;
  }

   /**
   * 
   * @return haupttelefon
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHaupttelefon() {
    return haupttelefon;
  }

  public void setHaupttelefon(Boolean haupttelefon) {
    this.haupttelefon = haupttelefon;
  }

  public CommunicationApi bezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
    return this;
  }

   /**
   * 
   * @return bezeichnung
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBezeichnung() {
    return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  public CommunicationApi durchwahl(String durchwahl) {
    this.durchwahl = durchwahl;
    return this;
  }

   /**
   * 
   * @return durchwahl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDurchwahl() {
    return durchwahl;
  }

  public void setDurchwahl(String durchwahl) {
    this.durchwahl = durchwahl;
  }

  public CommunicationApi typ(String typ) {
    this.typ = typ;
    return this;
  }

   /**
   * 
   * @return typ
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTyp() {
    return typ;
  }

  public void setTyp(String typ) {
    this.typ = typ;
  }

  public CommunicationApi nummer(String nummer) {
    this.nummer = nummer;
    return this;
  }

   /**
   * 
   * @return nummer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNummer() {
    return nummer;
  }

  public void setNummer(String nummer) {
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
    CommunicationApi communicationApi = (CommunicationApi) o;
    return Objects.equals(this.haupttelefon, communicationApi.haupttelefon) &&
        Objects.equals(this.bezeichnung, communicationApi.bezeichnung) &&
        Objects.equals(this.durchwahl, communicationApi.durchwahl) &&
        Objects.equals(this.typ, communicationApi.typ) &&
        Objects.equals(this.nummer, communicationApi.nummer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(haupttelefon, bezeichnung, durchwahl, typ, nummer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationApi {\n");
    
    sb.append("    haupttelefon: ").append(toIndentedString(haupttelefon)).append("\n");
    sb.append("    bezeichnung: ").append(toIndentedString(bezeichnung)).append("\n");
    sb.append("    durchwahl: ").append(toIndentedString(durchwahl)).append("\n");
    sb.append("    typ: ").append(toIndentedString(typ)).append("\n");
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

