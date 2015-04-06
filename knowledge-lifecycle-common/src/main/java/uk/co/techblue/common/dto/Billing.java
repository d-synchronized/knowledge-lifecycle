package uk.co.techblue.common.dto;

import java.util.Date;

import uk.co.techblue.common.dto.patient.Patient;

/**
 * The Class Billing.
 */
public class Billing {

    /** The billing id. */
    private Long billingId;

    /** The amount. */
    private Double amount;

    /** The billing at. */
    private Date billingAt;

    /** The paid on. */
    private Date paidOn;

    /** The patient. */
    private Patient patient;

    /**
     * Gets the billing id.
     * 
     * @return the billing id
     */
    public Long getBillingId() {
        return billingId;
    }

    /**
     * Sets the billing id.
     * 
     * @param billingId the new billing id
     */
    public void setBillingId(final Long billingId) {
        this.billingId = billingId;
    }

    /**
     * Gets the amount.
     * 
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the amount.
     * 
     * @param amount the new amount
     */
    public void setAmount(final Double amount) {
        this.amount = amount;
    }

    /**
     * Gets the billing at.
     * 
     * @return the billing at
     */
    public Date getBillingAt() {
        return billingAt;
    }

    /**
     * Sets the billing at.
     * 
     * @param billingAt the new billing at
     */
    public void setBillingAt(final Date billingAt) {
        this.billingAt = billingAt;
    }

    /**
     * Gets the paid on.
     * 
     * @return the paid on
     */
    public Date getPaidOn() {
        return paidOn;
    }

    /**
     * Sets the paid on.
     * 
     * @param paidOn the new paid on
     */
    public void setPaidOn(final Date paidOn) {
        this.paidOn = paidOn;
    }

    /**
     * Gets the patient.
     * 
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Sets the patient.
     * 
     * @param patient the new patient
     */
    public void setPatient(final Patient patient) {
        this.patient = patient;
    }

}
