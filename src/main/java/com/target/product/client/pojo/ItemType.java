
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ItemType implements Serializable
{

    @SerializedName("category_type")
    @Expose
    private String categoryType;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("name")
    @Expose
    private String name;
    private final static long serialVersionUID = -4808906107988214793L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItemType() {
    }

    /**
     * 
     * @param name
     * @param categoryType
     * @param type
     */
    public ItemType(String categoryType, Integer type, String name) {
        super();
        this.categoryType = categoryType;
        this.type = type;
        this.name = name;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("categoryType", categoryType).append("type", type).append("name", name).toString();
    }

}
