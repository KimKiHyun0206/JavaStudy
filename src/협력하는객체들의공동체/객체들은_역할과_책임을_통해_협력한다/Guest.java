package 협력하는객체들의공동체.객체들은_역할과_책임을_통해_협력한다;

public class Guest {
    private Ticket ticket;

    protected void buyTicket(TicketSalesperson ticketSalesperson){
       this.ticket = ticketSalesperson.sellTicket();
    }

    protected void seePerformance(){
        ticket.getActor().performancePlay();
    }
}
