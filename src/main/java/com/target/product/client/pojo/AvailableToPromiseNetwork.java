
package com.target.product.client.pojo;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AvailableToPromiseNetwork implements Serializable
{

    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("id_type")
    @Expose
    private String idType;
    @SerializedName("available_to_promise_quantity")
    @Expose
    private Integer availableToPromiseQuantity;
    @SerializedName("street_date")
    @Expose
    private String streetDate;
    @SerializedName("availability")
    @Expose
    private String availability;
    @SerializedName("online_available_to_promise_quantity")
    @Expose
    private Integer onlineAvailableToPromiseQuantity;
    @SerializedName("stores_available_to_promise_quantity")
    @Expose
    private Integer storesAvailableToPromiseQuantity;
    @SerializedName("availability_status")
    @Expose
    private String availabilityStatus;
    @SerializedName("multichannel_options")
    @Expose
    private List<Object> multichannelOptions = null;
    @SerializedName("is_infinite_inventory")
    @Expose
    private Boolean isInfiniteInventory;
    @SerializedName("loyalty_availability_status")
    @Expose
    private String loyaltyAvailabilityStatus;
    @SerializedName("loyalty_purchase_start_date_time")
    @Expose
    private String loyaltyPurchaseStartDateTime;
    @SerializedName("is_loyalty_purchase_enabled")
    @Expose
    private Boolean isLoyaltyPurchaseEnabled;
    @SerializedName("is_out_of_stock_in_all_store_locations")
    @Expose
    private Boolean isOutOfStockInAllStoreLocations;
    @SerializedName("is_out_of_stock_in_all_online_locations")
    @Expose
    private Boolean isOutOfStockInAllOnlineLocations;
    private final static long serialVersionUID = -8987723313770124322L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AvailableToPromiseNetwork() {
    }

    /**
     * 
     * @param isOutOfStockInAllStoreLocations
     * @param isLoyaltyPurchaseEnabled
     * @param idType
     * @param availableToPromiseQuantity
     * @param streetDate
     * @param availabilityStatus
     * @param isOutOfStockInAllOnlineLocations
     * @param loyaltyPurchaseStartDateTime
     * @param multichannelOptions
     * @param productId
     * @param onlineAvailableToPromiseQuantity
     * @param storesAvailableToPromiseQuantity
     * @param loyaltyAvailabilityStatus
     * @param isInfiniteInventory
     * @param availability
     */
    public AvailableToPromiseNetwork(String productId, String idType, Integer availableToPromiseQuantity, String streetDate, String availability, Integer onlineAvailableToPromiseQuantity, Integer storesAvailableToPromiseQuantity, String availabilityStatus, List<Object> multichannelOptions, Boolean isInfiniteInventory, String loyaltyAvailabilityStatus, String loyaltyPurchaseStartDateTime, Boolean isLoyaltyPurchaseEnabled, Boolean isOutOfStockInAllStoreLocations, Boolean isOutOfStockInAllOnlineLocations) {
        super();
        this.productId = productId;
        this.idType = idType;
        this.availableToPromiseQuantity = availableToPromiseQuantity;
        this.streetDate = streetDate;
        this.availability = availability;
        this.onlineAvailableToPromiseQuantity = onlineAvailableToPromiseQuantity;
        this.storesAvailableToPromiseQuantity = storesAvailableToPromiseQuantity;
        this.availabilityStatus = availabilityStatus;
        this.multichannelOptions = multichannelOptions;
        this.isInfiniteInventory = isInfiniteInventory;
        this.loyaltyAvailabilityStatus = loyaltyAvailabilityStatus;
        this.loyaltyPurchaseStartDateTime = loyaltyPurchaseStartDateTime;
        this.isLoyaltyPurchaseEnabled = isLoyaltyPurchaseEnabled;
        this.isOutOfStockInAllStoreLocations = isOutOfStockInAllStoreLocations;
        this.isOutOfStockInAllOnlineLocations = isOutOfStockInAllOnlineLocations;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public Integer getAvailableToPromiseQuantity() {
        return availableToPromiseQuantity;
    }

    public void setAvailableToPromiseQuantity(Integer availableToPromiseQuantity) {
        this.availableToPromiseQuantity = availableToPromiseQuantity;
    }

    public String getStreetDate() {
        return streetDate;
    }

    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Integer getOnlineAvailableToPromiseQuantity() {
        return onlineAvailableToPromiseQuantity;
    }

    public void setOnlineAvailableToPromiseQuantity(Integer onlineAvailableToPromiseQuantity) {
        this.onlineAvailableToPromiseQuantity = onlineAvailableToPromiseQuantity;
    }

    public Integer getStoresAvailableToPromiseQuantity() {
        return storesAvailableToPromiseQuantity;
    }

    public void setStoresAvailableToPromiseQuantity(Integer storesAvailableToPromiseQuantity) {
        this.storesAvailableToPromiseQuantity = storesAvailableToPromiseQuantity;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public List<Object> getMultichannelOptions() {
        return multichannelOptions;
    }

    public void setMultichannelOptions(List<Object> multichannelOptions) {
        this.multichannelOptions = multichannelOptions;
    }

    public Boolean getIsInfiniteInventory() {
        return isInfiniteInventory;
    }

    public void setIsInfiniteInventory(Boolean isInfiniteInventory) {
        this.isInfiniteInventory = isInfiniteInventory;
    }

    public String getLoyaltyAvailabilityStatus() {
        return loyaltyAvailabilityStatus;
    }

    public void setLoyaltyAvailabilityStatus(String loyaltyAvailabilityStatus) {
        this.loyaltyAvailabilityStatus = loyaltyAvailabilityStatus;
    }

    public String getLoyaltyPurchaseStartDateTime() {
        return loyaltyPurchaseStartDateTime;
    }

    public void setLoyaltyPurchaseStartDateTime(String loyaltyPurchaseStartDateTime) {
        this.loyaltyPurchaseStartDateTime = loyaltyPurchaseStartDateTime;
    }

    public Boolean getIsLoyaltyPurchaseEnabled() {
        return isLoyaltyPurchaseEnabled;
    }

    public void setIsLoyaltyPurchaseEnabled(Boolean isLoyaltyPurchaseEnabled) {
        this.isLoyaltyPurchaseEnabled = isLoyaltyPurchaseEnabled;
    }

    public Boolean getIsOutOfStockInAllStoreLocations() {
        return isOutOfStockInAllStoreLocations;
    }

    public void setIsOutOfStockInAllStoreLocations(Boolean isOutOfStockInAllStoreLocations) {
        this.isOutOfStockInAllStoreLocations = isOutOfStockInAllStoreLocations;
    }

    public Boolean getIsOutOfStockInAllOnlineLocations() {
        return isOutOfStockInAllOnlineLocations;
    }

    public void setIsOutOfStockInAllOnlineLocations(Boolean isOutOfStockInAllOnlineLocations) {
        this.isOutOfStockInAllOnlineLocations = isOutOfStockInAllOnlineLocations;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("productId", productId).append("idType", idType).append("availableToPromiseQuantity", availableToPromiseQuantity).append("streetDate", streetDate).append("availability", availability).append("onlineAvailableToPromiseQuantity", onlineAvailableToPromiseQuantity).append("storesAvailableToPromiseQuantity", storesAvailableToPromiseQuantity).append("availabilityStatus", availabilityStatus).append("multichannelOptions", multichannelOptions).append("isInfiniteInventory", isInfiniteInventory).append("loyaltyAvailabilityStatus", loyaltyAvailabilityStatus).append("loyaltyPurchaseStartDateTime", loyaltyPurchaseStartDateTime).append("isLoyaltyPurchaseEnabled", isLoyaltyPurchaseEnabled).append("isOutOfStockInAllStoreLocations", isOutOfStockInAllStoreLocations).append("isOutOfStockInAllOnlineLocations", isOutOfStockInAllOnlineLocations).toString();
    }

}
