
package com.target.product.client.pojo;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Enrichment implements Serializable
{

    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("sales_classification_nodes")
    @Expose
    private List<SalesClassificationNode> salesClassificationNodes = null;
    private final static long serialVersionUID = 252955264083931215L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Enrichment() {
    }

    /**
     * 
     * @param salesClassificationNodes
     * @param images
     */
    public Enrichment(List<Image> images, List<SalesClassificationNode> salesClassificationNodes) {
        super();
        this.images = images;
        this.salesClassificationNodes = salesClassificationNodes;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<SalesClassificationNode> getSalesClassificationNodes() {
        return salesClassificationNodes;
    }

    public void setSalesClassificationNodes(List<SalesClassificationNode> salesClassificationNodes) {
        this.salesClassificationNodes = salesClassificationNodes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("images", images).append("salesClassificationNodes", salesClassificationNodes).toString();
    }

}
