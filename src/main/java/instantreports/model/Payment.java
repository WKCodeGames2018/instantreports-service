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
 * Payment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Payment   {
  @SerializedName("paymentDone")
  private String paymentDone = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("remitteeBankName")
  private String remitteeBankName = null;

  @SerializedName("remitteeIban")
  private String remitteeIban = null;

  @SerializedName("payerBankName")
  private String payerBankName = null;

  @SerializedName("paymentDoneOn")
  private OffsetDateTime paymentDoneOn = null;

  @SerializedName("payerIban")
  private String payerIban = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  @SerializedName("remitteeName")
  private String remitteeName = null;

  @SerializedName("paymentType")
  private String paymentType = null;

  @SerializedName("reasonForPayment")
  private String reasonForPayment = null;

  @SerializedName("payerName")
  private String payerName = null;

  @SerializedName("id")
  private String id = null;

  public Payment paymentDone(String paymentDone) {
    this.paymentDone = paymentDone;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return paymentDone
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getPaymentDone() {
    return paymentDone;
  }

  public void setPaymentDone(String paymentDone) {
    this.paymentDone = paymentDone;
  }

  public Payment amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Payment remitteeBankName(String remitteeBankName) {
    this.remitteeBankName = remitteeBankName;
    return this;
  }

   /**
   * 
   * @return remitteeBankName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRemitteeBankName() {
    return remitteeBankName;
  }

  public void setRemitteeBankName(String remitteeBankName) {
    this.remitteeBankName = remitteeBankName;
  }

  public Payment remitteeIban(String remitteeIban) {
    this.remitteeIban = remitteeIban;
    return this;
  }

   /**
   * 
   * @return remitteeIban
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRemitteeIban() {
    return remitteeIban;
  }

  public void setRemitteeIban(String remitteeIban) {
    this.remitteeIban = remitteeIban;
  }

  public Payment payerBankName(String payerBankName) {
    this.payerBankName = payerBankName;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return payerBankName
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getPayerBankName() {
    return payerBankName;
  }

  public void setPayerBankName(String payerBankName) {
    this.payerBankName = payerBankName;
  }

  public Payment paymentDoneOn(OffsetDateTime paymentDoneOn) {
    this.paymentDoneOn = paymentDoneOn;
    return this;
  }

   /**
   * 
   * @return paymentDoneOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getPaymentDoneOn() {
    return paymentDoneOn;
  }

  public void setPaymentDoneOn(OffsetDateTime paymentDoneOn) {
    this.paymentDoneOn = paymentDoneOn;
  }

  public Payment payerIban(String payerIban) {
    this.payerIban = payerIban;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return payerIban
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getPayerIban() {
    return payerIban;
  }

  public void setPayerIban(String payerIban) {
    this.payerIban = payerIban;
  }

  public Payment createdOn(OffsetDateTime createdOn) {
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

  public Payment remitteeName(String remitteeName) {
    this.remitteeName = remitteeName;
    return this;
  }

   /**
   * 
   * @return remitteeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRemitteeName() {
    return remitteeName;
  }

  public void setRemitteeName(String remitteeName) {
    this.remitteeName = remitteeName;
  }

  public Payment paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   *  (sortable)
   * @return paymentType
  **/
  @ApiModelProperty(example = "null", value = " (sortable)")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public Payment reasonForPayment(String reasonForPayment) {
    this.reasonForPayment = reasonForPayment;
    return this;
  }

   /**
   * 
   * @return reasonForPayment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReasonForPayment() {
    return reasonForPayment;
  }

  public void setReasonForPayment(String reasonForPayment) {
    this.reasonForPayment = reasonForPayment;
  }

  public Payment payerName(String payerName) {
    this.payerName = payerName;
    return this;
  }

   /**
   * 
   * @return payerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPayerName() {
    return payerName;
  }

  public void setPayerName(String payerName) {
    this.payerName = payerName;
  }

  public Payment id(String id) {
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
    Payment payment = (Payment) o;
    return Objects.equals(this.paymentDone, payment.paymentDone) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.remitteeBankName, payment.remitteeBankName) &&
        Objects.equals(this.remitteeIban, payment.remitteeIban) &&
        Objects.equals(this.payerBankName, payment.payerBankName) &&
        Objects.equals(this.paymentDoneOn, payment.paymentDoneOn) &&
        Objects.equals(this.payerIban, payment.payerIban) &&
        Objects.equals(this.createdOn, payment.createdOn) &&
        Objects.equals(this.remitteeName, payment.remitteeName) &&
        Objects.equals(this.paymentType, payment.paymentType) &&
        Objects.equals(this.reasonForPayment, payment.reasonForPayment) &&
        Objects.equals(this.payerName, payment.payerName) &&
        Objects.equals(this.id, payment.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentDone, amount, remitteeBankName, remitteeIban, payerBankName, paymentDoneOn, payerIban, createdOn, remitteeName, paymentType, reasonForPayment, payerName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    paymentDone: ").append(toIndentedString(paymentDone)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    remitteeBankName: ").append(toIndentedString(remitteeBankName)).append("\n");
    sb.append("    remitteeIban: ").append(toIndentedString(remitteeIban)).append("\n");
    sb.append("    payerBankName: ").append(toIndentedString(payerBankName)).append("\n");
    sb.append("    paymentDoneOn: ").append(toIndentedString(paymentDoneOn)).append("\n");
    sb.append("    payerIban: ").append(toIndentedString(payerIban)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    remitteeName: ").append(toIndentedString(remitteeName)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    reasonForPayment: ").append(toIndentedString(reasonForPayment)).append("\n");
    sb.append("    payerName: ").append(toIndentedString(payerName)).append("\n");
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

