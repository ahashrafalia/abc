
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

@XmlRootElement(name = "addPerson", namespace = "http://webservice.abc.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPerson", namespace = "http://webservice.abc.com/")

public class AddPerson {

    @XmlElement(name = "arg0")
    private com.abc.core.Person arg0;

    public com.abc.core.Person getArg0() {
        return this.arg0;
    }

    public void setArg0(com.abc.core.Person newArg0)  {
        this.arg0 = newArg0;
    }

}

