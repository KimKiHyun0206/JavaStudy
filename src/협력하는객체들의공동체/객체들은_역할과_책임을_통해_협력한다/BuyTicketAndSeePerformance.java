package 협력하는객체들의공동체.객체들은_역할과_책임을_통해_협력한다;

public class BuyTicketAndSeePerformance {
    public static void main(String[] args) {
        Actor psy = new Actor("PSY","kangnam style");
        Actor gyuHyun = new Actor("GyuHyun","Gwanghwamun");

        Guest guest = new Guest();


        TicketSalesperson ticketSalesperson1 = new TicketSalesperson(new Ticket(psy));
        TicketSalesperson ticketSalesperson2 = new TicketSalesperson(new Ticket(gyuHyun));

        guest.buyTicket(ticketSalesperson1);

        guest.seePerformance();
    }
}
