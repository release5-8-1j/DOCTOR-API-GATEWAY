package com.bytatech.ayoos.client.appointment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

//import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AppointmentDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")
//@Document(indexName="appointment")
public class AppointmentDTO   {
  @JsonProperty("appointmentDateAndTime")
  private OffsetDateTime appointmentDateAndTime = null;

  @JsonProperty("appointmentId")
  private String appointmentId = null;

  @JsonProperty("chronicDiseaseRef")
  private String chronicDiseaseRef = null;

  @JsonProperty("consultationInfoId")
  private Long consultationInfoId = null;

  @JsonProperty("doctorId")
  private String doctorId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("patientId")
  private String patientId = null;

  @JsonProperty("statusId")
  private Long statusId = null;

  @JsonProperty("timingId")
  private Long timingId = null;

  @JsonProperty("trackingId")
  private String trackingId = null;

  public AppointmentDTO appointmentDateAndTime(OffsetDateTime appointmentDateAndTime) {
    this.appointmentDateAndTime = appointmentDateAndTime;
    return this;
  }

  /**
   * Get appointmentDateAndTime
   * @return appointmentDateAndTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getAppointmentDateAndTime() {
    return appointmentDateAndTime;
  }

  public void setAppointmentDateAndTime(OffsetDateTime appointmentDateAndTime) {
    this.appointmentDateAndTime = appointmentDateAndTime;
  }

  public AppointmentDTO appointmentId(String appointmentId) {
    this.appointmentId = appointmentId;
    return this;
  }

  /**
   * Get appointmentId
   * @return appointmentId
  **/
  @ApiModelProperty(value = "")


  public String getAppointmentId() {
    return appointmentId;
  }

  public void setAppointmentId(String appointmentId) {
    this.appointmentId = appointmentId;
  }

  public AppointmentDTO chronicDiseaseRef(String chronicDiseaseRef) {
    this.chronicDiseaseRef = chronicDiseaseRef;
    return this;
  }

  /**
   * Get chronicDiseaseRef
   * @return chronicDiseaseRef
  **/
  @ApiModelProperty(value = "")


  public String getChronicDiseaseRef() {
    return chronicDiseaseRef;
  }

  public void setChronicDiseaseRef(String chronicDiseaseRef) {
    this.chronicDiseaseRef = chronicDiseaseRef;
  }

  public AppointmentDTO consultationInfoId(Long consultationInfoId) {
    this.consultationInfoId = consultationInfoId;
    return this;
  }

  /**
   * Get consultationInfoId
   * @return consultationInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getConsultationInfoId() {
    return consultationInfoId;
  }

  public void setConsultationInfoId(Long consultationInfoId) {
    this.consultationInfoId = consultationInfoId;
  }

  public AppointmentDTO doctorId(String doctorId) {
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

  public AppointmentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AppointmentDTO note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public AppointmentDTO patientId(String patientId) {
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

  public AppointmentDTO statusId(Long statusId) {
    this.statusId = statusId;
    return this;
  }

  /**
   * Get statusId
   * @return statusId
  **/
  @ApiModelProperty(value = "")


  public Long getStatusId() {
    return statusId;
  }

  public void setStatusId(Long statusId) {
    this.statusId = statusId;
  }

  public AppointmentDTO timingId(Long timingId) {
    this.timingId = timingId;
    return this;
  }

  /**
   * Get timingId
   * @return timingId
  **/
  @ApiModelProperty(value = "")


  public Long getTimingId() {
    return timingId;
  }

  public void setTimingId(Long timingId) {
    this.timingId = timingId;
  }

  public AppointmentDTO trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  /**
   * Get trackingId
   * @return trackingId
  **/
  @ApiModelProperty(value = "")


  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentDTO appointmentDTO = (AppointmentDTO) o;
    return Objects.equals(this.appointmentDateAndTime, appointmentDTO.appointmentDateAndTime) &&
        Objects.equals(this.appointmentId, appointmentDTO.appointmentId) &&
        Objects.equals(this.chronicDiseaseRef, appointmentDTO.chronicDiseaseRef) &&
        Objects.equals(this.consultationInfoId, appointmentDTO.consultationInfoId) &&
        Objects.equals(this.doctorId, appointmentDTO.doctorId) &&
        Objects.equals(this.id, appointmentDTO.id) &&
        Objects.equals(this.note, appointmentDTO.note) &&
        Objects.equals(this.patientId, appointmentDTO.patientId) &&
        Objects.equals(this.statusId, appointmentDTO.statusId) &&
        Objects.equals(this.timingId, appointmentDTO.timingId) &&
        Objects.equals(this.trackingId, appointmentDTO.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentDateAndTime, appointmentId, chronicDiseaseRef, consultationInfoId, doctorId, id, note, patientId, statusId, timingId, trackingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentDTO {\n");
    
    sb.append("    appointmentDateAndTime: ").append(toIndentedString(appointmentDateAndTime)).append("\n");
    sb.append("    appointmentId: ").append(toIndentedString(appointmentId)).append("\n");
    sb.append("    chronicDiseaseRef: ").append(toIndentedString(chronicDiseaseRef)).append("\n");
    sb.append("    consultationInfoId: ").append(toIndentedString(consultationInfoId)).append("\n");
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    timingId: ").append(toIndentedString(timingId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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

