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
import java.time.OffsetDateTime;

import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class SovereigntyStructuresResponse implements Serializable {
    @JsonProperty("alliance_id")
    private Long allianceId = null;

    @JsonProperty("solar_system_id")
    private Long solarSystemId = null;

    @JsonProperty("structure_id")
    private Long structureId = null;

    @JsonProperty("structure_type_id")
    private Long structureTypeId = null;

    @JsonProperty("vulnerability_occupancy_level")
    private Float vulnerabilityOccupancyLevel = null;

    @JsonProperty("vulnerable_end_time")
    private OffsetDateTime vulnerableEndTime = null;

    @JsonProperty("vulnerable_start_time")
    private OffsetDateTime vulnerableStartTime = null;

    public SovereigntyStructuresResponse allianceId(Long allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * The alliance that owns the structure.
     * 
     * @return allianceId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The alliance that owns the structure. ")
    public Long getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Long allianceId) {
        this.allianceId = allianceId;
    }

    public SovereigntyStructuresResponse solarSystemId(Long solarSystemId) {
        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * Solar system in which the structure is located.
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Solar system in which the structure is located. ")
    public Long getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Long solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public SovereigntyStructuresResponse structureId(Long structureId) {
        this.structureId = structureId;
        return this;
    }

    /**
     * Unique item ID for this structure.
     * 
     * @return structureId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Unique item ID for this structure.")
    public Long getStructureId() {
        return structureId;
    }

    public void setStructureId(Long structureId) {
        this.structureId = structureId;
    }

    public SovereigntyStructuresResponse structureTypeId(Long structureTypeId) {
        this.structureTypeId = structureTypeId;
        return this;
    }

    /**
     * A reference to the type of structure this is.
     * 
     * @return structureTypeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "A reference to the type of structure this is. ")
    public Long getStructureTypeId() {
        return structureTypeId;
    }

    public void setStructureTypeId(Long structureTypeId) {
        this.structureTypeId = structureTypeId;
    }

    public SovereigntyStructuresResponse vulnerabilityOccupancyLevel(Float vulnerabilityOccupancyLevel) {
        this.vulnerabilityOccupancyLevel = vulnerabilityOccupancyLevel;
        return this;
    }

    /**
     * The occupancy level for the next or current vulnerability window. This
     * takes into account all development indexes and capital system bonuses.
     * Also known as Activity Defense Multiplier from in the client. It
     * increases the time that attackers must spend using their entosis links on
     * the structure.
     * 
     * @return vulnerabilityOccupancyLevel
     **/
    @ApiModelProperty(example = "null", value = "The occupancy level for the next or current vulnerability window. This takes into account all development indexes and capital system bonuses. Also known as Activity Defense Multiplier from in the client. It increases the time that attackers must spend using their entosis links on the structure. ")
    public Float getVulnerabilityOccupancyLevel() {
        return vulnerabilityOccupancyLevel;
    }

    public void setVulnerabilityOccupancyLevel(Float vulnerabilityOccupancyLevel) {
        this.vulnerabilityOccupancyLevel = vulnerabilityOccupancyLevel;
    }

    public SovereigntyStructuresResponse vulnerableEndTime(OffsetDateTime vulnerableEndTime) {
        this.vulnerableEndTime = vulnerableEndTime;
        return this;
    }

    /**
     * The time at which the next or current vulnerability window ends. At the
     * end of a vulnerability window the next window is recalculated and locked
     * in along with the vulnerabilityOccupancyLevel. If the structure is not in
     * 100% entosis control of the defender, it will go in to 'overtime' and
     * stay vulnerable for as long as that situation persists. Only once the
     * defenders have 100% entosis control and has the vulnerableEndTime passed
     * does the vulnerability interval expire and a new one is calculated.
     * 
     * @return vulnerableEndTime
     **/
    @ApiModelProperty(example = "null", value = "The time at which the next or current vulnerability window ends. At the end of a vulnerability window the next window is recalculated and locked in along with the vulnerabilityOccupancyLevel. If the structure is not in 100% entosis control of the defender, it will go in to 'overtime' and stay vulnerable for as long as that situation persists. Only once the defenders have 100% entosis control and has the vulnerableEndTime passed does the vulnerability interval expire and a new one is calculated. ")
    public OffsetDateTime getVulnerableEndTime() {
        return vulnerableEndTime;
    }

    public void setVulnerableEndTime(OffsetDateTime vulnerableEndTime) {
        this.vulnerableEndTime = vulnerableEndTime;
    }

    public SovereigntyStructuresResponse vulnerableStartTime(OffsetDateTime vulnerableStartTime) {
        this.vulnerableStartTime = vulnerableStartTime;
        return this;
    }

    /**
     * The next time at which the structure will become vulnerable. Or the start
     * time of the current window if current time is between this and
     * vulnerableEndTime.
     * 
     * @return vulnerableStartTime
     **/
    @ApiModelProperty(example = "null", value = "The next time at which the structure will become vulnerable. Or the start time of the current window if current time is between this and vulnerableEndTime. ")
    public OffsetDateTime getVulnerableStartTime() {
        return vulnerableStartTime;
    }

    public void setVulnerableStartTime(OffsetDateTime vulnerableStartTime) {
        this.vulnerableStartTime = vulnerableStartTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SovereigntyStructuresResponse sovereigntyStructuresResponse = (SovereigntyStructuresResponse) o;
        return Objects.equals(this.allianceId, sovereigntyStructuresResponse.allianceId)
                && Objects.equals(this.solarSystemId, sovereigntyStructuresResponse.solarSystemId)
                && Objects.equals(this.structureId, sovereigntyStructuresResponse.structureId)
                && Objects.equals(this.structureTypeId, sovereigntyStructuresResponse.structureTypeId)
                && Objects.equals(this.vulnerabilityOccupancyLevel,
                        sovereigntyStructuresResponse.vulnerabilityOccupancyLevel)
                && Objects.equals(this.vulnerableEndTime, sovereigntyStructuresResponse.vulnerableEndTime)
                && Objects.equals(this.vulnerableStartTime, sovereigntyStructuresResponse.vulnerableStartTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allianceId, solarSystemId, structureId, structureTypeId, vulnerabilityOccupancyLevel,
                vulnerableEndTime, vulnerableStartTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SovereigntyStructuresResponse {\n");

        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
        sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
        sb.append("    structureTypeId: ").append(toIndentedString(structureTypeId)).append("\n");
        sb.append("    vulnerabilityOccupancyLevel: ").append(toIndentedString(vulnerabilityOccupancyLevel))
                .append("\n");
        sb.append("    vulnerableEndTime: ").append(toIndentedString(vulnerableEndTime)).append("\n");
        sb.append("    vulnerableStartTime: ").append(toIndentedString(vulnerableStartTime)).append("\n");
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
