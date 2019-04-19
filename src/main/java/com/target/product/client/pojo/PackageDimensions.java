
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PackageDimensions implements Serializable
{

    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("weight_unit_of_measure")
    @Expose
    private String weightUnitOfMeasure;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("depth")
    @Expose
    private String depth;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("dimension_unit_of_measure")
    @Expose
    private String dimensionUnitOfMeasure;
    private final static long serialVersionUID = -2369285739179640522L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PackageDimensions() {
    }

    /**
     * 
     * @param weightUnitOfMeasure
     * @param dimensionUnitOfMeasure
     * @param height
     * @param weight
     * @param width
     * @param depth
     */
    public PackageDimensions(String weight, String weightUnitOfMeasure, String width, String depth, String height, String dimensionUnitOfMeasure) {
        super();
        this.weight = weight;
        this.weightUnitOfMeasure = weightUnitOfMeasure;
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightUnitOfMeasure() {
        return weightUnitOfMeasure;
    }

    public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
        this.weightUnitOfMeasure = weightUnitOfMeasure;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDimensionUnitOfMeasure() {
        return dimensionUnitOfMeasure;
    }

    public void setDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
        this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("weight", weight).append("weightUnitOfMeasure", weightUnitOfMeasure).append("width", width).append("depth", depth).append("height", height).append("dimensionUnitOfMeasure", dimensionUnitOfMeasure).toString();
    }

}
