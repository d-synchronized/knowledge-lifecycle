package uk.co.techblue.common.core.interfaces;

import uk.co.techblue.common.dto.Ticket;
import uk.co.techblue.common.dto.TicketAcknowledgement;

public interface HelpDeskService {

    public TicketAcknowledgement startHelpDeskReviewalProcess(Ticket ticket);

}
