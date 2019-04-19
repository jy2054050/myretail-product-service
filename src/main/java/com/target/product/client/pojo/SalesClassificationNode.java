
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SalesClassificationNode implements Serializable
{

    @SerializedName("node_id")
    @Expose
    private String nodeId;
    private final static long serialVersionUID = 1723913116143469680L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SalesClassificationNode() {
    }

    /**
     * 
     * @param nodeId
     */
    public SalesClassificationNode(String nodeId) {
        super();
        this.nodeId = nodeId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("nodeId", nodeId).toString();
    }

}
