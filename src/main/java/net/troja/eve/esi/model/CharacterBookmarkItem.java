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
import java.io.Serializable;

/**
 * Optional object that is returned if a bookmark was made on a particular item.
 */
@ApiModel(description = "Optional object that is returned if a bookmark was made on a particular item.")
public class CharacterBookmarkItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("item_id")
    private Long itemId = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    public CharacterBookmarkItem itemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * item_id integer
     * 
     * @return itemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "item_id integer")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public CharacterBookmarkItem typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterBookmarkItem characterBookmarkItem = (CharacterBookmarkItem) o;
        return Objects.equals(this.itemId, characterBookmarkItem.itemId)
                && Objects.equals(this.typeId, characterBookmarkItem.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterBookmarkItem {\n");

        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
