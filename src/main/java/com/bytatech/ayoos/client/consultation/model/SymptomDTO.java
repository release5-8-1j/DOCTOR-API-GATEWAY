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
 * SymptomDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class SymptomDTO   {
  @JsonProperty("consultationId")
  private Long consultationId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("symptomRef")
  private String symptomRef = null;

  public SymptomDTO consultationId(Long consultationId) {
    this.consultationId = consultationId;
    return this;
  }

  /**
   * Get consultationId
   * @return consultationId
  **/
  @ApiModelProperty(value = "")


  public Long getConsultationId() {
    return consultationId;
  }

  public void setConsultationId(Long consultationId) {
    this.consultationId = consultationId;
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

  public SymptomDTO symptomRef(String symptomRef) {
    this.symptomRef = symptomRef;
    return this;
  }

  /**
   * Get symptomRef
   * @return symptomRef
  **/
  @ApiModelProperty(value = "")


  public String getSymptomRef() {
    return symptomRef;
  }

  public void setSymptomRef(String symptomRef) {
    this.symptomRef = symptomRef;
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
    return Objects.equals(this.consultationId, symptomDTO.consultationId) &&
        Objects.equals(this.id, symptomDTO.id) &&
        Objects.equals(this.symptomRef, symptomDTO.symptomRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultationId, id, symptomRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymptomDTO {\n");
    
    sb.append("    consultationId: ").append(toIndentedString(consultationId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symptomRef: ").append(toIndentedString(symptomRef)).append("\n");
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

