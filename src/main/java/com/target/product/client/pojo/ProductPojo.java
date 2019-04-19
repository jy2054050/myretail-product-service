
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ProductPojo implements Serializable
{

    @SerializedName("product")
    @Expose
    private Product product;
    private final static long serialVersionUID = -1803021170449919620L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductPojo() {
    }

    /**
     * 
     * @param product
     */
    public ProductPojo(Product product) {
        super();
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("product", product).toString();
    }

}
