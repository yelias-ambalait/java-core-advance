package collectionFramework.CollectionCapC.Lists.LinkedList.customerSupportTicketManageSystem;

public class LinkedListMain {
    public static void main(String[] args) {
        TicketSystemLinkedList systemLinkedList = new TicketSystemLinkedList();
        systemLinkedList.addTicket("Ticket 1: Sleeper");
        systemLinkedList.addTicket("Ticket 2: Barth");
        systemLinkedList.addTicket("Ticket 3: F Seat");
        systemLinkedList.addTicket("Ticket 4: AC Chair");
        systemLinkedList.addTicket("Ticket 5: Shuvon Chair");

        System.out.println();
        systemLinkedList.addUrgentTicket("Ticket 6: Cabinet");

        System.out.println();
        systemLinkedList.showAllTickets();
        System.out.println();

        systemLinkedList.resolveTicket();
        System.out.println();

        systemLinkedList.showAllTickets();


    }
}
