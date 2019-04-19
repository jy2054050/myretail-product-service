
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class EnvironmentalSegmentation implements Serializable
{

    @SerializedName("is_lead_disclosure")
    @Expose
    private Boolean isLeadDisclosure;
    private final static long serialVersionUID = -8506190766191303557L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnvironmentalSegmentation() {
    }

    /**
     * 
     * @param isLeadDisclosure
     */
    public EnvironmentalSegmentation(Boolean isLeadDisclosure) {
        super();
        this.isLeadDisclosure = isLeadDisclosure;
    }

    public Boolean getIsLeadDisclosure() {
        return isLeadDisclosure;
    }

    public void setIsLeadDisclosure(Boolean isLeadDisclosure) {
        this.isLeadDisclosure = isLeadDisclosure;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isLeadDisclosure", isLeadDisclosure).toString();
    }

}
