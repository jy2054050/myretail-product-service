
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ContentLabel implements Serializable
{

    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    private final static long serialVersionUID = 264537463825475345L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContentLabel() {
    }

    /**
     * 
     * @param imageUrl
     */
    public ContentLabel(String imageUrl) {
        super();
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("imageUrl", imageUrl).toString();
    }

}
