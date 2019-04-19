
package com.target.product.client.pojo;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Variation implements Serializable
{

    private final static long serialVersionUID = -4578844664484336339L;

    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }

}
