/**
 * The Meltwater API
 * The Meltwater API provides the needed resources for Meltwater clients to create & delete REST Hooks and stream Meltwater search results to your specified destination.
 *
 * OpenAPI spec version: 0.9.0
 * Contact: support@api.meltwater.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Search
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-30T17:35:57.415+01:00")
public class Search   {
  @SerializedName("search_id")
  private Integer searchId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("type")
  private String type = null;

  public Search searchId(Integer searchId) {
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

  public Search name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the search
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name of the search")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Search updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Date time of the last update of the search
   * @return updated
  **/
  @ApiModelProperty(example = "null", value = "Date time of the last update of the search")
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public Search type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of results the search returns
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The type of results the search returns")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Search search = (Search) o;
    return Objects.equals(this.searchId, search.searchId) &&
        Objects.equals(this.name, search.name) &&
        Objects.equals(this.updated, search.updated) &&
        Objects.equals(this.type, search.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchId, name, updated, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Search {\n");
    
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

