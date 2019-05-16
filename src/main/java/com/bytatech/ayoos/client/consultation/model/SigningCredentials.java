package com.bytatech.ayoos.client.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SigningCredentials
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

public class SigningCredentials   {
  @JsonProperty("document")
  private String document = null;

  @JsonProperty("password")
  private String password = null;

  public SigningCredentials document(String document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(value = "")


  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public SigningCredentials password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningCredentials signingCredentials = (SigningCredentials) o;
    return Objects.equals(this.document, signingCredentials.document) &&
        Objects.equals(this.password, signingCredentials.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningCredentials {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

