
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Fulfillment implements Serializable
{

    @SerializedName("is_po_box_prohibited")
    @Expose
    private Boolean isPoBoxProhibited;
    @SerializedName("po_box_prohibited_message")
    @Expose
    private String poBoxProhibitedMessage;
    private final static long serialVersionUID = -452107865222085934L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fulfillment() {
    }

    /**
     * 
     * @param isPoBoxProhibited
     * @param poBoxProhibitedMessage
     */
    public Fulfillment(Boolean isPoBoxProhibited, String poBoxProhibitedMessage) {
        super();
        this.isPoBoxProhibited = isPoBoxProhibited;
        this.poBoxProhibitedMessage = poBoxProhibitedMessage;
    }

    public Boolean getIsPoBoxProhibited() {
        return isPoBoxProhibited;
    }

    public void setIsPoBoxProhibited(Boolean isPoBoxProhibited) {
        this.isPoBoxProhibited = isPoBoxProhibited;
    }

    public String getPoBoxProhibitedMessage() {
        return poBoxProhibitedMessage;
    }

    public void setPoBoxProhibitedMessage(String poBoxProhibitedMessage) {
        this.poBoxProhibitedMessage = poBoxProhibitedMessage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isPoBoxProhibited", isPoBoxProhibited).append("poBoxProhibitedMessage", poBoxProhibitedMessage).toString();
    }

}
