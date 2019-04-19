
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class RecallCompliance implements Serializable
{

    @SerializedName("is_product_recalled")
    @Expose
    private Boolean isProductRecalled;
    private final static long serialVersionUID = 5645730506558052007L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RecallCompliance() {
    }

    /**
     * 
     * @param isProductRecalled
     */
    public RecallCompliance(Boolean isProductRecalled) {
        super();
        this.isProductRecalled = isProductRecalled;
    }

    public Boolean getIsProductRecalled() {
        return isProductRecalled;
    }

    public void setIsProductRecalled(Boolean isProductRecalled) {
        this.isProductRecalled = isProductRecalled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isProductRecalled", isProductRecalled).toString();
    }

}
