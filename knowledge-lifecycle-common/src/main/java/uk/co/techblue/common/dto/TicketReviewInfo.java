package uk.co.techblue.common.dto;

/**
 * The Class TicketReviewInfo.
 */
public class TicketReviewInfo {

    /** The ticket id. */
    private Long ticketId;

    /** The developer name. */
    private String developerName;

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
     * Gets the developer name.
     * 
     * @return the developer name
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the developer name.
     * 
     * @param developerName the new developer name
     */
    public void setDeveloperName(final String developerName) {
        this.developerName = developerName;
    }

}
