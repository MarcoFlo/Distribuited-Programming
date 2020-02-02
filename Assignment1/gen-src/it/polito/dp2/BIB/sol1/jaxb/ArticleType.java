//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.31 at 06:31:05 PM CET 
//


package it.polito.dp2.BIB.sol1.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArticleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArticleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pad.polito.it/dp2/biblio_e}BiblioItemType">
 *       &lt;attribute name="journal" use="required" type="{http://pad.polito.it/dp2/biblio_e}ISSNCode" />
 *       &lt;attribute name="issue" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArticleType")
public class ArticleType
    extends BiblioItemType
{

    @XmlAttribute(name = "journal", required = true)
    protected String journal;
    @XmlAttribute(name = "issue", required = true)
    protected BigInteger issue;

    /**
     * Gets the value of the journal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournal() {
        return journal;
    }

    /**
     * Sets the value of the journal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournal(String value) {
        this.journal = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIssue(BigInteger value) {
        this.issue = value;
    }

}