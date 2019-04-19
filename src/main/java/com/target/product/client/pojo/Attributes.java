
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Attributes implements Serializable
{

    @SerializedName("gift_wrapable")
    @Expose
    private String giftWrapable;
    @SerializedName("has_prop65")
    @Expose
    private String hasProp65;
    @SerializedName("is_hazmat")
    @Expose
    private String isHazmat;
    @SerializedName("max_order_qty")
    @Expose
    private Integer maxOrderQty;
    @SerializedName("street_date")
    @Expose
    private String streetDate;
    @SerializedName("media_format")
    @Expose
    private String mediaFormat;
    @SerializedName("merch_class")
    @Expose
    private String merchClass;
    @SerializedName("merch_classid")
    @Expose
    private Integer merchClassid;
    @SerializedName("merch_subclass")
    @Expose
    private Integer merchSubclass;
    @SerializedName("return_method")
    @Expose
    private String returnMethod;
    private final static long serialVersionUID = 3346349287772486680L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param hasProp65
     * @param streetDate
     * @param giftWrapable
     * @param isHazmat
     * @param merchClassid
     * @param returnMethod
     * @param merchSubclass
     * @param merchClass
     * @param maxOrderQty
     * @param mediaFormat
     */
    public Attributes(String giftWrapable, String hasProp65, String isHazmat, Integer maxOrderQty, String streetDate, String mediaFormat, String merchClass, Integer merchClassid, Integer merchSubclass, String returnMethod) {
        super();
        this.giftWrapable = giftWrapable;
        this.hasProp65 = hasProp65;
        this.isHazmat = isHazmat;
        this.maxOrderQty = maxOrderQty;
        this.streetDate = streetDate;
        this.mediaFormat = mediaFormat;
        this.merchClass = merchClass;
        this.merchClassid = merchClassid;
        this.merchSubclass = merchSubclass;
        this.returnMethod = returnMethod;
    }

    public String getGiftWrapable() {
        return giftWrapable;
    }

    public void setGiftWrapable(String giftWrapable) {
        this.giftWrapable = giftWrapable;
    }

    public String getHasProp65() {
        return hasProp65;
    }

    public void setHasProp65(String hasProp65) {
        this.hasProp65 = hasProp65;
    }

    public String getIsHazmat() {
        return isHazmat;
    }

    public void setIsHazmat(String isHazmat) {
        this.isHazmat = isHazmat;
    }

    public Integer getMaxOrderQty() {
        return maxOrderQty;
    }

    public void setMaxOrderQty(Integer maxOrderQty) {
        this.maxOrderQty = maxOrderQty;
    }

    public String getStreetDate() {
        return streetDate;
    }

    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    public String getMediaFormat() {
        return mediaFormat;
    }

    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    public String getMerchClass() {
        return merchClass;
    }

    public void setMerchClass(String merchClass) {
        this.merchClass = merchClass;
    }

    public Integer getMerchClassid() {
        return merchClassid;
    }

    public void setMerchClassid(Integer merchClassid) {
        this.merchClassid = merchClassid;
    }

    public Integer getMerchSubclass() {
        return merchSubclass;
    }

    public void setMerchSubclass(Integer merchSubclass) {
        this.merchSubclass = merchSubclass;
    }

    public String getReturnMethod() {
        return returnMethod;
    }

    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("giftWrapable", giftWrapable).append("hasProp65", hasProp65).append("isHazmat", isHazmat).append("maxOrderQty", maxOrderQty).append("streetDate", streetDate).append("mediaFormat", mediaFormat).append("merchClass", merchClass).append("merchClassid", merchClassid).append("merchSubclass", merchSubclass).append("returnMethod", returnMethod).toString();
    }

}
