package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Slot
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-02T14:21:41.979+05:30[Asia/Calcutta]")

public class Slot   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("starTime")
  private Double starTime = null;

  @JsonProperty("toTime")
  private Double toTime = null;

  public Slot date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Slot id(Long id) {
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

  public Slot starTime(Double starTime) {
    this.starTime = starTime;
    return this;
  }

  /**
   * Get starTime
   * @return starTime
  **/
  @ApiModelProperty(value = "")


  public Double getStarTime() {
    return starTime;
  }

  public void setStarTime(Double starTime) {
    this.starTime = starTime;
  }

  public Slot toTime(Double toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * Get toTime
   * @return toTime
  **/
  @ApiModelProperty(value = "")


  public Double getToTime() {
    return toTime;
  }

  public void setToTime(Double toTime) {
    this.toTime = toTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Slot slot = (Slot) o;
    return Objects.equals(this.date, slot.date) &&
        Objects.equals(this.id, slot.id) &&
        Objects.equals(this.starTime, slot.starTime) &&
        Objects.equals(this.toTime, slot.toTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, id, starTime, toTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Slot {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    starTime: ").append(toIndentedString(starTime)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
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

