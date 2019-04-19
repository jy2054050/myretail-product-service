
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ProductVendor implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("manufacturer_style")
    @Expose
    private String manufacturerStyle;
    @SerializedName("vendor_name")
    @Expose
    private String vendorName;
    private final static long serialVersionUID = 706549006319578381L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductVendor() {
    }

    /**
     * 
     * @param id
     * @param manufacturerStyle
     * @param vendorName
     */
    public ProductVendor(String id, String manufacturerStyle, String vendorName) {
        super();
        this.id = id;
        this.manufacturerStyle = manufacturerStyle;
        this.vendorName = vendorName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturerStyle() {
        return manufacturerStyle;
    }

    public void setManufacturerStyle(String manufacturerStyle) {
        this.manufacturerStyle = manufacturerStyle;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("manufacturerStyle", manufacturerStyle).append("vendorName", vendorName).toString();
    }

}
