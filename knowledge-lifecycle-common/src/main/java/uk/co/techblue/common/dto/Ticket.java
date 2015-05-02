package uk.co.techblue.common.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * The Class Ticket.
 */
public class Ticket {

    /** The ticket id. */
    private Long ticketId;

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
