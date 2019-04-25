package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.bytatech.ayoos.client.doctor.model.ServiceInstance;
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
 * RouteVM
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-25T12:28:19.615+05:30[Asia/Calcutta]")

public class RouteVM   {
  @JsonProperty("path")
  private String path = null;

  @JsonProperty("serviceId")
  private String serviceId = null;

  @JsonProperty("serviceInstances")
  @Valid
  private List<ServiceInstance> serviceInstances = null;

  public RouteVM path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public RouteVM serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(value = "")


  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public RouteVM serviceInstances(List<ServiceInstance> serviceInstances) {
    this.serviceInstances = serviceInstances;
    return this;
  }

  public RouteVM addServiceInstancesItem(ServiceInstance serviceInstancesItem) {
    if (this.serviceInstances == null) {
      this.serviceInstances = new ArrayList<ServiceInstance>();
    }
    this.serviceInstances.add(serviceInstancesItem);
    return this;
  }

  /**
   * Get serviceInstances
   * @return serviceInstances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ServiceInstance> getServiceInstances() {
    return serviceInstances;
  }

  public void setServiceInstances(List<ServiceInstance> serviceInstances) {
    this.serviceInstances = serviceInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteVM routeVM = (RouteVM) o;
    return Objects.equals(this.path, routeVM.path) &&
        Objects.equals(this.serviceId, routeVM.serviceId) &&
        Objects.equals(this.serviceInstances, routeVM.serviceInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceId, serviceInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteVM {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceInstances: ").append(toIndentedString(serviceInstances)).append("\n");
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

