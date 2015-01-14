/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd.pkg4414.assignment.pkg1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author c0647610
 */
public class Order {
    private String customerId;
    private String customerName;
    private Date timeRecieved;
    private Date timeProcessed;
    private Date timeFulfilled;
    private final List<Purchase> listOfPurchases = new ArrayList<>();
    private String notes;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getTimeRecieved() {
        return timeRecieved;
    }

    public void setTimeRecieved(Date timeRecieved) {
        this.timeRecieved = timeRecieved;
    }

    public Date getTimeProcessed() {
        return timeProcessed;
    }

    public void setTimeProcessed(Date timeProcessed) {
        this.timeProcessed = timeProcessed;
    }

    public Date getTimeFulfilled() {
        return timeFulfilled;
    }

    public void setTimeFulfilled(Date timeFulfilled) {
        this.timeFulfilled = timeFulfilled;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Order(String customerId, String customerName, Date timeRecieved, Date timeProcessed, Date timeFulfilled, String notes) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.timeRecieved = timeRecieved;
        this.timeProcessed = timeProcessed;
        this.timeFulfilled = timeFulfilled;
        this.notes = notes;
    }

    public Order() {
    }
    
    
    
}
