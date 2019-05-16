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
 * DiagnosisDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class DiagnosisDTO   {
  @JsonProperty("diagnosisRef")
  private String diagnosisRef = null;

  @JsonProperty("id")
  private Long id = null;

  public DiagnosisDTO diagnosisRef(String diagnosisRef) {
    this.diagnosisRef = diagnosisRef;
    return this;
  }

  /**
   * Get diagnosisRef
   * @return diagnosisRef
  **/
  @ApiModelProperty(value = "")


  public String getDiagnosisRef() {
    return diagnosisRef;
  }

  public void setDiagnosisRef(String diagnosisRef) {
    this.diagnosisRef = diagnosisRef;
  }

  public DiagnosisDTO id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosisDTO diagnosisDTO = (DiagnosisDTO) o;
    return Objects.equals(this.diagnosisRef, diagnosisDTO.diagnosisRef) &&
        Objects.equals(this.id, diagnosisDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnosisRef, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosisDTO {\n");
    
    sb.append("    diagnosisRef: ").append(toIndentedString(diagnosisRef)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

