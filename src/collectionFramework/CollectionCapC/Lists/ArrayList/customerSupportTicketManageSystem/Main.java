package collectionFramework.CollectionCapC.Lists.ArrayList.customerSupportTicketManageSystem;

public class Main {
    public static void main(String[] args) {
        TicketSystemArrayList ticketSystem = new TicketSystemArrayList();

        ticketSystem.addTicket("Ticket 1: F-Seat ticket");
        ticketSystem.addTicket("Ticket 2: Cabin barth ticket");
        ticketSystem.addTicket("Ticket 3: S-Chair ticket");

        System.out.println("Getting tickets...");
        System.out.println(ticketSystem.getTicket(1));

        ticketSystem.viewAllTickets();
    }
}
