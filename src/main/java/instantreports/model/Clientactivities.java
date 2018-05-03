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
import instantreports.model.ActivityApi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * Clientactivities
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Clientactivities   {
  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("activities")
  private List<ActivityApi> activities = new ArrayList<ActivityApi>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("startCalculationDate")
  private LocalDate startCalculationDate = null;

  public Clientactivities clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   *  (filterable)
   * @return clientId
  **/
  @ApiModelProperty(example = "null", value = " (filterable)")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Clientactivities activities(List<ActivityApi> activities) {
    this.activities = activities;
    return this;
  }

  public Clientactivities addActivitiesItem(ActivityApi activitiesItem) {
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * Get activities
   * @return activities
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ActivityApi> getActivities() {
    return activities;
  }

  public void setActivities(List<ActivityApi> activities) {
    this.activities = activities;
  }

  public Clientactivities name(String name) {
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

  public Clientactivities id(String id) {
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

  public Clientactivities startCalculationDate(LocalDate startCalculationDate) {
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
    Clientactivities clientactivities = (Clientactivities) o;
    return Objects.equals(this.clientId, clientactivities.clientId) &&
        Objects.equals(this.activities, clientactivities.activities) &&
        Objects.equals(this.name, clientactivities.name) &&
        Objects.equals(this.id, clientactivities.id) &&
        Objects.equals(this.startCalculationDate, clientactivities.startCalculationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, activities, name, id, startCalculationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clientactivities {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
