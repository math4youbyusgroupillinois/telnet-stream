/**
 * Simple Inventory API
 * This is a simple API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: you@your-company.com
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

import io.swagger.client.model.Manufacturer;
import java.util.UUID;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InventoryItem {
  
  @SerializedName("id")
  private UUID id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("releaseDate")
  private String releaseDate = null;
  @SerializedName("manufacturer")
  private Manufacturer manufacturer = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Manufacturer getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(Manufacturer manufacturer) {
    this.manufacturer = manufacturer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryItem inventoryItem = (InventoryItem) o;
    return (this.id == null ? inventoryItem.id == null : this.id.equals(inventoryItem.id)) &&
        (this.name == null ? inventoryItem.name == null : this.name.equals(inventoryItem.name)) &&
        (this.releaseDate == null ? inventoryItem.releaseDate == null : this.releaseDate.equals(inventoryItem.releaseDate)) &&
        (this.manufacturer == null ? inventoryItem.manufacturer == null : this.manufacturer.equals(inventoryItem.manufacturer));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.releaseDate == null ? 0: this.releaseDate.hashCode());
    result = 31 * result + (this.manufacturer == null ? 0: this.manufacturer.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryItem {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  releaseDate: ").append(releaseDate).append("\n");
    sb.append("  manufacturer: ").append(manufacturer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
