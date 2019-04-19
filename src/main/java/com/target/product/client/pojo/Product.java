
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Product implements Serializable
{

    @SerializedName("deep_red_labels")
    @Expose
    private DeepRedLabels deepRedLabels;
    @SerializedName("available_to_promise_network")
    @Expose
    private AvailableToPromiseNetwork availableToPromiseNetwork;
    @SerializedName("item")
    @Expose
    private Item item;
    private final static long serialVersionUID = -2539458203827567395L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param availableToPromiseNetwork
     * @param item
     * @param deepRedLabels
     */
    public Product(DeepRedLabels deepRedLabels, AvailableToPromiseNetwork availableToPromiseNetwork, Item item) {
        super();
        this.deepRedLabels = deepRedLabels;
        this.availableToPromiseNetwork = availableToPromiseNetwork;
        this.item = item;
    }

    public DeepRedLabels getDeepRedLabels() {
        return deepRedLabels;
    }

    public void setDeepRedLabels(DeepRedLabels deepRedLabels) {
        this.deepRedLabels = deepRedLabels;
    }

    public AvailableToPromiseNetwork getAvailableToPromiseNetwork() {
        return availableToPromiseNetwork;
    }

    public void setAvailableToPromiseNetwork(AvailableToPromiseNetwork availableToPromiseNetwork) {
        this.availableToPromiseNetwork = availableToPromiseNetwork;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deepRedLabels", deepRedLabels).append("availableToPromiseNetwork", availableToPromiseNetwork).append("item", item).toString();
    }

}
