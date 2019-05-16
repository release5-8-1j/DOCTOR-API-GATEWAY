package com.bytatech.ayoos.client.consultation.model;

import java.util.Objects;
import com.bytatech.ayoos.client.consultation.model.RestVariable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HistoricProcessInstanceResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class HistoricProcessInstanceResponse   {
  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("deleteReason")
  private String deleteReason = null;

  @JsonProperty("durationInMillis")
  private Long durationInMillis = null;

  @JsonProperty("endActivityId")
  private String endActivityId = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionUrl")
  private String processDefinitionUrl = null;

  @JsonProperty("startActivityId")
  private String startActivityId = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("startUserId")
  private String startUserId = null;

  @JsonProperty("superProcessInstanceId")
  private String superProcessInstanceId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("variables")
  @Valid
  private List<RestVariable> variables = null;

  public HistoricProcessInstanceResponse businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * Get businessKey
   * @return businessKey
  **/
  @ApiModelProperty(value = "")


  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public HistoricProcessInstanceResponse deleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
    return this;
  }

  /**
   * Get deleteReason
   * @return deleteReason
  **/
  @ApiModelProperty(value = "")


  public String getDeleteReason() {
    return deleteReason;
  }

  public void setDeleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
  }

  public HistoricProcessInstanceResponse durationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
    return this;
  }

  /**
   * Get durationInMillis
   * @return durationInMillis
  **/
  @ApiModelProperty(value = "")


  public Long getDurationInMillis() {
    return durationInMillis;
  }

  public void setDurationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
  }

  public HistoricProcessInstanceResponse endActivityId(String endActivityId) {
    this.endActivityId = endActivityId;
    return this;
  }

  /**
   * Get endActivityId
   * @return endActivityId
  **/
  @ApiModelProperty(value = "")


  public String getEndActivityId() {
    return endActivityId;
  }

  public void setEndActivityId(String endActivityId) {
    this.endActivityId = endActivityId;
  }

  public HistoricProcessInstanceResponse endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public HistoricProcessInstanceResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricProcessInstanceResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HistoricProcessInstanceResponse processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Get processDefinitionId
   * @return processDefinitionId
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricProcessInstanceResponse processDefinitionUrl(String processDefinitionUrl) {
    this.processDefinitionUrl = processDefinitionUrl;
    return this;
  }

  /**
   * Get processDefinitionUrl
   * @return processDefinitionUrl
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionUrl() {
    return processDefinitionUrl;
  }

  public void setProcessDefinitionUrl(String processDefinitionUrl) {
    this.processDefinitionUrl = processDefinitionUrl;
  }

  public HistoricProcessInstanceResponse startActivityId(String startActivityId) {
    this.startActivityId = startActivityId;
    return this;
  }

  /**
   * Get startActivityId
   * @return startActivityId
  **/
  @ApiModelProperty(value = "")


  public String getStartActivityId() {
    return startActivityId;
  }

  public void setStartActivityId(String startActivityId) {
    this.startActivityId = startActivityId;
  }

  public HistoricProcessInstanceResponse startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public HistoricProcessInstanceResponse startUserId(String startUserId) {
    this.startUserId = startUserId;
    return this;
  }

  /**
   * Get startUserId
   * @return startUserId
  **/
  @ApiModelProperty(value = "")


  public String getStartUserId() {
    return startUserId;
  }

  public void setStartUserId(String startUserId) {
    this.startUserId = startUserId;
  }

  public HistoricProcessInstanceResponse superProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
    return this;
  }

  /**
   * Get superProcessInstanceId
   * @return superProcessInstanceId
  **/
  @ApiModelProperty(value = "")


  public String getSuperProcessInstanceId() {
    return superProcessInstanceId;
  }

  public void setSuperProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
  }

  public HistoricProcessInstanceResponse tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")


  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricProcessInstanceResponse url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public HistoricProcessInstanceResponse variables(List<RestVariable> variables) {
    this.variables = variables;
    return this;
  }

  public HistoricProcessInstanceResponse addVariablesItem(RestVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<RestVariable>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RestVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<RestVariable> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricProcessInstanceResponse historicProcessInstanceResponse = (HistoricProcessInstanceResponse) o;
    return Objects.equals(this.businessKey, historicProcessInstanceResponse.businessKey) &&
        Objects.equals(this.deleteReason, historicProcessInstanceResponse.deleteReason) &&
        Objects.equals(this.durationInMillis, historicProcessInstanceResponse.durationInMillis) &&
        Objects.equals(this.endActivityId, historicProcessInstanceResponse.endActivityId) &&
        Objects.equals(this.endTime, historicProcessInstanceResponse.endTime) &&
        Objects.equals(this.id, historicProcessInstanceResponse.id) &&
        Objects.equals(this.name, historicProcessInstanceResponse.name) &&
        Objects.equals(this.processDefinitionId, historicProcessInstanceResponse.processDefinitionId) &&
        Objects.equals(this.processDefinitionUrl, historicProcessInstanceResponse.processDefinitionUrl) &&
        Objects.equals(this.startActivityId, historicProcessInstanceResponse.startActivityId) &&
        Objects.equals(this.startTime, historicProcessInstanceResponse.startTime) &&
        Objects.equals(this.startUserId, historicProcessInstanceResponse.startUserId) &&
        Objects.equals(this.superProcessInstanceId, historicProcessInstanceResponse.superProcessInstanceId) &&
        Objects.equals(this.tenantId, historicProcessInstanceResponse.tenantId) &&
        Objects.equals(this.url, historicProcessInstanceResponse.url) &&
        Objects.equals(this.variables, historicProcessInstanceResponse.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessKey, deleteReason, durationInMillis, endActivityId, endTime, id, name, processDefinitionId, processDefinitionUrl, startActivityId, startTime, startUserId, superProcessInstanceId, tenantId, url, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricProcessInstanceResponse {\n");
    
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
    sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
    sb.append("    endActivityId: ").append(toIndentedString(endActivityId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionUrl: ").append(toIndentedString(processDefinitionUrl)).append("\n");
    sb.append("    startActivityId: ").append(toIndentedString(startActivityId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startUserId: ").append(toIndentedString(startUserId)).append("\n");
    sb.append("    superProcessInstanceId: ").append(toIndentedString(superProcessInstanceId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

