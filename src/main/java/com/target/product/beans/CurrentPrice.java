
package com.target.product.beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CurrentPrice implements Serializable
{

    @SerializedName("value")
    @Expose
    private Float value;
    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    private final static long serialVersionUID = -2163383382585413368L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CurrentPrice() {
    }

    /**
     * 
     * @param currencyCode
     * @param value
     */
    public CurrentPrice(Float value, String currencyCode) {
        super();
        this.value = value;
        this.currencyCode = currencyCode;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).append("currencyCode", currencyCode).toString();
    }

}
