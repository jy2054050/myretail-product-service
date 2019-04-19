
package com.target.product.beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ProductResponse implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("current_price")
    @Expose
    private CurrentPrice currentPrice;
    private final static long serialVersionUID = -7434736414142393588L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductResponse() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param currentPrice
     */
    public ProductResponse(Integer id, String name, CurrentPrice currentPrice) {
        super();
        this.id = id;
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("currentPrice", currentPrice).toString();
    }

}
