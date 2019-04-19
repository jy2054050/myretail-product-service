
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class TaxCategory implements Serializable
{

    @SerializedName("tax_class")
    @Expose
    private String taxClass;
    @SerializedName("tax_code_id")
    @Expose
    private Integer taxCodeId;
    @SerializedName("tax_code")
    @Expose
    private String taxCode;
    private final static long serialVersionUID = 1409883307633933956L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TaxCategory() {
    }

    /**
     * 
     * @param taxClass
     * @param taxCodeId
     * @param taxCode
     */
    public TaxCategory(String taxClass, Integer taxCodeId, String taxCode) {
        super();
        this.taxClass = taxClass;
        this.taxCodeId = taxCodeId;
        this.taxCode = taxCode;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public Integer getTaxCodeId() {
        return taxCodeId;
    }

    public void setTaxCodeId(Integer taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("taxClass", taxClass).append("taxCodeId", taxCodeId).append("taxCode", taxCode).toString();
    }

}
