package com.redhat.ba;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Loan {

    private String type;
    private BigDecimal amount;
    private LocalDate applicationDate;
    private String stateDelivered;


    /**
     * @param type
     * @param amount
     * @param applicationDate
     * @param stateDelivered
     */
    public Loan(String type, BigDecimal amount, LocalDate applicationDate, String stateDelivered) {
        this.type = type;
        this.amount = amount;
        this.applicationDate = applicationDate;
        this.stateDelivered = stateDelivered;
    }

     /**
     * Default Constructor
     */
    public Loan() {
    }


    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return the applicationDate
     */
    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    /**
     * @param applicationDate the applicationDate to set
     */
    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    /**
     * @return the stateDelivered
     */
    public String getStateDelivered() {
        return stateDelivered;
    }

    /**
     * @param stateDelivered the stateDelivered to set
     */
    public void setStateDelivered(String stateDelivered) {
        this.stateDelivered = stateDelivered;
    }

        /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Loan [amount=" + amount + ", applicationDate=" + applicationDate + ", stateDelivered=" + stateDelivered
                + ", type=" + type + "]";
    }


    
}
