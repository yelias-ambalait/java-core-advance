package collectionFramework.CollectionCapC.Lists.ArrayList.customerSupportTicketManageSystem;

import java.util.ArrayList;

public class TicketSystemArrayList {
    ArrayList<String> tickets;
    public TicketSystemArrayList() {
        tickets = new ArrayList<>();
    }
    public void addTicket(String ticket) {
        tickets.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }
    public String getTicket(int index) {
        if (index >= 0 && index < tickets.size()) {
            return tickets.get(index);
        } else {
            return "Invalid ticket index!";
        }
    }
    public void viewAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets available.");
        } else {
            System.out.println("Tickets List:");
            for (String ticket : tickets) {
                System.out.println(ticket);
            }
        }

    }
}
