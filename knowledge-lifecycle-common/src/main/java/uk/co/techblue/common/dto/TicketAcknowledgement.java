package uk.co.techblue.common.dto;

import java.io.Serializable;

/**
 * The Class TicketAcknowledgement.
 */
public class TicketAcknowledgement implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8423951138379187605L;

    /** The ticket id. */
    private Long ticketId;

    /** The opened successfully. */
    private Boolean openedSuccessfully;

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

    /**
     * Gets the opened successfully.
     * 
     * @return the opened successfully
     */
    public Boolean getOpenedSuccessfully() {
        return openedSuccessfully;
    }

    /**
     * Sets the opened successfully.
     * 
     * @param openedSuccessfully the new opened successfully
     */
    public void setOpenedSuccessfully(final Boolean openedSuccessfully) {
        this.openedSuccessfully = openedSuccessfully;
    }

}
