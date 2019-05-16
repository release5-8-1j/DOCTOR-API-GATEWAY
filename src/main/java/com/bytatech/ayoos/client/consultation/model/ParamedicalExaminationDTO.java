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
 * ParamedicalExaminationDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class ParamedicalExaminationDTO   {
  @JsonProperty("bp")
  private String bp = null;

  @JsonProperty("height")
  private Double height = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("temperature")
  private Double temperature = null;

  @JsonProperty("weight")
  private Double weight = null;

  public ParamedicalExaminationDTO bp(String bp) {
    this.bp = bp;
    return this;
  }

  /**
   * Get bp
   * @return bp
  **/
  @ApiModelProperty(value = "")


  public String getBp() {
    return bp;
  }

  public void setBp(String bp) {
    this.bp = bp;
  }

  public ParamedicalExaminationDTO height(Double height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")


  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public ParamedicalExaminationDTO id(Long id) {
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

  public ParamedicalExaminationDTO temperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * @return temperature
  **/
  @ApiModelProperty(value = "")


  public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }

  public ParamedicalExaminationDTO weight(Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")


  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParamedicalExaminationDTO paramedicalExaminationDTO = (ParamedicalExaminationDTO) o;
    return Objects.equals(this.bp, paramedicalExaminationDTO.bp) &&
        Objects.equals(this.height, paramedicalExaminationDTO.height) &&
        Objects.equals(this.id, paramedicalExaminationDTO.id) &&
        Objects.equals(this.temperature, paramedicalExaminationDTO.temperature) &&
        Objects.equals(this.weight, paramedicalExaminationDTO.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bp, height, id, temperature, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParamedicalExaminationDTO {\n");
    
    sb.append("    bp: ").append(toIndentedString(bp)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

