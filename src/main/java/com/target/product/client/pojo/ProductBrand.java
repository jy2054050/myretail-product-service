
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ProductBrand implements Serializable
{

    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("facet_id")
    @Expose
    private String facetId;
    private final static long serialVersionUID = -6331135549490772277L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductBrand() {
    }

    /**
     * 
     * @param facetId
     * @param brand
     */
    public ProductBrand(String brand, String facetId) {
        super();
        this.brand = brand;
        this.facetId = facetId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFacetId() {
        return facetId;
    }

    public void setFacetId(String facetId) {
        this.facetId = facetId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("brand", brand).append("facetId", facetId).toString();
    }

}
