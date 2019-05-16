package com.bytatech.ayoos.client.appointment.model;

import java.util.Objects;
import com.bytatech.ayoos.client.appointment.model.Syndrome;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultationDetails
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class ConsultationDetails   {
  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("cachable")
  private Boolean cachable = null;

  @JsonProperty("height")
  private Float height = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("symptoms")
  @Valid
  private List<Syndrome> symptoms = null;

  @JsonProperty("typeName")
  private String typeName = null;

  @JsonProperty("weight")
  private Integer weight = null;

  public ConsultationDetails age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(value = "")


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public ConsultationDetails cachable(Boolean cachable) {
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

  public ConsultationDetails height(Float height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")


  public Float getHeight() {
    return height;
  }

  public void setHeight(Float height) {
    this.height = height;
  }

  public ConsultationDetails note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public ConsultationDetails symptoms(List<Syndrome> symptoms) {
    this.symptoms = symptoms;
    return this;
  }

  public ConsultationDetails addSymptomsItem(Syndrome symptomsItem) {
    if (this.symptoms == null) {
      this.symptoms = new ArrayList<Syndrome>();
    }
    this.symptoms.add(symptomsItem);
    return this;
  }

  /**
   * Get symptoms
   * @return symptoms
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Syndrome> getSymptoms() {
    return symptoms;
  }

  public void setSymptoms(List<Syndrome> symptoms) {
    this.symptoms = symptoms;
  }

  public ConsultationDetails typeName(String typeName) {
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

  public ConsultationDetails weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")


  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
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
    ConsultationDetails consultationDetails = (ConsultationDetails) o;
    return Objects.equals(this.age, consultationDetails.age) &&
        Objects.equals(this.cachable, consultationDetails.cachable) &&
        Objects.equals(this.height, consultationDetails.height) &&
        Objects.equals(this.note, consultationDetails.note) &&
        Objects.equals(this.symptoms, consultationDetails.symptoms) &&
        Objects.equals(this.typeName, consultationDetails.typeName) &&
        Objects.equals(this.weight, consultationDetails.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, cachable, height, note, symptoms, typeName, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultationDetails {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    cachable: ").append(toIndentedString(cachable)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    symptoms: ").append(toIndentedString(symptoms)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

