
package com.target.product.client.pojo;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Image implements Serializable
{

    @SerializedName("base_url")
    @Expose
    private String baseUrl;
    @SerializedName("primary")
    @Expose
    private String primary;
    @SerializedName("content_labels")
    @Expose
    private List<ContentLabel> contentLabels = null;
    private final static long serialVersionUID = -1285069956718781859L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param baseUrl
     * @param contentLabels
     * @param primary
     */
    public Image(String baseUrl, String primary, List<ContentLabel> contentLabels) {
        super();
        this.baseUrl = baseUrl;
        this.primary = primary;
        this.contentLabels = contentLabels;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public List<ContentLabel> getContentLabels() {
        return contentLabels;
    }

    public void setContentLabels(List<ContentLabel> contentLabels) {
        this.contentLabels = contentLabels;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("baseUrl", baseUrl).append("primary", primary).append("contentLabels", contentLabels).toString();
    }

}
