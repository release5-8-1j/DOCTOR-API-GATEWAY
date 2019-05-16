package com.bytatech.ayoos.client.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultationRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class ConsultationRequest   {
  @JsonProperty("date")
  @JsonFormat(pattern = "MM-dd-yyyy hh:mm")
  private Date date = null;

  @JsonProperty("evaluation")
  @Valid
  private List<String> evaluation = null;

  @JsonProperty("examinationRequired")
  private String examinationRequired = null;

  @JsonProperty("labResultDMSURL")
  private String labResultDMSURL = null;

  @JsonProperty("symptom")
  @Valid
  private List<String> symptom = null;

  public ConsultationRequest date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public ConsultationRequest evaluation(List<String> evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  public ConsultationRequest addEvaluationItem(String evaluationItem) {
    if (this.evaluation == null) {
      this.evaluation = new ArrayList<String>();
    }
    this.evaluation.add(evaluationItem);
    return this;
  }

  /**
   * Get evaluation
   * @return evaluation
  **/
  @ApiModelProperty(value = "")


  public List<String> getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(List<String> evaluation) {
    this.evaluation = evaluation;
  }

  public ConsultationRequest examinationRequired(String examinationRequired) {
    this.examinationRequired = examinationRequired;
    return this;
  }

  /**
   * Get examinationRequired
   * @return examinationRequired
  **/
  @ApiModelProperty(value = "")


  public String getExaminationRequired() {
    return examinationRequired;
  }

  public void setExaminationRequired(String examinationRequired) {
    this.examinationRequired = examinationRequired;
  }

  public ConsultationRequest labResultDMSURL(String labResultDMSURL) {
    this.labResultDMSURL = labResultDMSURL;
    return this;
  }

  /**
   * Get labResultDMSURL
   * @return labResultDMSURL
  **/
  @ApiModelProperty(value = "")


  public String getLabResultDMSURL() {
    return labResultDMSURL;
  }

  public void setLabResultDMSURL(String labResultDMSURL) {
    this.labResultDMSURL = labResultDMSURL;
  }

  public ConsultationRequest symptom(List<String> symptom) {
    this.symptom = symptom;
    return this;
  }

  public ConsultationRequest addSymptomItem(String symptomItem) {
    if (this.symptom == null) {
      this.symptom = new ArrayList<String>();
    }
    this.symptom.add(symptomItem);
    return this;
  }

  /**
   * Get symptom
   * @return symptom
  **/
  @ApiModelProperty(value = "")


  public List<String> getSymptom() {
    return symptom;
  }

  public void setSymptom(List<String> symptom) {
    this.symptom = symptom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultationRequest consultationRequest = (ConsultationRequest) o;
    return Objects.equals(this.date, consultationRequest.date) &&
        Objects.equals(this.evaluation, consultationRequest.evaluation) &&
        Objects.equals(this.examinationRequired, consultationRequest.examinationRequired) &&
        Objects.equals(this.labResultDMSURL, consultationRequest.labResultDMSURL) &&
        Objects.equals(this.symptom, consultationRequest.symptom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, evaluation, examinationRequired, labResultDMSURL, symptom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultationRequest {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    examinationRequired: ").append(toIndentedString(examinationRequired)).append("\n");
    sb.append("    labResultDMSURL: ").append(toIndentedString(labResultDMSURL)).append("\n");
    sb.append("    symptom: ").append(toIndentedString(symptom)).append("\n");
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

