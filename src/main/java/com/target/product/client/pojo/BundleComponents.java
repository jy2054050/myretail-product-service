
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BundleComponents implements Serializable
{

    @SerializedName("is_assortment")
    @Expose
    private Boolean isAssortment;
    @SerializedName("is_kit_master")
    @Expose
    private Boolean isKitMaster;
    @SerializedName("is_standard_item")
    @Expose
    private Boolean isStandardItem;
    @SerializedName("is_component")
    @Expose
    private Boolean isComponent;
    private final static long serialVersionUID = 1882457503174350563L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BundleComponents() {
    }

    /**
     * 
     * @param isComponent
     * @param isAssortment
     * @param isStandardItem
     * @param isKitMaster
     */
    public BundleComponents(Boolean isAssortment, Boolean isKitMaster, Boolean isStandardItem, Boolean isComponent) {
        super();
        this.isAssortment = isAssortment;
        this.isKitMaster = isKitMaster;
        this.isStandardItem = isStandardItem;
        this.isComponent = isComponent;
    }

    public Boolean getIsAssortment() {
        return isAssortment;
    }

    public void setIsAssortment(Boolean isAssortment) {
        this.isAssortment = isAssortment;
    }

    public Boolean getIsKitMaster() {
        return isKitMaster;
    }

    public void setIsKitMaster(Boolean isKitMaster) {
        this.isKitMaster = isKitMaster;
    }

    public Boolean getIsStandardItem() {
        return isStandardItem;
    }

    public void setIsStandardItem(Boolean isStandardItem) {
        this.isStandardItem = isStandardItem;
    }

    public Boolean getIsComponent() {
        return isComponent;
    }

    public void setIsComponent(Boolean isComponent) {
        this.isComponent = isComponent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isAssortment", isAssortment).append("isKitMaster", isKitMaster).append("isStandardItem", isStandardItem).append("isComponent", isComponent).toString();
    }

}
