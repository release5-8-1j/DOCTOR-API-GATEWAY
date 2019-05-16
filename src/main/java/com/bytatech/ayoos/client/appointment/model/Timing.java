package com.bytatech.ayoos.client.appointment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Timing
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class Timing   {
  @JsonProperty("day")
  private LocalDate day = null;

  @JsonProperty("endTo")
  private OffsetDateTime endTo = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("startFrom")
  private OffsetDateTime startFrom = null;

  public Timing day(LocalDate day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDay() {
    return day;
  }

  public void setDay(LocalDate day) {
    this.day = day;
  }

  public Timing endTo(OffsetDateTime endTo) {
    this.endTo = endTo;
    return this;
  }

  /**
   * Get endTo
   * @return endTo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTo() {
    return endTo;
  }

  public void setEndTo(OffsetDateTime endTo) {
    this.endTo = endTo;
  }

  public Timing id(Long id) {
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

  public Timing startFrom(OffsetDateTime startFrom) {
    this.startFrom = startFrom;
    return this;
  }

  /**
   * Get startFrom
   * @return startFrom
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartFrom() {
    return startFrom;
  }

  public void setStartFrom(OffsetDateTime startFrom) {
    this.startFrom = startFrom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timing timing = (Timing) o;
    return Objects.equals(this.day, timing.day) &&
        Objects.equals(this.endTo, timing.endTo) &&
        Objects.equals(this.id, timing.id) &&
        Objects.equals(this.startFrom, timing.startFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, endTo, id, startFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timing {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    endTo: ").append(toIndentedString(endTo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startFrom: ").append(toIndentedString(startFrom)).append("\n");
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

