package breakContinue.breakCustomerSupportSystem;

import java.util.ArrayList;
import java.util.List;

public class CustomerSupport {
    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1, "John", true));
        tickets.add(new Ticket(2, "Doe", false));
        tickets.add(new Ticket(3, "Adam", true));
        tickets.add(new Ticket(4, "John", true));
        tickets.add(new Ticket(5, "Lorem", true));

        String agent = "Doe";
        Ticket firstUnresolvedTicket = null;

        for (Ticket ticket : tickets) {
            if (ticket.getAgentName().equals(agent) && !ticket.isResolved()) {
                firstUnresolvedTicket = ticket;
                break;
            }
        }
        if (firstUnresolvedTicket != null) {
            System.out.println("First unresolved ticket for " + agent+" :"+firstUnresolvedTicket);
        } else {
            System.out.println("No unresolved ticket found for " + agent);
        }
    }
}
