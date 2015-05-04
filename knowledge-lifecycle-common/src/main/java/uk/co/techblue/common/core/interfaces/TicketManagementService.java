package uk.co.techblue.common.core.interfaces;

import uk.co.techblue.common.dto.Ticket;
import uk.co.techblue.common.dto.TicketAcknowledgement;

/**
 * The Interface TicketManagementService.
 */
public interface TicketManagementService {

    TicketAcknowledgement openTicket(Ticket ticket);

    void approveTicket(Ticket ticket);

    void closeTicket(Ticket ticket);

    void requestDetails(Ticket ticket);

    void rejectTicket(Ticket ticket);

}
