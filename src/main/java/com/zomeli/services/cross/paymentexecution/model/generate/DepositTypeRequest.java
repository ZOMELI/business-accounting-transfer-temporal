package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



@JsonTypeName("DepositTypeRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class DepositTypeRequest   {
  
  private @Valid String code;

  /**
   * Tipo de abono
   **/
  public DepositTypeRequest code(String code) {
    this.code = code;
    return this;
  }

  
  @JsonProperty("code")
  @NotNull
 @Pattern(regexp="^(CTAD|CTBL|TCRE)$")  public String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTypeRequest depositTypeRequest = (DepositTypeRequest) o;
    return Objects.equals(this.code, depositTypeRequest.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTypeRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

