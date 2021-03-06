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
import instantreports.model.EmployeeActivityApi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * Employeeactivities
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Employeeactivities   {
  @SerializedName("activities")
  private List<EmployeeActivityApi> activities = new ArrayList<EmployeeActivityApi>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("employeeId")
  private String employeeId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("startCalculationDate")
  private LocalDate startCalculationDate = null;

  public Employeeactivities activities(List<EmployeeActivityApi> activities) {
    this.activities = activities;
    return this;
  }

  public Employeeactivities addActivitiesItem(EmployeeActivityApi activitiesItem) {
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * Get activities
   * @return activities
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EmployeeActivityApi> getActivities() {
    return activities;
  }

  public void setActivities(List<EmployeeActivityApi> activities) {
    this.activities = activities;
  }

  public Employeeactivities name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employeeactivities employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   *  (filterable)
   * @return employeeId
  **/
  @ApiModelProperty(example = "null", value = " (filterable)")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public Employeeactivities id(String id) {
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

  public Employeeactivities startCalculationDate(LocalDate startCalculationDate) {
    this.startCalculationDate = startCalculationDate;
    return this;
  }

   /**
   *  (filterable)
   * @return startCalculationDate
  **/
  @ApiModelProperty(example = "null", value = " (filterable)")
  public LocalDate getStartCalculationDate() {
    return startCalculationDate;
  }

  public void setStartCalculationDate(LocalDate startCalculationDate) {
    this.startCalculationDate = startCalculationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employeeactivities employeeactivities = (Employeeactivities) o;
    return Objects.equals(this.activities, employeeactivities.activities) &&
        Objects.equals(this.name, employeeactivities.name) &&
        Objects.equals(this.employeeId, employeeactivities.employeeId) &&
        Objects.equals(this.id, employeeactivities.id) &&
        Objects.equals(this.startCalculationDate, employeeactivities.startCalculationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activities, name, employeeId, id, startCalculationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employeeactivities {\n");
    
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startCalculationDate: ").append(toIndentedString(startCalculationDate)).append("\n");
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

