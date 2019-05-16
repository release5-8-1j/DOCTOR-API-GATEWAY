package com.bytatech.ayoos.client.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultationDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class ConsultationDTO   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("diagnosisId")
  private Long diagnosisId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("paramedicalExaminationId")
  private Long paramedicalExaminationId = null;

  @JsonProperty("prescriptionId")
  private Long prescriptionId = null;

  @JsonProperty("trackingId")
  private String trackingId = null;

  public ConsultationDTO date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ConsultationDTO diagnosisId(Long diagnosisId) {
    this.diagnosisId = diagnosisId;
    return this;
  }

  /**
   * Get diagnosisId
   * @return diagnosisId
  **/
  @ApiModelProperty(value = "")


  public Long getDiagnosisId() {
    return diagnosisId;
  }

  public void setDiagnosisId(Long diagnosisId) {
    this.diagnosisId = diagnosisId;
  }

  public ConsultationDTO id(Long id) {
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

  public ConsultationDTO paramedicalExaminationId(Long paramedicalExaminationId) {
    this.paramedicalExaminationId = paramedicalExaminationId;
    return this;
  }

  /**
   * Get paramedicalExaminationId
   * @return paramedicalExaminationId
  **/
  @ApiModelProperty(value = "")


  public Long getParamedicalExaminationId() {
    return paramedicalExaminationId;
  }

  public void setParamedicalExaminationId(Long paramedicalExaminationId) {
    this.paramedicalExaminationId = paramedicalExaminationId;
  }

  public ConsultationDTO prescriptionId(Long prescriptionId) {
    this.prescriptionId = prescriptionId;
    return this;
  }

  /**
   * Get prescriptionId
   * @return prescriptionId
  **/
  @ApiModelProperty(value = "")


  public Long getPrescriptionId() {
    return prescriptionId;
  }

  public void setPrescriptionId(Long prescriptionId) {
    this.prescriptionId = prescriptionId;
  }

  public ConsultationDTO trackingId(String trackingId) {
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
    ConsultationDTO consultationDTO = (ConsultationDTO) o;
    return Objects.equals(this.date, consultationDTO.date) &&
        Objects.equals(this.diagnosisId, consultationDTO.diagnosisId) &&
        Objects.equals(this.id, consultationDTO.id) &&
        Objects.equals(this.paramedicalExaminationId, consultationDTO.paramedicalExaminationId) &&
        Objects.equals(this.prescriptionId, consultationDTO.prescriptionId) &&
        Objects.equals(this.trackingId, consultationDTO.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, diagnosisId, id, paramedicalExaminationId, prescriptionId, trackingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultationDTO {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    diagnosisId: ").append(toIndentedString(diagnosisId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paramedicalExaminationId: ").append(toIndentedString(paramedicalExaminationId)).append("\n");
    sb.append("    prescriptionId: ").append(toIndentedString(prescriptionId)).append("\n");
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

