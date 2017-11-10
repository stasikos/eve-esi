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
 * last_week object
 */
@ApiModel(description = "last_week object")
public class FactionWarfareLeaderboardCharactersLastWeekKills implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("character_id")
    private Integer characterId = null;

    @JsonProperty("amount")
    private Integer amount = null;

    public FactionWarfareLeaderboardCharactersLastWeekKills characterId(Integer characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(example = "null", value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public FactionWarfareLeaderboardCharactersLastWeekKills amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Amount of kills
     * 
     * @return amount
     **/
    @ApiModelProperty(example = "null", value = "Amount of kills")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCharactersLastWeekKills factionWarfareLeaderboardCharactersLastWeekKills = (FactionWarfareLeaderboardCharactersLastWeekKills) o;
        return Objects.equals(this.characterId, factionWarfareLeaderboardCharactersLastWeekKills.characterId)
                && Objects.equals(this.amount, factionWarfareLeaderboardCharactersLastWeekKills.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCharactersLastWeekKills {\n");

        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
