/**
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.2.7.dev1
 * 
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

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.KillmailResponseVictimItems;

import java.io.Serializable;

/**
 * item object
 */
@ApiModel(description = "item object")
public class KillmailResponseVictimItems1 implements Serializable {
    @JsonProperty("flag")
    private Integer flag = null;

    @JsonProperty("item_type_id")
    private Integer itemTypeId = null;

    @JsonProperty("items")
    private List<KillmailResponseVictimItems> items = new ArrayList<KillmailResponseVictimItems>();

    @JsonProperty("quantity_destroyed")
    private Long quantityDestroyed = null;

    @JsonProperty("quantity_dropped")
    private Long quantityDropped = null;

    @JsonProperty("singleton")
    private Integer singleton = null;

    public KillmailResponseVictimItems1 flag(Integer flag) {
        this.flag = flag;
        return this;
    }

    /**
     * Flag for the location of the item
     * 
     * @return flag
     **/
    @ApiModelProperty(example = "null", required = true, value = "Flag for the location of the item ")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public KillmailResponseVictimItems1 itemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
        return this;
    }

    /**
     * item_type_id integer
     * 
     * @return itemTypeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "item_type_id integer")
    public Integer getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public KillmailResponseVictimItems1 items(List<KillmailResponseVictimItems> items) {
        this.items = items;
        return this;
    }

    public KillmailResponseVictimItems1 addItemsItem(KillmailResponseVictimItems itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * items array
     * 
     * @return items
     **/
    @ApiModelProperty(example = "null", value = "items array")
    public List<KillmailResponseVictimItems> getItems() {
        return items;
    }

    public void setItems(List<KillmailResponseVictimItems> items) {
        this.items = items;
    }

    public KillmailResponseVictimItems1 quantityDestroyed(Long quantityDestroyed) {
        this.quantityDestroyed = quantityDestroyed;
        return this;
    }

    /**
     * How many of the item were destroyed if any
     * 
     * @return quantityDestroyed
     **/
    @ApiModelProperty(example = "null", value = "How many of the item were destroyed if any ")
    public Long getQuantityDestroyed() {
        return quantityDestroyed;
    }

    public void setQuantityDestroyed(Long quantityDestroyed) {
        this.quantityDestroyed = quantityDestroyed;
    }

    public KillmailResponseVictimItems1 quantityDropped(Long quantityDropped) {
        this.quantityDropped = quantityDropped;
        return this;
    }

    /**
     * How many of the item were dropped if any
     * 
     * @return quantityDropped
     **/
    @ApiModelProperty(example = "null", value = "How many of the item were dropped if any ")
    public Long getQuantityDropped() {
        return quantityDropped;
    }

    public void setQuantityDropped(Long quantityDropped) {
        this.quantityDropped = quantityDropped;
    }

    public KillmailResponseVictimItems1 singleton(Integer singleton) {
        this.singleton = singleton;
        return this;
    }

    /**
     * singleton integer
     * 
     * @return singleton
     **/
    @ApiModelProperty(example = "null", required = true, value = "singleton integer")
    public Integer getSingleton() {
        return singleton;
    }

    public void setSingleton(Integer singleton) {
        this.singleton = singleton;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KillmailResponseVictimItems1 killmailResponseVictimItems1 = (KillmailResponseVictimItems1) o;
        return Objects.equals(this.flag, killmailResponseVictimItems1.flag)
                && Objects.equals(this.itemTypeId, killmailResponseVictimItems1.itemTypeId)
                && Objects.equals(this.items, killmailResponseVictimItems1.items)
                && Objects.equals(this.quantityDestroyed, killmailResponseVictimItems1.quantityDestroyed)
                && Objects.equals(this.quantityDropped, killmailResponseVictimItems1.quantityDropped)
                && Objects.equals(this.singleton, killmailResponseVictimItems1.singleton);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flag, itemTypeId, items, quantityDestroyed, quantityDropped, singleton);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillmailResponseVictimItems1 {\n");

        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    itemTypeId: ").append(toIndentedString(itemTypeId)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    quantityDestroyed: ").append(toIndentedString(quantityDestroyed)).append("\n");
        sb.append("    quantityDropped: ").append(toIndentedString(quantityDropped)).append("\n");
        sb.append("    singleton: ").append(toIndentedString(singleton)).append("\n");
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
