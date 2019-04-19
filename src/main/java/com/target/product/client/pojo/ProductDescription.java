
package com.target.product.client.pojo;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ProductDescription implements Serializable
{

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("bullet_description")
    @Expose
    private List<String> bulletDescription = null;
    private final static long serialVersionUID = 1149743055810622542L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductDescription() {
    }

    /**
     * 
     * @param title
     * @param bulletDescription
     */
    public ProductDescription(String title, List<String> bulletDescription) {
        super();
        this.title = title;
        this.bulletDescription = bulletDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getBulletDescription() {
        return bulletDescription;
    }

    public void setBulletDescription(List<String> bulletDescription) {
        this.bulletDescription = bulletDescription;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("title", title).append("bulletDescription", bulletDescription).toString();
    }

}
