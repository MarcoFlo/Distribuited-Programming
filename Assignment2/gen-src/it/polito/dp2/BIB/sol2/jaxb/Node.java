//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.25 at 09:51:43 PM CET 
//


package it.polito.dp2.BIB.sol2.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="labels" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="self" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="create_relationship" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="traverse" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element ref="{}data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "labels",
    "self",
    "createRelationship",
    "traverse",
    "data"
})
@XmlRootElement(name = "node")
public class Node {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String labels;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String self;
    @XmlElement(name = "create_relationship", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String createRelationship;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String traverse;
    @XmlElement(required = true)
    protected Data data;

    /**
     * Gets the value of the labels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabels() {
        return labels;
    }

    /**
     * Sets the value of the labels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabels(String value) {
        this.labels = value;
    }

    /**
     * Gets the value of the self property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelf() {
        return self;
    }

    /**
     * Sets the value of the self property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelf(String value) {
        this.self = value;
    }

    /**
     * Gets the value of the createRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateRelationship() {
        return createRelationship;
    }

    /**
     * Sets the value of the createRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateRelationship(String value) {
        this.createRelationship = value;
    }

    /**
     * Gets the value of the traverse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraverse() {
        return traverse;
    }

    /**
     * Sets the value of the traverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraverse(String value) {
        this.traverse = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
    }

}
