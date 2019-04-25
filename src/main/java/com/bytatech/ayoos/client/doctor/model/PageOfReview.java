package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.bytatech.ayoos.client.doctor.model.Review;
import com.bytatech.ayoos.client.doctor.model.Sort;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PageOfReview
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-25T12:28:19.615+05:30[Asia/Calcutta]")

public class PageOfReview   {
  @JsonProperty("content")
  @Valid
  private List<Review> content = null;

  @JsonProperty("first")
  private Boolean first = null;

  @JsonProperty("last")
  private Boolean last = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("numberOfElements")
  private Integer numberOfElements = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("sort")
  private Sort sort = null;

  @JsonProperty("totalElements")
  private Long totalElements = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public PageOfReview content(List<Review> content) {
    this.content = content;
    return this;
  }

  public PageOfReview addContentItem(Review contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<Review>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Review> getContent() {
    return content;
  }

  public void setContent(List<Review> content) {
    this.content = content;
  }

  public PageOfReview first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")


  public Boolean isFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public PageOfReview last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")


  public Boolean isLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public PageOfReview number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageOfReview numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Get numberOfElements
   * @return numberOfElements
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public PageOfReview size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PageOfReview sort(Sort sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }

  public PageOfReview totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(value = "")


  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageOfReview totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfReview pageOfReview = (PageOfReview) o;
    return Objects.equals(this.content, pageOfReview.content) &&
        Objects.equals(this.first, pageOfReview.first) &&
        Objects.equals(this.last, pageOfReview.last) &&
        Objects.equals(this.number, pageOfReview.number) &&
        Objects.equals(this.numberOfElements, pageOfReview.numberOfElements) &&
        Objects.equals(this.size, pageOfReview.size) &&
        Objects.equals(this.sort, pageOfReview.sort) &&
        Objects.equals(this.totalElements, pageOfReview.totalElements) &&
        Objects.equals(this.totalPages, pageOfReview.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, first, last, number, numberOfElements, size, sort, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfReview {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

