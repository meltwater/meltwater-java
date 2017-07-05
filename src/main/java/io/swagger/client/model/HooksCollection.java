/*
 * Meltwater Streaming API v2
 * The Meltwater Streaming API provides the needed resources for Meltwater clients to create & delete REST Hooks and stream Meltwater search results to your specified destination.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@api.meltwater.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Hook;
import java.util.ArrayList;
import java.util.List;

/**
 * List all hooks.     Delivers all previously generated hooks.    Requires an OAuth access token.
 */
@ApiModel(description = "List all hooks.     Delivers all previously generated hooks.    Requires an OAuth access token.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-04T11:33:45.947+02:00")
public class HooksCollection {
  @SerializedName("hooks")
  private List<Hook> hooks = new ArrayList<Hook>();

  public HooksCollection hooks(List<Hook> hooks) {
    this.hooks = hooks;
    return this;
  }

  public HooksCollection addHooksItem(Hook hooksItem) {
    this.hooks.add(hooksItem);
    return this;
  }

   /**
   * Get hooks
   * @return hooks
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Hook> getHooks() {
    return hooks;
  }

  public void setHooks(List<Hook> hooks) {
    this.hooks = hooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HooksCollection hooksCollection = (HooksCollection) o;
    return Objects.equals(this.hooks, hooksCollection.hooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HooksCollection {\n");
    
    sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
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

