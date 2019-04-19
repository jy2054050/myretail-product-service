
package com.target.product.client.pojo;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Handling implements Serializable
{

    private final static long serialVersionUID = 4977176214284412686L;

    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }

}
