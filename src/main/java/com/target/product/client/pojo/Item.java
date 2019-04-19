
package com.target.product.client.pojo;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Item implements Serializable
{

    @SerializedName("tcin")
    @Expose
    private String tcin;
    @SerializedName("bundle_components")
    @Expose
    private BundleComponents bundleComponents;
    @SerializedName("dpci")
    @Expose
    private String dpci;
    @SerializedName("upc")
    @Expose
    private String upc;
    @SerializedName("product_description")
    @Expose
    private ProductDescription productDescription;
    @SerializedName("buy_url")
    @Expose
    private String buyUrl;
    @SerializedName("variation")
    @Expose
    private Variation variation;
    @SerializedName("enrichment")
    @Expose
    private Enrichment enrichment;
    @SerializedName("return_method")
    @Expose
    private String returnMethod;
    @SerializedName("handling")
    @Expose
    private Handling handling;
    @SerializedName("recall_compliance")
    @Expose
    private RecallCompliance recallCompliance;
    @SerializedName("tax_category")
    @Expose
    private TaxCategory taxCategory;
    @SerializedName("display_option")
    @Expose
    private DisplayOption displayOption;
    @SerializedName("fulfillment")
    @Expose
    private Fulfillment fulfillment;
    @SerializedName("package_dimensions")
    @Expose
    private PackageDimensions packageDimensions;
    @SerializedName("environmental_segmentation")
    @Expose
    private EnvironmentalSegmentation environmentalSegmentation;
    @SerializedName("manufacturer")
    @Expose
    private Manufacturer manufacturer;
    @SerializedName("product_vendors")
    @Expose
    private List<ProductVendor> productVendors = null;
    @SerializedName("product_classification")
    @Expose
    private ProductClassification productClassification;
    @SerializedName("product_brand")
    @Expose
    private ProductBrand productBrand;
    @SerializedName("item_state")
    @Expose
    private String itemState;
    @SerializedName("specifications")
    @Expose
    private List<Object> specifications = null;
    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("country_of_origin")
    @Expose
    private String countryOfOrigin;
    @SerializedName("relationship_type_code")
    @Expose
    private String relationshipTypeCode;
    @SerializedName("subscription_eligible")
    @Expose
    private Boolean subscriptionEligible;
    @SerializedName("ribbons")
    @Expose
    private List<Object> ribbons = null;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("estore_item_status_code")
    @Expose
    private String estoreItemStatusCode;
    @SerializedName("is_proposition_65")
    @Expose
    private Boolean isProposition65;
    @SerializedName("return_policies")
    @Expose
    private ReturnPolicies returnPolicies;
    @SerializedName("gifting_enabled")
    @Expose
    private Boolean giftingEnabled;
    private final static long serialVersionUID = -1786197544528316007L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param estoreItemStatusCode
     * @param productDescription
     * @param enrichment
     * @param variation
     * @param itemState
     * @param recallCompliance
     * @param handling
     * @param tcin
     * @param displayOption
     * @param isProposition65
     * @param productBrand
     * @param environmentalSegmentation
     * @param returnMethod
     * @param bundleComponents
     * @param giftingEnabled
     * @param countryOfOrigin
     * @param tags
     * @param ribbons
     * @param fulfillment
     * @param subscriptionEligible
     * @param taxCategory
     * @param buyUrl
     * @param upc
     * @param packageDimensions
     * @param specifications
     * @param relationshipTypeCode
     * @param returnPolicies
     * @param productClassification
     * @param manufacturer
     * @param productVendors
     * @param attributes
     * @param dpci
     */
    public Item(String tcin, BundleComponents bundleComponents, String dpci, String upc, ProductDescription productDescription, String buyUrl, Variation variation, Enrichment enrichment, String returnMethod, Handling handling, RecallCompliance recallCompliance, TaxCategory taxCategory, DisplayOption displayOption, Fulfillment fulfillment, PackageDimensions packageDimensions, EnvironmentalSegmentation environmentalSegmentation, Manufacturer manufacturer, List<ProductVendor> productVendors, ProductClassification productClassification, ProductBrand productBrand, String itemState, List<Object> specifications, Attributes attributes, String countryOfOrigin, String relationshipTypeCode, Boolean subscriptionEligible, List<Object> ribbons, List<Object> tags, String estoreItemStatusCode, Boolean isProposition65, ReturnPolicies returnPolicies, Boolean giftingEnabled) {
        super();
        this.tcin = tcin;
        this.bundleComponents = bundleComponents;
        this.dpci = dpci;
        this.upc = upc;
        this.productDescription = productDescription;
        this.buyUrl = buyUrl;
        this.variation = variation;
        this.enrichment = enrichment;
        this.returnMethod = returnMethod;
        this.handling = handling;
        this.recallCompliance = recallCompliance;
        this.taxCategory = taxCategory;
        this.displayOption = displayOption;
        this.fulfillment = fulfillment;
        this.packageDimensions = packageDimensions;
        this.environmentalSegmentation = environmentalSegmentation;
        this.manufacturer = manufacturer;
        this.productVendors = productVendors;
        this.productClassification = productClassification;
        this.productBrand = productBrand;
        this.itemState = itemState;
        this.specifications = specifications;
        this.attributes = attributes;
        this.countryOfOrigin = countryOfOrigin;
        this.relationshipTypeCode = relationshipTypeCode;
        this.subscriptionEligible = subscriptionEligible;
        this.ribbons = ribbons;
        this.tags = tags;
        this.estoreItemStatusCode = estoreItemStatusCode;
        this.isProposition65 = isProposition65;
        this.returnPolicies = returnPolicies;
        this.giftingEnabled = giftingEnabled;
    }

    public String getTcin() {
        return tcin;
    }

    public void setTcin(String tcin) {
        this.tcin = tcin;
    }

    public BundleComponents getBundleComponents() {
        return bundleComponents;
    }

    public void setBundleComponents(BundleComponents bundleComponents) {
        this.bundleComponents = bundleComponents;
    }

    public String getDpci() {
        return dpci;
    }

    public void setDpci(String dpci) {
        this.dpci = dpci;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    public String getBuyUrl() {
        return buyUrl;
    }

    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public Variation getVariation() {
        return variation;
    }

    public void setVariation(Variation variation) {
        this.variation = variation;
    }

    public Enrichment getEnrichment() {
        return enrichment;
    }

    public void setEnrichment(Enrichment enrichment) {
        this.enrichment = enrichment;
    }

    public String getReturnMethod() {
        return returnMethod;
    }

    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
    }

    public Handling getHandling() {
        return handling;
    }

    public void setHandling(Handling handling) {
        this.handling = handling;
    }

    public RecallCompliance getRecallCompliance() {
        return recallCompliance;
    }

    public void setRecallCompliance(RecallCompliance recallCompliance) {
        this.recallCompliance = recallCompliance;
    }

    public TaxCategory getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(TaxCategory taxCategory) {
        this.taxCategory = taxCategory;
    }

    public DisplayOption getDisplayOption() {
        return displayOption;
    }

    public void setDisplayOption(DisplayOption displayOption) {
        this.displayOption = displayOption;
    }

    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    public void setPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    public EnvironmentalSegmentation getEnvironmentalSegmentation() {
        return environmentalSegmentation;
    }

    public void setEnvironmentalSegmentation(EnvironmentalSegmentation environmentalSegmentation) {
        this.environmentalSegmentation = environmentalSegmentation;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<ProductVendor> getProductVendors() {
        return productVendors;
    }

    public void setProductVendors(List<ProductVendor> productVendors) {
        this.productVendors = productVendors;
    }

    public ProductClassification getProductClassification() {
        return productClassification;
    }

    public void setProductClassification(ProductClassification productClassification) {
        this.productClassification = productClassification;
    }

    public ProductBrand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
    }

    public String getItemState() {
        return itemState;
    }

    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

    public List<Object> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<Object> specifications) {
        this.specifications = specifications;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    public void setRelationshipTypeCode(String relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
    }

    public Boolean getSubscriptionEligible() {
        return subscriptionEligible;
    }

    public void setSubscriptionEligible(Boolean subscriptionEligible) {
        this.subscriptionEligible = subscriptionEligible;
    }

    public List<Object> getRibbons() {
        return ribbons;
    }

    public void setRibbons(List<Object> ribbons) {
        this.ribbons = ribbons;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public String getEstoreItemStatusCode() {
        return estoreItemStatusCode;
    }

    public void setEstoreItemStatusCode(String estoreItemStatusCode) {
        this.estoreItemStatusCode = estoreItemStatusCode;
    }

    public Boolean getIsProposition65() {
        return isProposition65;
    }

    public void setIsProposition65(Boolean isProposition65) {
        this.isProposition65 = isProposition65;
    }

    public ReturnPolicies getReturnPolicies() {
        return returnPolicies;
    }

    public void setReturnPolicies(ReturnPolicies returnPolicies) {
        this.returnPolicies = returnPolicies;
    }

    public Boolean getGiftingEnabled() {
        return giftingEnabled;
    }

    public void setGiftingEnabled(Boolean giftingEnabled) {
        this.giftingEnabled = giftingEnabled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tcin", tcin).append("bundleComponents", bundleComponents).append("dpci", dpci).append("upc", upc).append("productDescription", productDescription).append("buyUrl", buyUrl).append("variation", variation).append("enrichment", enrichment).append("returnMethod", returnMethod).append("handling", handling).append("recallCompliance", recallCompliance).append("taxCategory", taxCategory).append("displayOption", displayOption).append("fulfillment", fulfillment).append("packageDimensions", packageDimensions).append("environmentalSegmentation", environmentalSegmentation).append("manufacturer", manufacturer).append("productVendors", productVendors).append("productClassification", productClassification).append("productBrand", productBrand).append("itemState", itemState).append("specifications", specifications).append("attributes", attributes).append("countryOfOrigin", countryOfOrigin).append("relationshipTypeCode", relationshipTypeCode).append("subscriptionEligible", subscriptionEligible).append("ribbons", ribbons).append("tags", tags).append("estoreItemStatusCode", estoreItemStatusCode).append("isProposition65", isProposition65).append("returnPolicies", returnPolicies).append("giftingEnabled", giftingEnabled).toString();
    }

}
