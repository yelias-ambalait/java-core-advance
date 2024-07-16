package breakContinue.breakCustomerSupportSystem;

public class Ticket {
    private int ticketId;
    private String agentName;
    private boolean resolved;

    public Ticket(int ticketId, String agentName, boolean resolved) {
        this.ticketId = ticketId;
        this.agentName = agentName;
        this.resolved = resolved;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getAgentName() {
        return agentName;
    }

    public boolean isResolved() {
        return resolved;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", agentName='" + agentName + '\'' +
                ", resolved=" + resolved +
                '}';
    }
}
