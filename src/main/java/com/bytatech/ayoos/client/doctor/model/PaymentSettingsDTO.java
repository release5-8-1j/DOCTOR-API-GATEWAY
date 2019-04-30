package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentSettingsDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-30T12:10:02.590+05:30[Asia/Calcutta]")

public class PaymentSettingsDTO   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("id")
  private Long id = null;

  public PaymentSettingsDTO amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PaymentSettingsDTO id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSettingsDTO paymentSettingsDTO = (PaymentSettingsDTO) o;
    return Objects.equals(this.amount, paymentSettingsDTO.amount) &&
        Objects.equals(this.id, paymentSettingsDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSettingsDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
