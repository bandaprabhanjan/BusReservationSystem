package bus.reservation.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import bus.reservation.system.TicketBookingThread;
import bus.reservation.system.TicketCounter;

@SpringBootApplication
public class BusreservationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusreservationSystemApplication.class, args);
		TicketCounter ticketCounter = new TicketCounter();
		TicketBookingThread t1 = new TicketBookingThread(ticketCounter, "John", 2);
		TicketBookingThread t2 = new TicketBookingThread(ticketCounter, "Martin", 2);
		t1.start();
		t2.start();
	}

}
