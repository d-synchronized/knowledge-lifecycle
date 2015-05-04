package uk.co.techblue.common.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class Ticket.
 */
public class Ticket implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5682931194336595844L;

    /** The ticket id. */
    private Long ticketId;

    /** The status. */
    private String status;

    /** The details. */
    private String details;

    /**
     * Gets the ticket id.
     * 
     * @return the ticket id
     */
    public Long getTicketId() {
        return ticketId;
    }

    /**
     * Sets the ticket id.
     * 
     * @param ticketId the new ticket id
     */
    public void setTicketId(final Long ticketId) {
        this.ticketId = ticketId;
    }

    // @Override
    // public String toString() {
    // return ticketId.toString();
    // }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param status the new status
     */
    public void setStatus(final String status) {
        this.status = status;
    }

    /**
     * Gets the details.
     * 
     * @return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the details.
     * 
     * @param details the new details
     */
    public void setDetails(final String details) {
        this.details = details;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
