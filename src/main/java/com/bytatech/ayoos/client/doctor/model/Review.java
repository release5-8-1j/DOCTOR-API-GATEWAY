package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.bytatech.ayoos.client.doctor.model.Doctor;
import com.bytatech.ayoos.client.doctor.model.Reply;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Review
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-25T10:42:10.566+05:30[Asia/Calcutta]")

public class Review   {
  @JsonProperty("doctor")
  private Doctor doctor = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("replies")
  @Valid
  private List<Reply> replies = null;

  @JsonProperty("review")
  private String review = null;

  @JsonProperty("reviewedOn")
  private LocalDate reviewedOn = null;

  @JsonProperty("userName")
  private String userName = null;

  public Review doctor(Doctor doctor) {
    this.doctor = doctor;
    return this;
  }

  /**
   * Get doctor
   * @return doctor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Doctor getDoctor() {
    return doctor;
  }

  public void setDoctor(Doctor doctor) {
    this.doctor = doctor;
  }

  public Review id(Long id) {
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

  public Review replies(List<Reply> replies) {
    this.replies = replies;
    return this;
  }

  public Review addRepliesItem(Reply repliesItem) {
    if (this.replies == null) {
      this.replies = new ArrayList<Reply>();
    }
    this.replies.add(repliesItem);
    return this;
  }

  /**
   * Get replies
   * @return replies
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Reply> getReplies() {
    return replies;
  }

  public void setReplies(List<Reply> replies) {
    this.replies = replies;
  }

  public Review review(String review) {
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

  public Review reviewedOn(LocalDate reviewedOn) {
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

  public Review userName(String userName) {
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
    Review review = (Review) o;
    return Objects.equals(this.doctor, review.doctor) &&
        Objects.equals(this.id, review.id) &&
        Objects.equals(this.replies, review.replies) &&
        Objects.equals(this.review, review.review) &&
        Objects.equals(this.reviewedOn, review.reviewedOn) &&
        Objects.equals(this.userName, review.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doctor, id, replies, review, reviewedOn, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Review {\n");
    
    sb.append("    doctor: ").append(toIndentedString(doctor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    replies: ").append(toIndentedString(replies)).append("\n");
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

