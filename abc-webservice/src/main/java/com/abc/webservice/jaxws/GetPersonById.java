
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

@XmlRootElement(name = "getPersonById", namespace = "http://webservice.abc.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonById", namespace = "http://webservice.abc.com/")

public class GetPersonById {

    @XmlElement(name = "arg0")
    private int arg0;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

}

