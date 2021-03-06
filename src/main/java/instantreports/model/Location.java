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
 * Location
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Location   {
  @SerializedName("country")
  private String country = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("countrycode")
  private String countrycode = null;

  @SerializedName("mobile")
  private String mobile = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("mainsite")
  private Boolean mainsite = null;

  @SerializedName("zipcode")
  private String zipcode = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("branche")
  private String branche = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("state")
  private Integer state = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name2")
  private String name2 = null;

  @SerializedName("name1")
  private String name1 = null;

  @SerializedName("telefax")
  private String telefax = null;

  @SerializedName("email")
  private String email = null;

  public Location country(String country) {
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

  public Location city(String city) {
    this.city = city;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return city
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Location countrycode(String countrycode) {
    this.countrycode = countrycode;
    return this;
  }

   /**
   * 
   * @return countrycode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountrycode() {
    return countrycode;
  }

  public void setCountrycode(String countrycode) {
    this.countrycode = countrycode;
  }

  public Location mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return mobile
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public Location type(String type) {
    this.type = type;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return type
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Location mainsite(Boolean mainsite) {
    this.mainsite = mainsite;
    return this;
  }

   /**
   * 
   * @return mainsite
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMainsite() {
    return mainsite;
  }

  public void setMainsite(Boolean mainsite) {
    this.mainsite = mainsite;
  }

  public Location zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

   /**
   * 
   * @return zipcode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public Location phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Location branche(String branche) {
    this.branche = branche;
    return this;
  }

   /**
   * 
   * @return branche
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBranche() {
    return branche;
  }

  public void setBranche(String branche) {
    this.branche = branche;
  }

  public Location street(String street) {
    this.street = street;
    return this;
  }

   /**
   * 
   * @return street
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Location state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * 
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public Location id(String id) {
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

  public Location name2(String name2) {
    this.name2 = name2;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return name2
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  public Location name1(String name1) {
    this.name1 = name1;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return name1
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }

  public Location telefax(String telefax) {
    this.telefax = telefax;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return telefax
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getTelefax() {
    return telefax;
  }

  public void setTelefax(String telefax) {
    this.telefax = telefax;
  }

  public Location email(String email) {
    this.email = email;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return email
  **/
  @ApiModelProperty(example = "null", value = " (filterable/sortable)")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.country, location.country) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.countrycode, location.countrycode) &&
        Objects.equals(this.mobile, location.mobile) &&
        Objects.equals(this.type, location.type) &&
        Objects.equals(this.mainsite, location.mainsite) &&
        Objects.equals(this.zipcode, location.zipcode) &&
        Objects.equals(this.phone, location.phone) &&
        Objects.equals(this.branche, location.branche) &&
        Objects.equals(this.street, location.street) &&
        Objects.equals(this.state, location.state) &&
        Objects.equals(this.id, location.id) &&
        Objects.equals(this.name2, location.name2) &&
        Objects.equals(this.name1, location.name1) &&
        Objects.equals(this.telefax, location.telefax) &&
        Objects.equals(this.email, location.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, city, countrycode, mobile, type, mainsite, zipcode, phone, branche, street, state, id, name2, name1, telefax, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countrycode: ").append(toIndentedString(countrycode)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mainsite: ").append(toIndentedString(mainsite)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    branche: ").append(toIndentedString(branche)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
    sb.append("    name1: ").append(toIndentedString(name1)).append("\n");
    sb.append("    telefax: ").append(toIndentedString(telefax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

