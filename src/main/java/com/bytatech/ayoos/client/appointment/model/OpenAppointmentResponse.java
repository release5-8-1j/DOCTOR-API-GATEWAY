package com.bytatech.ayoos.client.appointment.model;

import java.util.Objects;
import com.bytatech.ayoos.client.appointment.model.AppointmentDetails;
import com.bytatech.ayoos.client.appointment.model.Slot;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OpenAppointmentResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class OpenAppointmentResponse   {
  @JsonProperty("appointmentDetails")
  private AppointmentDetails appointmentDetails = null;

  @JsonProperty("slot")
  private Slot slot = null;

  public OpenAppointmentResponse appointmentDetails(AppointmentDetails appointmentDetails) {
    this.appointmentDetails = appointmentDetails;
    return this;
  }

  /**
   * Get appointmentDetails
   * @return appointmentDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AppointmentDetails getAppointmentDetails() {
    return appointmentDetails;
  }

  public void setAppointmentDetails(AppointmentDetails appointmentDetails) {
    this.appointmentDetails = appointmentDetails;
  }

  public OpenAppointmentResponse slot(Slot slot) {
    this.slot = slot;
    return this;
  }

  /**
   * Get slot
   * @return slot
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Slot getSlot() {
    return slot;
  }

  public void setSlot(Slot slot) {
    this.slot = slot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAppointmentResponse openAppointmentResponse = (OpenAppointmentResponse) o;
    return Objects.equals(this.appointmentDetails, openAppointmentResponse.appointmentDetails) &&
        Objects.equals(this.slot, openAppointmentResponse.slot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentDetails, slot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAppointmentResponse {\n");
    
    sb.append("    appointmentDetails: ").append(toIndentedString(appointmentDetails)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
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

