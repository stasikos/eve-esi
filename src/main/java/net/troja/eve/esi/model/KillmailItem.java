/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.KillmailSubItem;
import java.io.Serializable;

/**
 * item object
 */
@ApiModel(description = "item object")
public class KillmailItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("item_type_id")
    private Integer itemTypeId = null;

    @JsonProperty("quantity_destroyed")
    private Long quantityDestroyed = null;

    @JsonProperty("quantity_dropped")
    private Long quantityDropped = null;

    @JsonProperty("singleton")
    private Integer singleton = null;

    @JsonProperty("flag")
    private Integer flag = null;

    @JsonProperty("items")
    private List<KillmailSubItem> items = new ArrayList<KillmailSubItem>();

    public KillmailItem itemTypeId(Integer itemTypeId) {
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

    public KillmailItem quantityDestroyed(Long quantityDestroyed) {
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

    public KillmailItem quantityDropped(Long quantityDropped) {
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

    public KillmailItem singleton(Integer singleton) {
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

    public KillmailItem flag(Integer flag) {
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

    public KillmailItem items(List<KillmailSubItem> items) {
        this.items = items;
        return this;
    }

    public KillmailItem addItemsItem(KillmailSubItem itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * items array
     * 
     * @return items
     **/
    @ApiModelProperty(example = "null", value = "items array")
    public List<KillmailSubItem> getItems() {
        return items;
    }

    public void setItems(List<KillmailSubItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KillmailItem killmailItem = (KillmailItem) o;
        return Objects.equals(this.itemTypeId, killmailItem.itemTypeId)
                && Objects.equals(this.quantityDestroyed, killmailItem.quantityDestroyed)
                && Objects.equals(this.quantityDropped, killmailItem.quantityDropped)
                && Objects.equals(this.singleton, killmailItem.singleton)
                && Objects.equals(this.flag, killmailItem.flag) && Objects.equals(this.items, killmailItem.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemTypeId, quantityDestroyed, quantityDropped, singleton, flag, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillmailItem {\n");

        sb.append("    itemTypeId: ").append(toIndentedString(itemTypeId)).append("\n");
        sb.append("    quantityDestroyed: ").append(toIndentedString(quantityDestroyed)).append("\n");
        sb.append("    quantityDropped: ").append(toIndentedString(quantityDropped)).append("\n");
        sb.append("    singleton: ").append(toIndentedString(singleton)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
