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
import instantreports.model.ExternalTenantId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Tenant
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Tenant   {
  @SerializedName("country")
  private String country = null;

  @SerializedName("tenantConfiguration")
  private String tenantConfiguration = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("legacyLocation")
  private Integer legacyLocation = null;

  @SerializedName("oneClickUri")
  private String oneClickUri = null;

  @SerializedName("stbGatewayNetworkMemberId")
  private String stbGatewayNetworkMemberId = null;

  @SerializedName("tenantId")
  private String tenantId = null;

  @SerializedName("admin")
  private Boolean admin = null;

  @SerializedName("closed")
  private Boolean closed = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("customerNumber")
  private String customerNumber = null;

  @SerializedName("externalTenants")
  private ExternalTenantId externalTenants = null;

  public Tenant country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Tenant tenantConfiguration(String tenantConfiguration) {
    this.tenantConfiguration = tenantConfiguration;
    return this;
  }

   /**
   * 
   * @return tenantConfiguration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTenantConfiguration() {
    return tenantConfiguration;
  }

  public void setTenantConfiguration(String tenantConfiguration) {
    this.tenantConfiguration = tenantConfiguration;
  }

  public Tenant notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * 
   * @return notes
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Tenant legacyLocation(Integer legacyLocation) {
    this.legacyLocation = legacyLocation;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return legacyLocation
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public Integer getLegacyLocation() {
    return legacyLocation;
  }

  public void setLegacyLocation(Integer legacyLocation) {
    this.legacyLocation = legacyLocation;
  }

  public Tenant oneClickUri(String oneClickUri) {
    this.oneClickUri = oneClickUri;
    return this;
  }

   /**
   * 
   * @return oneClickUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOneClickUri() {
    return oneClickUri;
  }

  public void setOneClickUri(String oneClickUri) {
    this.oneClickUri = oneClickUri;
  }

  public Tenant stbGatewayNetworkMemberId(String stbGatewayNetworkMemberId) {
    this.stbGatewayNetworkMemberId = stbGatewayNetworkMemberId;
    return this;
  }

   /**
   * 
   * @return stbGatewayNetworkMemberId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStbGatewayNetworkMemberId() {
    return stbGatewayNetworkMemberId;
  }

  public void setStbGatewayNetworkMemberId(String stbGatewayNetworkMemberId) {
    this.stbGatewayNetworkMemberId = stbGatewayNetworkMemberId;
  }

  public Tenant tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return tenantId
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public Tenant admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return admin
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public Tenant closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * 
   * @return closed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public Tenant id(String id) {
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

  public Tenant customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return customerNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public Tenant externalTenants(ExternalTenantId externalTenants) {
    this.externalTenants = externalTenants;
    return this;
  }

   /**
   * Get externalTenants
   * @return externalTenants
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExternalTenantId getExternalTenants() {
    return externalTenants;
  }

  public void setExternalTenants(ExternalTenantId externalTenants) {
    this.externalTenants = externalTenants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenant tenant = (Tenant) o;
    return Objects.equals(this.country, tenant.country) &&
        Objects.equals(this.tenantConfiguration, tenant.tenantConfiguration) &&
        Objects.equals(this.notes, tenant.notes) &&
        Objects.equals(this.legacyLocation, tenant.legacyLocation) &&
        Objects.equals(this.oneClickUri, tenant.oneClickUri) &&
        Objects.equals(this.stbGatewayNetworkMemberId, tenant.stbGatewayNetworkMemberId) &&
        Objects.equals(this.tenantId, tenant.tenantId) &&
        Objects.equals(this.admin, tenant.admin) &&
        Objects.equals(this.closed, tenant.closed) &&
        Objects.equals(this.id, tenant.id) &&
        Objects.equals(this.customerNumber, tenant.customerNumber) &&
        Objects.equals(this.externalTenants, tenant.externalTenants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, tenantConfiguration, notes, legacyLocation, oneClickUri, stbGatewayNetworkMemberId, tenantId, admin, closed, id, customerNumber, externalTenants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenant {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    tenantConfiguration: ").append(toIndentedString(tenantConfiguration)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    legacyLocation: ").append(toIndentedString(legacyLocation)).append("\n");
    sb.append("    oneClickUri: ").append(toIndentedString(oneClickUri)).append("\n");
    sb.append("    stbGatewayNetworkMemberId: ").append(toIndentedString(stbGatewayNetworkMemberId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    externalTenants: ").append(toIndentedString(externalTenants)).append("\n");
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

