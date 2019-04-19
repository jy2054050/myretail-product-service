
package com.target.product.client.pojo;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DeepRedLabels implements Serializable
{

    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("labels")
    @Expose
    private List<Label> labels = null;
    private final static long serialVersionUID = 3295612927808037193L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeepRedLabels() {
    }

    /**
     * 
     * @param totalCount
     * @param labels
     */
    public DeepRedLabels(Integer totalCount, List<Label> labels) {
        super();
        this.totalCount = totalCount;
        this.labels = labels;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalCount", totalCount).append("labels", labels).toString();
    }

}
