package com.bytatech.ayoos.client.appointment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SymptomDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class SymptomDTO   {
  @JsonProperty("consultationInfoId")
  private Long consultationInfoId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("numberOfDaysSuffering")
  private Integer numberOfDaysSuffering = null;

  @JsonProperty("ref")
  private String ref = null;

  public SymptomDTO consultationInfoId(Long consultationInfoId) {
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

  public SymptomDTO id(Long id) {
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

  public SymptomDTO numberOfDaysSuffering(Integer numberOfDaysSuffering) {
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

  public SymptomDTO ref(String ref) {
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
    SymptomDTO symptomDTO = (SymptomDTO) o;
    return Objects.equals(this.consultationInfoId, symptomDTO.consultationInfoId) &&
        Objects.equals(this.id, symptomDTO.id) &&
        Objects.equals(this.numberOfDaysSuffering, symptomDTO.numberOfDaysSuffering) &&
        Objects.equals(this.ref, symptomDTO.ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultationInfoId, id, numberOfDaysSuffering, ref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymptomDTO {\n");
    
    sb.append("    consultationInfoId: ").append(toIndentedString(consultationInfoId)).append("\n");
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

