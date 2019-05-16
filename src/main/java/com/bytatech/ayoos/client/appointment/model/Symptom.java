package com.bytatech.ayoos.client.appointment.model;

import java.util.Objects;
import com.bytatech.ayoos.client.appointment.model.ConsultationInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Symptom
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class Symptom   {
  @JsonProperty("consultationInfo")
  private ConsultationInfo consultationInfo = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("numberOfDaysSuffering")
  private Integer numberOfDaysSuffering = null;

  @JsonProperty("ref")
  private String ref = null;

  public Symptom consultationInfo(ConsultationInfo consultationInfo) {
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

  public Symptom id(Long id) {
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

  public Symptom numberOfDaysSuffering(Integer numberOfDaysSuffering) {
    this.numberOfDaysSuffering = numberOfDaysSuffering;
    return this;
  }

  /**
   * Get numberOfDaysSuffering
   * @return numberOfDaysSuffering
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfDaysSuffering() {
    return numberOfDaysSuffering;
  }

  public void setNumberOfDaysSuffering(Integer numberOfDaysSuffering) {
    this.numberOfDaysSuffering = numberOfDaysSuffering;
  }

  public Symptom ref(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   * @return ref
  **/
  @ApiModelProperty(value = "")


  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Symptom symptom = (Symptom) o;
    return Objects.equals(this.consultationInfo, symptom.consultationInfo) &&
        Objects.equals(this.id, symptom.id) &&
        Objects.equals(this.numberOfDaysSuffering, symptom.numberOfDaysSuffering) &&
        Objects.equals(this.ref, symptom.ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultationInfo, id, numberOfDaysSuffering, ref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Symptom {\n");
    
    sb.append("    consultationInfo: ").append(toIndentedString(consultationInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfDaysSuffering: ").append(toIndentedString(numberOfDaysSuffering)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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

