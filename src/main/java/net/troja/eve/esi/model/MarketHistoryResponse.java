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
import java.time.LocalDate;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class MarketHistoryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("date")
    private LocalDate date = null;

    @JsonProperty("order_count")
    private Long orderCount = null;

    @JsonProperty("volume")
    private Long volume = null;

    @JsonProperty("highest")
    private Double highest = null;

    @JsonProperty("average")
    private Double average = null;

    @JsonProperty("lowest")
    private Double lowest = null;

    public MarketHistoryResponse date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * The date of this historical statistic entry
     * 
     * @return date
     **/
    @ApiModelProperty(example = "null", required = true, value = "The date of this historical statistic entry")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public MarketHistoryResponse orderCount(Long orderCount) {
        this.orderCount = orderCount;
        return this;
    }

    /**
     * Total number of orders happened that day
     * 
     * @return orderCount
     **/
    @ApiModelProperty(example = "null", required = true, value = "Total number of orders happened that day")
    public Long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
    }

    public MarketHistoryResponse volume(Long volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Total
     * 
     * @return volume
     **/
    @ApiModelProperty(example = "null", required = true, value = "Total")
    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public MarketHistoryResponse highest(Double highest) {
        this.highest = highest;
        return this;
    }

    /**
     * highest number
     * 
     * @return highest
     **/
    @ApiModelProperty(example = "null", required = true, value = "highest number")
    public Double getHighest() {
        return highest;
    }

    public void setHighest(Double highest) {
        this.highest = highest;
    }

    public MarketHistoryResponse average(Double average) {
        this.average = average;
        return this;
    }

    /**
     * average number
     * 
     * @return average
     **/
    @ApiModelProperty(example = "null", required = true, value = "average number")
    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public MarketHistoryResponse lowest(Double lowest) {
        this.lowest = lowest;
        return this;
    }

    /**
     * lowest number
     * 
     * @return lowest
     **/
    @ApiModelProperty(example = "null", required = true, value = "lowest number")
    public Double getLowest() {
        return lowest;
    }

    public void setLowest(Double lowest) {
        this.lowest = lowest;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketHistoryResponse marketHistoryResponse = (MarketHistoryResponse) o;
        return Objects.equals(this.date, marketHistoryResponse.date)
                && Objects.equals(this.orderCount, marketHistoryResponse.orderCount)
                && Objects.equals(this.volume, marketHistoryResponse.volume)
                && Objects.equals(this.highest, marketHistoryResponse.highest)
                && Objects.equals(this.average, marketHistoryResponse.average)
                && Objects.equals(this.lowest, marketHistoryResponse.lowest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, orderCount, volume, highest, average, lowest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketHistoryResponse {\n");

        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    highest: ").append(toIndentedString(highest)).append("\n");
        sb.append("    average: ").append(toIndentedString(average)).append("\n");
        sb.append("    lowest: ").append(toIndentedString(lowest)).append("\n");
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
