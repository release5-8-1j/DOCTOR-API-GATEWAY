package com.bytatech.ayoos.client.appointment.model;

import java.util.Objects;
import com.bytatech.ayoos.client.appointment.model.PatientInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AppointmentDetails
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class AppointmentDetails   {
  @JsonProperty("appointmentDateAndTime")
  private String appointmentDateAndTime = null;

  @JsonProperty("appointmentID")
  private String appointmentID = null;

  @JsonProperty("cachable")
  private Boolean cachable = null;

  @JsonProperty("patientInfo")
  private PatientInfo patientInfo = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("trackingID")
  private String trackingID = null;

  @JsonProperty("typeName")
  private String typeName = null;

  public AppointmentDetails appointmentDateAndTime(String appointmentDateAndTime) {
    this.appointmentDateAndTime = appointmentDateAndTime;
    return this;
  }

  /**
   * Get appointmentDateAndTime
   * @return appointmentDateAndTime
  **/
  @ApiModelProperty(value = "")


  public String getAppointmentDateAndTime() {
    return appointmentDateAndTime;
  }

  public void setAppointmentDateAndTime(String appointmentDateAndTime) {
    this.appointmentDateAndTime = appointmentDateAndTime;
  }

  public AppointmentDetails appointmentID(String appointmentID) {
    this.appointmentID = appointmentID;
    return this;
  }

  /**
   * Get appointmentID
   * @return appointmentID
  **/
  @ApiModelProperty(value = "")


  public String getAppointmentID() {
    return appointmentID;
  }

  public void setAppointmentID(String appointmentID) {
    this.appointmentID = appointmentID;
  }

  public AppointmentDetails cachable(Boolean cachable) {
    this.cachable = cachable;
    return this;
  }

  /**
   * Get cachable
   * @return cachable
  **/
  @ApiModelProperty(value = "")


  public Boolean isCachable() {
    return cachable;
  }

  public void setCachable(Boolean cachable) {
    this.cachable = cachable;
  }

  public AppointmentDetails patientInfo(PatientInfo patientInfo) {
    this.patientInfo = patientInfo;
    return this;
  }

  /**
   * Get patientInfo
   * @return patientInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PatientInfo getPatientInfo() {
    return patientInfo;
  }

  public void setPatientInfo(PatientInfo patientInfo) {
    this.patientInfo = patientInfo;
  }

  public AppointmentDetails status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AppointmentDetails trackingID(String trackingID) {
    this.trackingID = trackingID;
    return this;
  }

  /**
   * Get trackingID
   * @return trackingID
  **/
  @ApiModelProperty(value = "")


  public String getTrackingID() {
    return trackingID;
  }

  public void setTrackingID(String trackingID) {
    this.trackingID = trackingID;
  }

  public AppointmentDetails typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Get typeName
   * @return typeName
  **/
  @ApiModelProperty(value = "")


  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentDetails appointmentDetails = (AppointmentDetails) o;
    return Objects.equals(this.appointmentDateAndTime, appointmentDetails.appointmentDateAndTime) &&
        Objects.equals(this.appointmentID, appointmentDetails.appointmentID) &&
        Objects.equals(this.cachable, appointmentDetails.cachable) &&
        Objects.equals(this.patientInfo, appointmentDetails.patientInfo) &&
        Objects.equals(this.status, appointmentDetails.status) &&
        Objects.equals(this.trackingID, appointmentDetails.trackingID) &&
        Objects.equals(this.typeName, appointmentDetails.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentDateAndTime, appointmentID, cachable, patientInfo, status, trackingID, typeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentDetails {\n");
    
    sb.append("    appointmentDateAndTime: ").append(toIndentedString(appointmentDateAndTime)).append("\n");
    sb.append("    appointmentID: ").append(toIndentedString(appointmentID)).append("\n");
    sb.append("    cachable: ").append(toIndentedString(cachable)).append("\n");
    sb.append("    patientInfo: ").append(toIndentedString(patientInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingID: ").append(toIndentedString(trackingID)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

