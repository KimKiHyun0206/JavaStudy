package 협력하는객체들의공동체.객체들은_역할과_책임을_통해_협력한다;

public class TicketSalesperson {
    Ticket ticket;

    TicketSalesperson(Ticket ticket){
        this.ticket = ticket;
    }

    protected Ticket sellTicket(){
        return this.ticket;
    }
}
