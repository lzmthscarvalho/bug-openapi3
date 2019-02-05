package marker.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Marker
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-05T10:43:06.531-02:00[America/Sao_Paulo]")

public class Marker   {
  @JsonProperty("id")
  private String id;

  /**
   * some description
   */
  public enum MarkerTypeEnum {
    A("A"),
    
    B("B");

    private String value;

    MarkerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MarkerTypeEnum fromValue(String text) {
      for (MarkerTypeEnum b : MarkerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("markerType")
  private MarkerTypeEnum markerType;

  public Marker id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id
   * @return id
  */
  @ApiModelProperty(value = "id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Marker markerType(MarkerTypeEnum markerType) {
    this.markerType = markerType;
    return this;
  }

  /**
   * some description
   * @return markerType
  */
  @ApiModelProperty(required = true, value = "some description")
  @NotNull


  public MarkerTypeEnum getMarkerType() {
    return markerType;
  }

  public void setMarkerType(MarkerTypeEnum markerType) {
    this.markerType = markerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Marker marker = (Marker) o;
    return Objects.equals(this.id, marker.id) &&
        Objects.equals(this.markerType, marker.markerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, markerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Marker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    markerType: ").append(toIndentedString(markerType)).append("\n");
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

