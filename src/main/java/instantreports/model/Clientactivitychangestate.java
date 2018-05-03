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
 * Clientactivitychangestate
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:33:53.199+02:00")
public class Clientactivitychangestate   {
  @SerializedName("processChainPosition")
  private Long processChainPosition = null;

  @SerializedName("serviceAgreementId")
  private String serviceAgreementId = null;

  @SerializedName("isClientProposedState")
  private Boolean isClientProposedState = null;

  @SerializedName("processOriginId")
  private String processOriginId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("taskId")
  private Long taskId = null;

  @SerializedName("newState")
  private Integer newState = null;

  public Clientactivitychangestate processChainPosition(Long processChainPosition) {
    this.processChainPosition = processChainPosition;
    return this;
  }

   /**
   * 
   * @return processChainPosition
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getProcessChainPosition() {
    return processChainPosition;
  }

  public void setProcessChainPosition(Long processChainPosition) {
    this.processChainPosition = processChainPosition;
  }

  public Clientactivitychangestate serviceAgreementId(String serviceAgreementId) {
    this.serviceAgreementId = serviceAgreementId;
    return this;
  }

   /**
   * 
   * @return serviceAgreementId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getServiceAgreementId() {
    return serviceAgreementId;
  }

  public void setServiceAgreementId(String serviceAgreementId) {
    this.serviceAgreementId = serviceAgreementId;
  }

  public Clientactivitychangestate isClientProposedState(Boolean isClientProposedState) {
    this.isClientProposedState = isClientProposedState;
    return this;
  }

   /**
   * 
   * @return isClientProposedState
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getIsClientProposedState() {
    return isClientProposedState;
  }

  public void setIsClientProposedState(Boolean isClientProposedState) {
    this.isClientProposedState = isClientProposedState;
  }

  public Clientactivitychangestate processOriginId(String processOriginId) {
    this.processOriginId = processOriginId;
    return this;
  }

   /**
   * 
   * @return processOriginId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getProcessOriginId() {
    return processOriginId;
  }

  public void setProcessOriginId(String processOriginId) {
    this.processOriginId = processOriginId;
  }

  public Clientactivitychangestate id(String id) {
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

  public Clientactivitychangestate taskId(Long taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * 
   * @return taskId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }

  public Clientactivitychangestate newState(Integer newState) {
    this.newState = newState;
    return this;
  }

   /**
   * 
   * @return newState
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getNewState() {
    return newState;
  }

  public void setNewState(Integer newState) {
    this.newState = newState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clientactivitychangestate clientactivitychangestate = (Clientactivitychangestate) o;
    return Objects.equals(this.processChainPosition, clientactivitychangestate.processChainPosition) &&
        Objects.equals(this.serviceAgreementId, clientactivitychangestate.serviceAgreementId) &&
        Objects.equals(this.isClientProposedState, clientactivitychangestate.isClientProposedState) &&
        Objects.equals(this.processOriginId, clientactivitychangestate.processOriginId) &&
        Objects.equals(this.id, clientactivitychangestate.id) &&
        Objects.equals(this.taskId, clientactivitychangestate.taskId) &&
        Objects.equals(this.newState, clientactivitychangestate.newState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processChainPosition, serviceAgreementId, isClientProposedState, processOriginId, id, taskId, newState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clientactivitychangestate {\n");
    
    sb.append("    processChainPosition: ").append(toIndentedString(processChainPosition)).append("\n");
    sb.append("    serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
    sb.append("    isClientProposedState: ").append(toIndentedString(isClientProposedState)).append("\n");
    sb.append("    processOriginId: ").append(toIndentedString(processOriginId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    newState: ").append(toIndentedString(newState)).append("\n");
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
