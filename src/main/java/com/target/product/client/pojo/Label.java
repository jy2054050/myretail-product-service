
package com.target.product.client.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Label implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("count")
    @Expose
    private Integer count;
    private final static long serialVersionUID = -1265305320788595510L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Label() {
    }

    /**
     * 
     * @param id
     * @param count
     * @param priority
     * @param name
     * @param type
     */
    public Label(String id, String name, String type, Integer priority, Integer count) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.priority = priority;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("type", type).append("priority", priority).append("count", count).toString();
    }

}
