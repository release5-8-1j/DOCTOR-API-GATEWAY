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
 * ParamedicalExaminationRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class ParamedicalExaminationRequest   {
  @JsonProperty("bp")
  private String bp = null;

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("paramedRef")
  private String paramedRef = null;

  @JsonProperty("temperature")
  private String temperature = null;

  @JsonProperty("weight")
  private String weight = null;

  public ParamedicalExaminationRequest bp(String bp) {
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

  public ParamedicalExaminationRequest height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")


  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public ParamedicalExaminationRequest paramedRef(String paramedRef) {
    this.paramedRef = paramedRef;
    return this;
  }

  /**
   * Get paramedRef
   * @return paramedRef
  **/
  @ApiModelProperty(value = "")


  public String getParamedRef() {
    return paramedRef;
  }

  public void setParamedRef(String paramedRef) {
    this.paramedRef = paramedRef;
  }

  public ParamedicalExaminationRequest temperature(String temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * @return temperature
  **/
  @ApiModelProperty(value = "")


  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }

  public ParamedicalExaminationRequest weight(String weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")


  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
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
    ParamedicalExaminationRequest paramedicalExaminationRequest = (ParamedicalExaminationRequest) o;
    return Objects.equals(this.bp, paramedicalExaminationRequest.bp) &&
        Objects.equals(this.height, paramedicalExaminationRequest.height) &&
        Objects.equals(this.paramedRef, paramedicalExaminationRequest.paramedRef) &&
        Objects.equals(this.temperature, paramedicalExaminationRequest.temperature) &&
        Objects.equals(this.weight, paramedicalExaminationRequest.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bp, height, paramedRef, temperature, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParamedicalExaminationRequest {\n");
    
    sb.append("    bp: ").append(toIndentedString(bp)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    paramedRef: ").append(toIndentedString(paramedRef)).append("\n");
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

