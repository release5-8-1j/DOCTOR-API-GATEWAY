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
 * AppointmentConfirmationRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class AppointmentConfirmationRequest   {
  @JsonProperty("requestConfirmation")
  private String requestConfirmation = null;

  public AppointmentConfirmationRequest requestConfirmation(String requestConfirmation) {
    this.requestConfirmation = requestConfirmation;
    return this;
  }

  /**
   * Get requestConfirmation
   * @return requestConfirmation
  **/
  @ApiModelProperty(value = "")


  public String getRequestConfirmation() {
    return requestConfirmation;
  }

  public void setRequestConfirmation(String requestConfirmation) {
    this.requestConfirmation = requestConfirmation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentConfirmationRequest appointmentConfirmationRequest = (AppointmentConfirmationRequest) o;
    return Objects.equals(this.requestConfirmation, appointmentConfirmationRequest.requestConfirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestConfirmation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentConfirmationRequest {\n");
    
    sb.append("    requestConfirmation: ").append(toIndentedString(requestConfirmation)).append("\n");
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

