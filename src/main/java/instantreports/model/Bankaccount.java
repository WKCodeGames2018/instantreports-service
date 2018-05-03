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
import java.time.OffsetDateTime;


/**
 * Bankaccount
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Bankaccount   {
  @SerializedName("testdata")
  private String testdata = null;

  @SerializedName("modifiedOn")
  private OffsetDateTime modifiedOn = null;

  @SerializedName("accountnumber")
  private String accountnumber = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("alias")
  private String alias = null;

  @SerializedName("accountBalanceRetrievalDate")
  private OffsetDateTime accountBalanceRetrievalDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("onlineKonto")
  private Boolean onlineKonto = null;

  @SerializedName("accountBalance")
  private String accountBalance = null;

  @SerializedName("bic")
  private String bic = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  @SerializedName("bankcode")
  private String bankcode = null;

  public Bankaccount testdata(String testdata) {
    this.testdata = testdata;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return testdata
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getTestdata() {
    return testdata;
  }

  public void setTestdata(String testdata) {
    this.testdata = testdata;
  }

  public Bankaccount modifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * 
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public Bankaccount accountnumber(String accountnumber) {
    this.accountnumber = accountnumber;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return accountnumber
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getAccountnumber() {
    return accountnumber;
  }

  public void setAccountnumber(String accountnumber) {
    this.accountnumber = accountnumber;
  }

  public Bankaccount iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return iban
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Bankaccount alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return alias
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public Bankaccount accountBalanceRetrievalDate(OffsetDateTime accountBalanceRetrievalDate) {
    this.accountBalanceRetrievalDate = accountBalanceRetrievalDate;
    return this;
  }

   /**
   * 
   * @return accountBalanceRetrievalDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getAccountBalanceRetrievalDate() {
    return accountBalanceRetrievalDate;
  }

  public void setAccountBalanceRetrievalDate(OffsetDateTime accountBalanceRetrievalDate) {
    this.accountBalanceRetrievalDate = accountBalanceRetrievalDate;
  }

  public Bankaccount id(String id) {
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

  public Bankaccount onlineKonto(Boolean onlineKonto) {
    this.onlineKonto = onlineKonto;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return onlineKonto
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public Boolean getOnlineKonto() {
    return onlineKonto;
  }

  public void setOnlineKonto(Boolean onlineKonto) {
    this.onlineKonto = onlineKonto;
  }

  public Bankaccount accountBalance(String accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

   /**
   * 
   * @return accountBalance
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(String accountBalance) {
    this.accountBalance = accountBalance;
  }

  public Bankaccount bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return bic
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public Bankaccount createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Bankaccount bankcode(String bankcode) {
    this.bankcode = bankcode;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return bankcode
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getBankcode() {
    return bankcode;
  }

  public void setBankcode(String bankcode) {
    this.bankcode = bankcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bankaccount bankaccount = (Bankaccount) o;
    return Objects.equals(this.testdata, bankaccount.testdata) &&
        Objects.equals(this.modifiedOn, bankaccount.modifiedOn) &&
        Objects.equals(this.accountnumber, bankaccount.accountnumber) &&
        Objects.equals(this.iban, bankaccount.iban) &&
        Objects.equals(this.alias, bankaccount.alias) &&
        Objects.equals(this.accountBalanceRetrievalDate, bankaccount.accountBalanceRetrievalDate) &&
        Objects.equals(this.id, bankaccount.id) &&
        Objects.equals(this.onlineKonto, bankaccount.onlineKonto) &&
        Objects.equals(this.accountBalance, bankaccount.accountBalance) &&
        Objects.equals(this.bic, bankaccount.bic) &&
        Objects.equals(this.createdOn, bankaccount.createdOn) &&
        Objects.equals(this.bankcode, bankaccount.bankcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testdata, modifiedOn, accountnumber, iban, alias, accountBalanceRetrievalDate, id, onlineKonto, accountBalance, bic, createdOn, bankcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bankaccount {\n");
    
    sb.append("    testdata: ").append(toIndentedString(testdata)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    accountnumber: ").append(toIndentedString(accountnumber)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    accountBalanceRetrievalDate: ").append(toIndentedString(accountBalanceRetrievalDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    onlineKonto: ").append(toIndentedString(onlineKonto)).append("\n");
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    bankcode: ").append(toIndentedString(bankcode)).append("\n");
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
