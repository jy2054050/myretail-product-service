
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DisplayOption implements Serializable
{

    @SerializedName("is_size_chart")
    @Expose
    private Boolean isSizeChart;
    @SerializedName("is_warranty")
    @Expose
    private Boolean isWarranty;
    private final static long serialVersionUID = 7118569024645344281L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DisplayOption() {
    }

    /**
     * 
     * @param isSizeChart
     * @param isWarranty
     */
    public DisplayOption(Boolean isSizeChart, Boolean isWarranty) {
        super();
        this.isSizeChart = isSizeChart;
        this.isWarranty = isWarranty;
    }

    public Boolean getIsSizeChart() {
        return isSizeChart;
    }

    public void setIsSizeChart(Boolean isSizeChart) {
        this.isSizeChart = isSizeChart;
    }

    public Boolean getIsWarranty() {
        return isWarranty;
    }

    public void setIsWarranty(Boolean isWarranty) {
        this.isWarranty = isWarranty;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isSizeChart", isSizeChart).append("isWarranty", isWarranty).toString();
    }

}
