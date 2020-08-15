package bus.reservation.system;

public class TicketCounter {

	private int availableSeats = 3;

	public synchronized void bookTicket(String pName, int numberOfSeats) {
		if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
			System.out.println("Tikcets Booked Successfully for" + pName);
			availableSeats = availableSeats - numberOfSeats;
		} else
			System.out.println("Tickets are not booked for" + pName);
	}
}

//comments: If I remove synchronized keyword then tickets will be booked for John and Martin