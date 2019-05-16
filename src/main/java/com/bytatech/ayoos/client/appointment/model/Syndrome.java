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
 * Syndrome
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class Syndrome   {
  @JsonProperty("cachable")
  private Boolean cachable = null;

  @JsonProperty("numberOfDaysSuffering")
  private String numberOfDaysSuffering = null;

  @JsonProperty("symptomRef")
  private String symptomRef = null;

  @JsonProperty("typeName")
  private String typeName = null;

  public Syndrome cachable(Boolean cachable) {
    this.cachable = cachable;
    return this;
  }

  /**
   * Get cachable
   * @return cachable
  **/
  @ApiModelProperty(value = "")


  public Boolean isCachable() {
    return cachable;
  }

  public void setCachable(Boolean cachable) {
    this.cachable = cachable;
  }

  public Syndrome numberOfDaysSuffering(String numberOfDaysSuffering) {
    this.numberOfDaysSuffering = numberOfDaysSuffering;
    return this;
  }

  /**
   * Get numberOfDaysSuffering
   * @return numberOfDaysSuffering
  **/
  @ApiModelProperty(value = "")


  public String getNumberOfDaysSuffering() {
    return numberOfDaysSuffering;
  }

  public void setNumberOfDaysSuffering(String numberOfDaysSuffering) {
    this.numberOfDaysSuffering = numberOfDaysSuffering;
  }

  public Syndrome symptomRef(String symptomRef) {
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

  public Syndrome typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Get typeName
   * @return typeName
  **/
  @ApiModelProperty(value = "")


  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Syndrome syndrome = (Syndrome) o;
    return Objects.equals(this.cachable, syndrome.cachable) &&
        Objects.equals(this.numberOfDaysSuffering, syndrome.numberOfDaysSuffering) &&
        Objects.equals(this.symptomRef, syndrome.symptomRef) &&
        Objects.equals(this.typeName, syndrome.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachable, numberOfDaysSuffering, symptomRef, typeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Syndrome {\n");
    
    sb.append("    cachable: ").append(toIndentedString(cachable)).append("\n");
    sb.append("    numberOfDaysSuffering: ").append(toIndentedString(numberOfDaysSuffering)).append("\n");
    sb.append("    symptomRef: ").append(toIndentedString(symptomRef)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

