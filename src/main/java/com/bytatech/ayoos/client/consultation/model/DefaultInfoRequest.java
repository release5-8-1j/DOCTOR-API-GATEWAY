package com.bytatech.ayoos.client.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DefaultInfoRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class DefaultInfoRequest   {
  @JsonProperty("doctorId")
  private String doctorId = null;

  @JsonProperty("paramedRequired")
  private String paramedRequired = null;

  @JsonProperty("patientId")
  private String patientId = null;

  public DefaultInfoRequest doctorId(String doctorId) {
    this.doctorId = doctorId;
    return this;
  }

  /**
   * Get doctorId
   * @return doctorId
  **/
  @ApiModelProperty(value = "")


  public String getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(String doctorId) {
    this.doctorId = doctorId;
  }

  public DefaultInfoRequest paramedRequired(String paramedRequired) {
    this.paramedRequired = paramedRequired;
    return this;
  }

  /**
   * Get paramedRequired
   * @return paramedRequired
  **/
  @ApiModelProperty(value = "")


  public String getParamedRequired() {
    return paramedRequired;
  }

  public void setParamedRequired(String paramedRequired) {
    this.paramedRequired = paramedRequired;
  }

  public DefaultInfoRequest patientId(String patientId) {
    this.patientId = patientId;
    return this;
  }

  /**
   * Get patientId
   * @return patientId
  **/
  @ApiModelProperty(value = "")


  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultInfoRequest defaultInfoRequest = (DefaultInfoRequest) o;
    return Objects.equals(this.doctorId, defaultInfoRequest.doctorId) &&
        Objects.equals(this.paramedRequired, defaultInfoRequest.paramedRequired) &&
        Objects.equals(this.patientId, defaultInfoRequest.patientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doctorId, paramedRequired, patientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultInfoRequest {\n");
    
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    paramedRequired: ").append(toIndentedString(paramedRequired)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
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

