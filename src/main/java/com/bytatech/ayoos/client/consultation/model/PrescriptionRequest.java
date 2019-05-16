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
 * PrescriptionRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class PrescriptionRequest   {
  @JsonProperty("dose")
  private String dose = null;

  @JsonProperty("drug")
  private String drug = null;

  @JsonProperty("frequency")
  private String frequency = null;

  @JsonProperty("period")
  private String period = null;

  public PrescriptionRequest dose(String dose) {
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

  public PrescriptionRequest drug(String drug) {
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

  public PrescriptionRequest frequency(String frequency) {
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

  public PrescriptionRequest period(String period) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrescriptionRequest prescriptionRequest = (PrescriptionRequest) o;
    return Objects.equals(this.dose, prescriptionRequest.dose) &&
        Objects.equals(this.drug, prescriptionRequest.drug) &&
        Objects.equals(this.frequency, prescriptionRequest.frequency) &&
        Objects.equals(this.period, prescriptionRequest.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dose, drug, frequency, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrescriptionRequest {\n");
    
    sb.append("    dose: ").append(toIndentedString(dose)).append("\n");
    sb.append("    drug: ").append(toIndentedString(drug)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

