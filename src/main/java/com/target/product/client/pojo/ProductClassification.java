
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ProductClassification implements Serializable
{

    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("product_type_name")
    @Expose
    private String productTypeName;
    @SerializedName("item_type_name")
    @Expose
    private String itemTypeName;
    @SerializedName("item_type")
    @Expose
    private ItemType itemType;
    private final static long serialVersionUID = 9149530932010163570L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductClassification() {
    }

    /**
     * 
     * @param itemTypeName
     * @param productTypeName
     * @param itemType
     * @param productType
     */
    public ProductClassification(String productType, String productTypeName, String itemTypeName, ItemType itemType) {
        super();
        this.productType = productType;
        this.productTypeName = productTypeName;
        this.itemTypeName = itemTypeName;
        this.itemType = itemType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("productType", productType).append("productTypeName", productTypeName).append("itemTypeName", itemTypeName).append("itemType", itemType).toString();
    }

}
