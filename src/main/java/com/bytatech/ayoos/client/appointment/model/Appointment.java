package com.bytatech.ayoos.client.appointment.model;

import java.util.Objects;
import com.bytatech.ayoos.client.appointment.model.ConsultationInfo;
import com.bytatech.ayoos.client.appointment.model.Status;
import com.bytatech.ayoos.client.appointment.model.Timing;
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
 * Appointment
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")
//@Document(indexName="appointment")
public class Appointment   {
  @JsonProperty("appointmentDateAndTime")
  private OffsetDateTime appointmentDateAndTime = null;

  @JsonProperty("appointmentId")
  private String appointmentId = null;

  @JsonProperty("chronicDiseaseRef")
  private String chronicDiseaseRef = null;

  @JsonProperty("consultationInfo")
  private ConsultationInfo consultationInfo = null;

  @JsonProperty("doctorId")
  private String doctorId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("patientId")
  private String patientId = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("timing")
  private Timing timing = null;

  @JsonProperty("trackingId")
  private String trackingId = null;

  public Appointment appointmentDateAndTime(OffsetDateTime appointmentDateAndTime) {
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

  public Appointment appointmentId(String appointmentId) {
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

  public Appointment chronicDiseaseRef(String chronicDiseaseRef) {
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

  public Appointment consultationInfo(ConsultationInfo consultationInfo) {
    this.consultationInfo = consultationInfo;
    return this;
  }

  /**
   * Get consultationInfo
   * @return consultationInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConsultationInfo getConsultationInfo() {
    return consultationInfo;
  }

  public void setConsultationInfo(ConsultationInfo consultationInfo) {
    this.consultationInfo = consultationInfo;
  }

  public Appointment doctorId(String doctorId) {
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

  public Appointment id(Long id) {
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

  public Appointment note(String note) {
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

  public Appointment patientId(String patientId) {
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

  public Appointment status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Appointment timing(Timing timing) {
    this.timing = timing;
    return this;
  }

  /**
   * Get timing
   * @return timing
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Timing getTiming() {
    return timing;
  }

  public void setTiming(Timing timing) {
    this.timing = timing;
  }

  public Appointment trackingId(String trackingId) {
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
    Appointment appointment = (Appointment) o;
    return Objects.equals(this.appointmentDateAndTime, appointment.appointmentDateAndTime) &&
        Objects.equals(this.appointmentId, appointment.appointmentId) &&
        Objects.equals(this.chronicDiseaseRef, appointment.chronicDiseaseRef) &&
        Objects.equals(this.consultationInfo, appointment.consultationInfo) &&
        Objects.equals(this.doctorId, appointment.doctorId) &&
        Objects.equals(this.id, appointment.id) &&
        Objects.equals(this.note, appointment.note) &&
        Objects.equals(this.patientId, appointment.patientId) &&
        Objects.equals(this.status, appointment.status) &&
        Objects.equals(this.timing, appointment.timing) &&
        Objects.equals(this.trackingId, appointment.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentDateAndTime, appointmentId, chronicDiseaseRef, consultationInfo, doctorId, id, note, patientId, status, timing, trackingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Appointment {\n");
    
    sb.append("    appointmentDateAndTime: ").append(toIndentedString(appointmentDateAndTime)).append("\n");
    sb.append("    appointmentId: ").append(toIndentedString(appointmentId)).append("\n");
    sb.append("    chronicDiseaseRef: ").append(toIndentedString(chronicDiseaseRef)).append("\n");
    sb.append("    consultationInfo: ").append(toIndentedString(consultationInfo)).append("\n");
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timing: ").append(toIndentedString(timing)).append("\n");
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

