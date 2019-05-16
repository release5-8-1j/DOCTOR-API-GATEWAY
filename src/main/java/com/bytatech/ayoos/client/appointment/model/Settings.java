package com.bytatech.ayoos.client.appointment.model;

import java.util.Objects;
import com.bytatech.ayoos.client.appointment.model.PaymentInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Settings
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:24:38.008+05:30[Asia/Calcutta]")

public class Settings   {
  @JsonProperty("approvalType")
  private String approvalType = null;

  @JsonProperty("cachable")
  private Boolean cachable = null;

  @JsonProperty("isMailNotificationsEnabled")
  private Boolean isMailNotificationsEnabled = null;

  @JsonProperty("isSMSNotificationsEnabled")
  private Boolean isSMSNotificationsEnabled = null;

  @JsonProperty("paymentSettings")
  private PaymentInfo paymentSettings = null;

  @JsonProperty("typeName")
  private String typeName = null;

  public Settings approvalType(String approvalType) {
    this.approvalType = approvalType;
    return this;
  }

  /**
   * Get approvalType
   * @return approvalType
  **/
  @ApiModelProperty(value = "")


  public String getApprovalType() {
    return approvalType;
  }

  public void setApprovalType(String approvalType) {
    this.approvalType = approvalType;
  }

  public Settings cachable(Boolean cachable) {
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

  public Settings isMailNotificationsEnabled(Boolean isMailNotificationsEnabled) {
    this.isMailNotificationsEnabled = isMailNotificationsEnabled;
    return this;
  }

  /**
   * Get isMailNotificationsEnabled
   * @return isMailNotificationsEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsMailNotificationsEnabled() {
    return isMailNotificationsEnabled;
  }

  public void setIsMailNotificationsEnabled(Boolean isMailNotificationsEnabled) {
    this.isMailNotificationsEnabled = isMailNotificationsEnabled;
  }

  public Settings isSMSNotificationsEnabled(Boolean isSMSNotificationsEnabled) {
    this.isSMSNotificationsEnabled = isSMSNotificationsEnabled;
    return this;
  }

  /**
   * Get isSMSNotificationsEnabled
   * @return isSMSNotificationsEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsSMSNotificationsEnabled() {
    return isSMSNotificationsEnabled;
  }

  public void setIsSMSNotificationsEnabled(Boolean isSMSNotificationsEnabled) {
    this.isSMSNotificationsEnabled = isSMSNotificationsEnabled;
  }

  public Settings paymentSettings(PaymentInfo paymentSettings) {
    this.paymentSettings = paymentSettings;
    return this;
  }

  /**
   * Get paymentSettings
   * @return paymentSettings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentInfo getPaymentSettings() {
    return paymentSettings;
  }

  public void setPaymentSettings(PaymentInfo paymentSettings) {
    this.paymentSettings = paymentSettings;
  }

  public Settings typeName(String typeName) {
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
    Settings settings = (Settings) o;
    return Objects.equals(this.approvalType, settings.approvalType) &&
        Objects.equals(this.cachable, settings.cachable) &&
        Objects.equals(this.isMailNotificationsEnabled, settings.isMailNotificationsEnabled) &&
        Objects.equals(this.isSMSNotificationsEnabled, settings.isSMSNotificationsEnabled) &&
        Objects.equals(this.paymentSettings, settings.paymentSettings) &&
        Objects.equals(this.typeName, settings.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalType, cachable, isMailNotificationsEnabled, isSMSNotificationsEnabled, paymentSettings, typeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
    sb.append("    cachable: ").append(toIndentedString(cachable)).append("\n");
    sb.append("    isMailNotificationsEnabled: ").append(toIndentedString(isMailNotificationsEnabled)).append("\n");
    sb.append("    isSMSNotificationsEnabled: ").append(toIndentedString(isSMSNotificationsEnabled)).append("\n");
    sb.append("    paymentSettings: ").append(toIndentedString(paymentSettings)).append("\n");
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

