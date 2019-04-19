
package com.target.product.client.pojo;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Manufacturer implements Serializable
{

    private final static long serialVersionUID = -758955717089868574L;

    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }

}
