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
 * ReviewDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-25T10:42:10.566+05:30[Asia/Calcutta]")

public class ReviewDTO   {
  @JsonProperty("doctorId")
  private Long doctorId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("review")
  private String review = null;

  @JsonProperty("reviewedOn")
  private LocalDate reviewedOn = null;

  @JsonProperty("userName")
  private String userName = null;

  public ReviewDTO doctorId(Long doctorId) {
    this.doctorId = doctorId;
    return this;
  }

  /**
   * Get doctorId
   * @return doctorId
  **/
  @ApiModelProperty(value = "")


  public Long getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(Long doctorId) {
    this.doctorId = doctorId;
  }

  public ReviewDTO id(Long id) {
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

  public ReviewDTO review(String review) {
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
  **/
  @ApiModelProperty(value = "")


  public String getReview() {
    return review;
  }

  public void setReview(String review) {
    this.review = review;
  }

  public ReviewDTO reviewedOn(LocalDate reviewedOn) {
    this.reviewedOn = reviewedOn;
    return this;
  }

  /**
   * Get reviewedOn
   * @return reviewedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getReviewedOn() {
    return reviewedOn;
  }

  public void setReviewedOn(LocalDate reviewedOn) {
    this.reviewedOn = reviewedOn;
  }

  public ReviewDTO userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewDTO reviewDTO = (ReviewDTO) o;
    return Objects.equals(this.doctorId, reviewDTO.doctorId) &&
        Objects.equals(this.id, reviewDTO.id) &&
        Objects.equals(this.review, reviewDTO.review) &&
        Objects.equals(this.reviewedOn, reviewDTO.reviewedOn) &&
        Objects.equals(this.userName, reviewDTO.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doctorId, id, review, reviewedOn, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewDTO {\n");
    
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    reviewedOn: ").append(toIndentedString(reviewedOn)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

