package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.bytatech.ayoos.client.doctor.model.ContactInfo;
import com.bytatech.ayoos.client.doctor.model.Qualification;
import com.bytatech.ayoos.client.doctor.model.Review;
import com.bytatech.ayoos.client.doctor.model.UserRating;
import com.bytatech.ayoos.client.doctor.model.WorkPlace;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Doctor
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-25T12:28:19.615+05:30[Asia/Calcutta]")

public class Doctor   {
  @JsonProperty("contactInfo")
  private ContactInfo contactInfo = null;

  @JsonProperty("doctorId")
  private String doctorId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("practiceSince")
  private OffsetDateTime practiceSince = null;

  @JsonProperty("qualifications")
  @Valid
  private List<Qualification> qualifications = null;

  @JsonProperty("registerNumber")
  private String registerNumber = null;

  @JsonProperty("review")
  private Review review = null;

  @JsonProperty("specialization")
  private String specialization = null;

  @JsonProperty("totalRating")
  private Double totalRating = null;

  @JsonProperty("userRating")
  private UserRating userRating = null;

  @JsonProperty("workPlaces")
  @Valid
  private List<WorkPlace> workPlaces = null;

  public Doctor contactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  /**
   * Get contactInfo
   * @return contactInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public Doctor doctorId(String doctorId) {
    this.doctorId = doctorId;
    return this;
  }

  /**
   * Get doctorId
   * @return doctorId
  **/
  @ApiModelProperty(value = "")


  public String getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(String doctorId) {
    this.doctorId = doctorId;
  }

  public Doctor id(Long id) {
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

  public Doctor image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public Doctor imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public Doctor practiceSince(OffsetDateTime practiceSince) {
    this.practiceSince = practiceSince;
    return this;
  }

  /**
   * Get practiceSince
   * @return practiceSince
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPracticeSince() {
    return practiceSince;
  }

  public void setPracticeSince(OffsetDateTime practiceSince) {
    this.practiceSince = practiceSince;
  }

  public Doctor qualifications(List<Qualification> qualifications) {
    this.qualifications = qualifications;
    return this;
  }

  public Doctor addQualificationsItem(Qualification qualificationsItem) {
    if (this.qualifications == null) {
      this.qualifications = new ArrayList<Qualification>();
    }
    this.qualifications.add(qualificationsItem);
    return this;
  }

  /**
   * Get qualifications
   * @return qualifications
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Qualification> getQualifications() {
    return qualifications;
  }

  public void setQualifications(List<Qualification> qualifications) {
    this.qualifications = qualifications;
  }

  public Doctor registerNumber(String registerNumber) {
    this.registerNumber = registerNumber;
    return this;
  }

  /**
   * Get registerNumber
   * @return registerNumber
  **/
  @ApiModelProperty(value = "")


  public String getRegisterNumber() {
    return registerNumber;
  }

  public void setRegisterNumber(String registerNumber) {
    this.registerNumber = registerNumber;
  }

  public Doctor review(Review review) {
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Review getReview() {
    return review;
  }

  public void setReview(Review review) {
    this.review = review;
  }

  public Doctor specialization(String specialization) {
    this.specialization = specialization;
    return this;
  }

  /**
   * Get specialization
   * @return specialization
  **/
  @ApiModelProperty(value = "")


  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public Doctor totalRating(Double totalRating) {
    this.totalRating = totalRating;
    return this;
  }

  /**
   * Get totalRating
   * @return totalRating
  **/
  @ApiModelProperty(value = "")


  public Double getTotalRating() {
    return totalRating;
  }

  public void setTotalRating(Double totalRating) {
    this.totalRating = totalRating;
  }

  public Doctor userRating(UserRating userRating) {
    this.userRating = userRating;
    return this;
  }

  /**
   * Get userRating
   * @return userRating
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UserRating getUserRating() {
    return userRating;
  }

  public void setUserRating(UserRating userRating) {
    this.userRating = userRating;
  }

  public Doctor workPlaces(List<WorkPlace> workPlaces) {
    this.workPlaces = workPlaces;
    return this;
  }

  public Doctor addWorkPlacesItem(WorkPlace workPlacesItem) {
    if (this.workPlaces == null) {
      this.workPlaces = new ArrayList<WorkPlace>();
    }
    this.workPlaces.add(workPlacesItem);
    return this;
  }

  /**
   * Get workPlaces
   * @return workPlaces
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<WorkPlace> getWorkPlaces() {
    return workPlaces;
  }

  public void setWorkPlaces(List<WorkPlace> workPlaces) {
    this.workPlaces = workPlaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Doctor doctor = (Doctor) o;
    return Objects.equals(this.contactInfo, doctor.contactInfo) &&
        Objects.equals(this.doctorId, doctor.doctorId) &&
        Objects.equals(this.id, doctor.id) &&
        Objects.equals(this.image, doctor.image) &&
        Objects.equals(this.imageContentType, doctor.imageContentType) &&
        Objects.equals(this.practiceSince, doctor.practiceSince) &&
        Objects.equals(this.qualifications, doctor.qualifications) &&
        Objects.equals(this.registerNumber, doctor.registerNumber) &&
        Objects.equals(this.review, doctor.review) &&
        Objects.equals(this.specialization, doctor.specialization) &&
        Objects.equals(this.totalRating, doctor.totalRating) &&
        Objects.equals(this.userRating, doctor.userRating) &&
        Objects.equals(this.workPlaces, doctor.workPlaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInfo, doctorId, id, image, imageContentType, practiceSince, qualifications, registerNumber, review, specialization, totalRating, userRating, workPlaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Doctor {\n");
    
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    practiceSince: ").append(toIndentedString(practiceSince)).append("\n");
    sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
    sb.append("    registerNumber: ").append(toIndentedString(registerNumber)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    specialization: ").append(toIndentedString(specialization)).append("\n");
    sb.append("    totalRating: ").append(toIndentedString(totalRating)).append("\n");
    sb.append("    userRating: ").append(toIndentedString(userRating)).append("\n");
    sb.append("    workPlaces: ").append(toIndentedString(workPlaces)).append("\n");
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

