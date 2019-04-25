package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.bytatech.ayoos.client.doctor.model.URI;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceInstance
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-25T12:28:19.615+05:30[Asia/Calcutta]")

public class ServiceInstance   {
  @JsonProperty("host")
  private String host = null;

  @JsonProperty("metadata")
  @Valid
  private Map<String, String> metadata = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("scheme")
  private String scheme = null;

  @JsonProperty("secure")
  private Boolean secure = null;

  @JsonProperty("serviceId")
  private String serviceId = null;

  @JsonProperty("uri")
  private URI uri = null;

  public ServiceInstance host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
  **/
  @ApiModelProperty(value = "")


  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ServiceInstance metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ServiceInstance putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")


  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public ServiceInstance port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")


  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public ServiceInstance scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * Get scheme
   * @return scheme
  **/
  @ApiModelProperty(value = "")


  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public ServiceInstance secure(Boolean secure) {
    this.secure = secure;
    return this;
  }

  /**
   * Get secure
   * @return secure
  **/
  @ApiModelProperty(value = "")


  public Boolean isSecure() {
    return secure;
  }

  public void setSecure(Boolean secure) {
    this.secure = secure;
  }

  public ServiceInstance serviceId(String serviceId) {
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

  public ServiceInstance uri(URI uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")

  @Valid

  public URI getUri() {
    return uri;
  }

  public void setUri(URI uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstance serviceInstance = (ServiceInstance) o;
    return Objects.equals(this.host, serviceInstance.host) &&
        Objects.equals(this.metadata, serviceInstance.metadata) &&
        Objects.equals(this.port, serviceInstance.port) &&
        Objects.equals(this.scheme, serviceInstance.scheme) &&
        Objects.equals(this.secure, serviceInstance.secure) &&
        Objects.equals(this.serviceId, serviceInstance.serviceId) &&
        Objects.equals(this.uri, serviceInstance.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, metadata, port, scheme, secure, serviceId, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstance {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

