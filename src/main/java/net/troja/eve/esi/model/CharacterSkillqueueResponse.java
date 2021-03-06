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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterSkillqueueResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("finish_date")
    private OffsetDateTime finishDate = null;

    @JsonProperty("finished_level")
    private Integer finishedLevel = null;

    @JsonProperty("level_end_sp")
    private Integer levelEndSp = null;

    @JsonProperty("level_start_sp")
    private Integer levelStartSp = null;

    @JsonProperty("queue_position")
    private Integer queuePosition = null;

    @JsonProperty("skill_id")
    private Integer skillId = null;

    @JsonProperty("start_date")
    private OffsetDateTime startDate = null;

    @JsonProperty("training_start_sp")
    private Integer trainingStartSp = null;

    public CharacterSkillqueueResponse finishDate(OffsetDateTime finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    /**
     * finish_date string
     * 
     * @return finishDate
     **/
    @ApiModelProperty(example = "null", value = "finish_date string")
    public OffsetDateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(OffsetDateTime finishDate) {
        this.finishDate = finishDate;
    }

    public CharacterSkillqueueResponse finishedLevel(Integer finishedLevel) {
        this.finishedLevel = finishedLevel;
        return this;
    }

    /**
     * finished_level integer minimum: 0 maximum: 5
     * 
     * @return finishedLevel
     **/
    @ApiModelProperty(example = "null", required = true, value = "finished_level integer")
    public Integer getFinishedLevel() {
        return finishedLevel;
    }

    public void setFinishedLevel(Integer finishedLevel) {
        this.finishedLevel = finishedLevel;
    }

    public CharacterSkillqueueResponse levelEndSp(Integer levelEndSp) {
        this.levelEndSp = levelEndSp;
        return this;
    }

    /**
     * level_end_sp integer
     * 
     * @return levelEndSp
     **/
    @ApiModelProperty(example = "null", value = "level_end_sp integer")
    public Integer getLevelEndSp() {
        return levelEndSp;
    }

    public void setLevelEndSp(Integer levelEndSp) {
        this.levelEndSp = levelEndSp;
    }

    public CharacterSkillqueueResponse levelStartSp(Integer levelStartSp) {
        this.levelStartSp = levelStartSp;
        return this;
    }

    /**
     * Amount of SP that was in the skill when it started training it's current
     * level. Used to calculate % of current level complete.
     * 
     * @return levelStartSp
     **/
    @ApiModelProperty(example = "null", value = "Amount of SP that was in the skill when it started training it's current level. Used to calculate % of current level complete.")
    public Integer getLevelStartSp() {
        return levelStartSp;
    }

    public void setLevelStartSp(Integer levelStartSp) {
        this.levelStartSp = levelStartSp;
    }

    public CharacterSkillqueueResponse queuePosition(Integer queuePosition) {
        this.queuePosition = queuePosition;
        return this;
    }

    /**
     * queue_position integer
     * 
     * @return queuePosition
     **/
    @ApiModelProperty(example = "null", required = true, value = "queue_position integer")
    public Integer getQueuePosition() {
        return queuePosition;
    }

    public void setQueuePosition(Integer queuePosition) {
        this.queuePosition = queuePosition;
    }

    public CharacterSkillqueueResponse skillId(Integer skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * skill_id integer
     * 
     * @return skillId
     **/
    @ApiModelProperty(example = "null", required = true, value = "skill_id integer")
    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public CharacterSkillqueueResponse startDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * start_date string
     * 
     * @return startDate
     **/
    @ApiModelProperty(example = "null", value = "start_date string")
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    public CharacterSkillqueueResponse trainingStartSp(Integer trainingStartSp) {
        this.trainingStartSp = trainingStartSp;
        return this;
    }

    /**
     * training_start_sp integer
     * 
     * @return trainingStartSp
     **/
    @ApiModelProperty(example = "null", value = "training_start_sp integer")
    public Integer getTrainingStartSp() {
        return trainingStartSp;
    }

    public void setTrainingStartSp(Integer trainingStartSp) {
        this.trainingStartSp = trainingStartSp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterSkillqueueResponse characterSkillqueueResponse = (CharacterSkillqueueResponse) o;
        return Objects.equals(this.finishDate, characterSkillqueueResponse.finishDate)
                && Objects.equals(this.finishedLevel, characterSkillqueueResponse.finishedLevel)
                && Objects.equals(this.levelEndSp, characterSkillqueueResponse.levelEndSp)
                && Objects.equals(this.levelStartSp, characterSkillqueueResponse.levelStartSp)
                && Objects.equals(this.queuePosition, characterSkillqueueResponse.queuePosition)
                && Objects.equals(this.skillId, characterSkillqueueResponse.skillId)
                && Objects.equals(this.startDate, characterSkillqueueResponse.startDate)
                && Objects.equals(this.trainingStartSp, characterSkillqueueResponse.trainingStartSp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finishDate, finishedLevel, levelEndSp, levelStartSp, queuePosition, skillId, startDate,
                trainingStartSp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterSkillqueueResponse {\n");

        sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
        sb.append("    finishedLevel: ").append(toIndentedString(finishedLevel)).append("\n");
        sb.append("    levelEndSp: ").append(toIndentedString(levelEndSp)).append("\n");
        sb.append("    levelStartSp: ").append(toIndentedString(levelStartSp)).append("\n");
        sb.append("    queuePosition: ").append(toIndentedString(queuePosition)).append("\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    trainingStartSp: ").append(toIndentedString(trainingStartSp)).append("\n");
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
