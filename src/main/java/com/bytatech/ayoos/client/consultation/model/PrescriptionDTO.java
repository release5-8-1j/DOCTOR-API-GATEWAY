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
 * PrescriptionDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class PrescriptionDTO   {
  @JsonProperty("dose")
  private String dose = null;

  @JsonProperty("drug")
  private String drug = null;

  @JsonProperty("frequency")
  private String frequency = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("period")
  private String period = null;

  @JsonProperty("prescriptionDMSURL")
  private String prescriptionDMSURL = null;

  public PrescriptionDTO dose(String dose) {
    this.dose = dose;
    return this;
  }

  /**
   * Get dose
   * @return dose
  **/
  @ApiModelProperty(value = "")


  public String getDose() {
    return dose;
  }

  public void setDose(String dose) {
    this.dose = dose;
  }

  public PrescriptionDTO drug(String drug) {
    this.drug = drug;
    return this;
  }

  /**
   * Get drug
   * @return drug
  **/
  @ApiModelProperty(value = "")


  public String getDrug() {
    return drug;
  }

  public void setDrug(String drug) {
    this.drug = drug;
  }

  public PrescriptionDTO frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")


  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public PrescriptionDTO id(Long id) {
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

  public PrescriptionDTO period(String period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")


  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public PrescriptionDTO prescriptionDMSURL(String prescriptionDMSURL) {
    this.prescriptionDMSURL = prescriptionDMSURL;
    return this;
  }

  /**
   * Get prescriptionDMSURL
   * @return prescriptionDMSURL
  **/
  @ApiModelProperty(value = "")


  public String getPrescriptionDMSURL() {
    return prescriptionDMSURL;
  }

  public void setPrescriptionDMSURL(String prescriptionDMSURL) {
    this.prescriptionDMSURL = prescriptionDMSURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrescriptionDTO prescriptionDTO = (PrescriptionDTO) o;
    return Objects.equals(this.dose, prescriptionDTO.dose) &&
        Objects.equals(this.drug, prescriptionDTO.drug) &&
        Objects.equals(this.frequency, prescriptionDTO.frequency) &&
        Objects.equals(this.id, prescriptionDTO.id) &&
        Objects.equals(this.period, prescriptionDTO.period) &&
        Objects.equals(this.prescriptionDMSURL, prescriptionDTO.prescriptionDMSURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dose, drug, frequency, id, period, prescriptionDMSURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrescriptionDTO {\n");
    
    sb.append("    dose: ").append(toIndentedString(dose)).append("\n");
    sb.append("    drug: ").append(toIndentedString(drug)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    prescriptionDMSURL: ").append(toIndentedString(prescriptionDMSURL)).append("\n");
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

