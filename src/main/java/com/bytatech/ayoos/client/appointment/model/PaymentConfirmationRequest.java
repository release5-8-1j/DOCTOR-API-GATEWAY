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
 * PaymentConfirmationRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class PaymentConfirmationRequest   {
  @JsonProperty("paymentDecision")
  private String paymentDecision = null;

  public PaymentConfirmationRequest paymentDecision(String paymentDecision) {
    this.paymentDecision = paymentDecision;
    return this;
  }

  /**
   * Get paymentDecision
   * @return paymentDecision
  **/
  @ApiModelProperty(value = "")


  public String getPaymentDecision() {
    return paymentDecision;
  }

  public void setPaymentDecision(String paymentDecision) {
    this.paymentDecision = paymentDecision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentConfirmationRequest paymentConfirmationRequest = (PaymentConfirmationRequest) o;
    return Objects.equals(this.paymentDecision, paymentConfirmationRequest.paymentDecision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentDecision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConfirmationRequest {\n");
    
    sb.append("    paymentDecision: ").append(toIndentedString(paymentDecision)).append("\n");
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

