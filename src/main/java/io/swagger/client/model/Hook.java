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

/**
 * Creates a hook for one of your predefined searches.  Delivers search results for the query referenced by the &#x60;search_id&#x60; to the &#x60;target_url&#x60; via HTTP POST. Note that a &#x60;hook_id&#x60; will be returned on successful creation, this id is needed to delete the hook.   We are also returning the header: &#x60;X-Hook-Secret&#x60;, a shared secret used to sign the document body pushed to your &#x60;target_url&#x60;.    Requires an OAuth access token.
 */
@ApiModel(description = "Creates a hook for one of your predefined searches.  Delivers search results for the query referenced by the `search_id` to the `target_url` via HTTP POST. Note that a `hook_id` will be returned on successful creation, this id is needed to delete the hook.   We are also returning the header: `X-Hook-Secret`, a shared secret used to sign the document body pushed to your `target_url`.    Requires an OAuth access token.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-04T11:33:45.947+02:00")
public class Hook {
  @SerializedName("search_id")
  private Integer searchId = null;

  @SerializedName("target_url")
  private String targetUrl = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("search_type")
  private String searchType = null;

  @SerializedName("hook_id")
  private String hookId = null;

  public Hook searchId(Integer searchId) {
    this.searchId = searchId;
    return this;
  }

   /**
   * Search id
   * @return searchId
  **/
  @ApiModelProperty(example = "null", value = "Search id")
  public Integer getSearchId() {
    return searchId;
  }

  public void setSearchId(Integer searchId) {
    this.searchId = searchId;
  }

  public Hook targetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * The URL that results from the search will be posted to
   * @return targetUrl
  **/
  @ApiModelProperty(example = "null", value = "The URL that results from the search will be posted to")
  public String getTargetUrl() {
    return targetUrl;
  }

  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }

  public Hook updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public Hook searchType(String searchType) {
    this.searchType = searchType;
    return this;
  }

   /**
   * The type of search the hook is for
   * @return searchType
  **/
  @ApiModelProperty(example = "null", value = "The type of search the hook is for")
  public String getSearchType() {
    return searchType;
  }

  public void setSearchType(String searchType) {
    this.searchType = searchType;
  }

  public Hook hookId(String hookId) {
    this.hookId = hookId;
    return this;
  }

   /**
   * Get hookId
   * @return hookId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHookId() {
    return hookId;
  }

  public void setHookId(String hookId) {
    this.hookId = hookId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hook hook = (Hook) o;
    return Objects.equals(this.searchId, hook.searchId) &&
        Objects.equals(this.targetUrl, hook.targetUrl) &&
        Objects.equals(this.updated, hook.updated) &&
        Objects.equals(this.searchType, hook.searchType) &&
        Objects.equals(this.hookId, hook.hookId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchId, targetUrl, updated, searchType, hookId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hook {\n");
    
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
    sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
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

