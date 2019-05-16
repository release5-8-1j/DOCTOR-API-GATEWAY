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
 * PaymentInfo
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class PaymentInfo   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("cachable")
  private Boolean cachable = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("intent")
  private String intent = null;

  @JsonProperty("isPaymentEnabled")
  private Boolean isPaymentEnabled = null;

  @JsonProperty("note_to_payer")
  private String noteToPayer = null;

  @JsonProperty("paymentGatewayCredentials")
  private String paymentGatewayCredentials = null;

  @JsonProperty("paymentGatewayProvider")
  private String paymentGatewayProvider = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  @JsonProperty("typeName")
  private String typeName = null;

  public PaymentInfo amount(Double amount) {
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

  public PaymentInfo cachable(Boolean cachable) {
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

  public PaymentInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaymentInfo intent(String intent) {
    this.intent = intent;
    return this;
  }

  /**
   * Get intent
   * @return intent
  **/
  @ApiModelProperty(value = "")


  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public PaymentInfo isPaymentEnabled(Boolean isPaymentEnabled) {
    this.isPaymentEnabled = isPaymentEnabled;
    return this;
  }

  /**
   * Get isPaymentEnabled
   * @return isPaymentEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsPaymentEnabled() {
    return isPaymentEnabled;
  }

  public void setIsPaymentEnabled(Boolean isPaymentEnabled) {
    this.isPaymentEnabled = isPaymentEnabled;
  }

  public PaymentInfo noteToPayer(String noteToPayer) {
    this.noteToPayer = noteToPayer;
    return this;
  }

  /**
   * Get noteToPayer
   * @return noteToPayer
  **/
  @ApiModelProperty(value = "")


  public String getNoteToPayer() {
    return noteToPayer;
  }

  public void setNoteToPayer(String noteToPayer) {
    this.noteToPayer = noteToPayer;
  }

  public PaymentInfo paymentGatewayCredentials(String paymentGatewayCredentials) {
    this.paymentGatewayCredentials = paymentGatewayCredentials;
    return this;
  }

  /**
   * Get paymentGatewayCredentials
   * @return paymentGatewayCredentials
  **/
  @ApiModelProperty(value = "")


  public String getPaymentGatewayCredentials() {
    return paymentGatewayCredentials;
  }

  public void setPaymentGatewayCredentials(String paymentGatewayCredentials) {
    this.paymentGatewayCredentials = paymentGatewayCredentials;
  }

  public PaymentInfo paymentGatewayProvider(String paymentGatewayProvider) {
    this.paymentGatewayProvider = paymentGatewayProvider;
    return this;
  }

  /**
   * Get paymentGatewayProvider
   * @return paymentGatewayProvider
  **/
  @ApiModelProperty(value = "")


  public String getPaymentGatewayProvider() {
    return paymentGatewayProvider;
  }

  public void setPaymentGatewayProvider(String paymentGatewayProvider) {
    this.paymentGatewayProvider = paymentGatewayProvider;
  }

  public PaymentInfo paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")


  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentInfo typeName(String typeName) {
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
    PaymentInfo paymentInfo = (PaymentInfo) o;
    return Objects.equals(this.amount, paymentInfo.amount) &&
        Objects.equals(this.cachable, paymentInfo.cachable) &&
        Objects.equals(this.currency, paymentInfo.currency) &&
        Objects.equals(this.intent, paymentInfo.intent) &&
        Objects.equals(this.isPaymentEnabled, paymentInfo.isPaymentEnabled) &&
        Objects.equals(this.noteToPayer, paymentInfo.noteToPayer) &&
        Objects.equals(this.paymentGatewayCredentials, paymentInfo.paymentGatewayCredentials) &&
        Objects.equals(this.paymentGatewayProvider, paymentInfo.paymentGatewayProvider) &&
        Objects.equals(this.paymentMethod, paymentInfo.paymentMethod) &&
        Objects.equals(this.typeName, paymentInfo.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, cachable, currency, intent, isPaymentEnabled, noteToPayer, paymentGatewayCredentials, paymentGatewayProvider, paymentMethod, typeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInfo {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cachable: ").append(toIndentedString(cachable)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    isPaymentEnabled: ").append(toIndentedString(isPaymentEnabled)).append("\n");
    sb.append("    noteToPayer: ").append(toIndentedString(noteToPayer)).append("\n");
    sb.append("    paymentGatewayCredentials: ").append(toIndentedString(paymentGatewayCredentials)).append("\n");
    sb.append("    paymentGatewayProvider: ").append(toIndentedString(paymentGatewayProvider)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

