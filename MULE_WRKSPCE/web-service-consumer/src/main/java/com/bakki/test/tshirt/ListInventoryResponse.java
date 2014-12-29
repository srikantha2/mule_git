
package com.bakki.test.tshirt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="inventory" type="{http://mulesoft.org/tshirt-service}InventoryItem" maxOccurs="unbounded"/>
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
    "inventory"
})
@XmlRootElement(name = "ListInventoryResponse")
public class ListInventoryResponse {

    @XmlElement(required = true)
    protected List<InventoryItem> inventory;

    /**
     * Gets the value of the inventory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryItem }
     * 
     * 
     */
    public List<InventoryItem> getInventory() {
        if (inventory == null) {
            inventory = new ArrayList<InventoryItem>();
        }
        return this.inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param inventory
     *     allowed object is
     *     {@link InventoryItem }
     *     
     */
    public void setInventory(List<InventoryItem> inventory) {
        this.inventory = inventory;
    }

}
