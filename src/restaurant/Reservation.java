package restaurant;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Alina Mustata
 * The Reservation class
 */
class Reservation {
    private final int requiredSeats;
    private final String reservationName;
    private final LocalDate date;
    private final LocalTime time;

    /**
     * Instantiates a new Reservation
     *
     * @param reservationName the reservation name
     * @param requiredSeats   the required seats
     * @param date            the date
     * @param time            the time
     */
    public Reservation(String reservationName, int requiredSeats, LocalDate date, LocalTime time) {
        this.reservationName = reservationName;
        this.requiredSeats = requiredSeats;
        this.date = date;
        this.time = time;
    }

    /**
     * Gets the reservation name
     *
     * @return the reservation name
     */
    public String getReservationName() {
        return reservationName;
    }

    /**
     * Gets the required seats of the reservation
     *
     * @return the required seats for the reservation
     */
    public int getRequiredSeats() {
        return requiredSeats;
    }

    /**
     * Gets the date of the reservation
     *
     * @return the date of the reservation
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Gets the time of the reservation
     *
     * @return the time of the reservation
     */
    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString(){
        return "Reservation: " + this.reservationName
                + " Day: "
                + this.date.format(DateTimeFormatter.ofPattern("dd/MM"))
                + " Time: "
                + this.time.format(DateTimeFormatter.ofPattern("HH:mm"));
    }
}
