
package com.abc.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.13
 * Sun Sep 24 17:27:16 IST 2017
 * Generated source version: 2.6.13
 */

@XmlRootElement(name = "listPersonsResponse", namespace = "http://webservice.abc.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listPersonsResponse", namespace = "http://webservice.abc.com/")

public class ListPersonsResponse {

    @XmlElement(name = "return")
    private java.util.List<com.abc.core.Person> _return;

    public java.util.List<com.abc.core.Person> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.List<com.abc.core.Person> new_return)  {
        this._return = new_return;
    }

}

