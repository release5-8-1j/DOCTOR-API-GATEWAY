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
 * AppointmentConfirmationResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class AppointmentConfirmationResponse   {
  @JsonProperty("appointmentConfirmation")
  private String appointmentConfirmation = null;

  @JsonProperty("isSuggetionEnabled")
  private Boolean isSuggetionEnabled = null;

  @JsonProperty("message")
  private String message = null;

  public AppointmentConfirmationResponse appointmentConfirmation(String appointmentConfirmation) {
    this.appointmentConfirmation = appointmentConfirmation;
    return this;
  }

  /**
   * Get appointmentConfirmation
   * @return appointmentConfirmation
  **/
  @ApiModelProperty(value = "")


  public String getAppointmentConfirmation() {
    return appointmentConfirmation;
  }

  public void setAppointmentConfirmation(String appointmentConfirmation) {
    this.appointmentConfirmation = appointmentConfirmation;
  }

  public AppointmentConfirmationResponse isSuggetionEnabled(Boolean isSuggetionEnabled) {
    this.isSuggetionEnabled = isSuggetionEnabled;
    return this;
  }

  /**
   * Get isSuggetionEnabled
   * @return isSuggetionEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsSuggetionEnabled() {
    return isSuggetionEnabled;
  }

  public void setIsSuggetionEnabled(Boolean isSuggetionEnabled) {
    this.isSuggetionEnabled = isSuggetionEnabled;
  }

  public AppointmentConfirmationResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentConfirmationResponse appointmentConfirmationResponse = (AppointmentConfirmationResponse) o;
    return Objects.equals(this.appointmentConfirmation, appointmentConfirmationResponse.appointmentConfirmation) &&
        Objects.equals(this.isSuggetionEnabled, appointmentConfirmationResponse.isSuggetionEnabled) &&
        Objects.equals(this.message, appointmentConfirmationResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentConfirmation, isSuggetionEnabled, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentConfirmationResponse {\n");
    
    sb.append("    appointmentConfirmation: ").append(toIndentedString(appointmentConfirmation)).append("\n");
    sb.append("    isSuggetionEnabled: ").append(toIndentedString(isSuggetionEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

