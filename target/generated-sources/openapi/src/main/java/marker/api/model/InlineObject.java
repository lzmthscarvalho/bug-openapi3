package marker.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import marker.api.model.Marker;
import org.springframework.core.io.Resource;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-05T10:43:06.531-02:00[America/Sao_Paulo]")

public class InlineObject   {
  @JsonProperty("marker")
  private Marker marker = null;

  @JsonProperty("file")
  private Resource file;

  public InlineObject marker(Marker marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Marker getMarker() {
    return marker;
  }

  public void setMarker(Marker marker) {
    this.marker = marker;
  }

  public InlineObject file(Resource file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Resource getFile() {
    return file;
  }

  public void setFile(Resource file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.marker, inlineObject.marker) &&
        Objects.equals(this.file, inlineObject.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marker, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

