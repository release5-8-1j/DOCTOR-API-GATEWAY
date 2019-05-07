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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-07T11:51:39.998+05:30[Asia/Kolkata]")

public class PrescriptionDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("prescriptionDMSURL")
  private String prescriptionDMSURL = null;

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
    return Objects.equals(this.id, prescriptionDTO.id) &&
        Objects.equals(this.prescriptionDMSURL, prescriptionDTO.prescriptionDMSURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, prescriptionDMSURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrescriptionDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

