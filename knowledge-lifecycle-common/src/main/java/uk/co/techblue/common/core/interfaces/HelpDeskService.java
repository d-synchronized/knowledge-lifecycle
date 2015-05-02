package uk.co.techblue.common.core.interfaces;

import uk.co.techblue.common.dto.TicketAcknowledgement;

public interface HelpDeskService {

    public TicketAcknowledgement startHelpDeskReviewalProcess(String ticketId);

}
