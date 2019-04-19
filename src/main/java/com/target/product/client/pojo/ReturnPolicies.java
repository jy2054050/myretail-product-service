
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ReturnPolicies implements Serializable
{

    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("policyDays")
    @Expose
    private String policyDays;
    @SerializedName("guestMessage")
    @Expose
    private String guestMessage;
    private final static long serialVersionUID = -3493819555181282746L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReturnPolicies() {
    }

    /**
     * 
     * @param policyDays
     * @param guestMessage
     * @param user
     */
    public ReturnPolicies(String user, String policyDays, String guestMessage) {
        super();
        this.user = user;
        this.policyDays = policyDays;
        this.guestMessage = guestMessage;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPolicyDays() {
        return policyDays;
    }

    public void setPolicyDays(String policyDays) {
        this.policyDays = policyDays;
    }

    public String getGuestMessage() {
        return guestMessage;
    }

    public void setGuestMessage(String guestMessage) {
        this.guestMessage = guestMessage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("user", user).append("policyDays", policyDays).append("guestMessage", guestMessage).toString();
    }

}
