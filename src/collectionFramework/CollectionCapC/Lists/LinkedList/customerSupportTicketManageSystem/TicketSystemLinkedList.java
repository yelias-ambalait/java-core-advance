package collectionFramework.CollectionCapC.Lists.LinkedList.customerSupportTicketManageSystem;

import java.util.LinkedList;

public class TicketSystemLinkedList {
    LinkedList<String> tickets;

    public TicketSystemLinkedList() {
        tickets = new LinkedList<>();
    }

    public void addTicket(String ticket) {
        tickets.add(ticket);
        System.out.println("Added ticket: " + ticket);
    }

    public void addUrgentTicket(String ticket) {
        tickets.addFirst(ticket);
        System.out.println("Urgent ticket added: "+ticket);
    }

    public String resolveTicket() {
        if (!tickets.isEmpty()) {
            String resolveTicket = tickets.remove(0);
            System.out.println("Resolved ticket: "+resolveTicket);
            return resolveTicket;
        } else {
            System.out.println("No tickets to resolve.");
            return null;
        }
    }
    public void showAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets available.");
        } else {
            System.out.println("Tickets List: ");
            for (String ticket : tickets) {
                System.out.println(ticket);
            }
        }
    }
}