package TheatreTicketBookingSystem.factories;

import TheatreTicketBookingSystem.domain.Reservation;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class ReservationFactory {
    public static Reservation getReservation(Map<String, Object> values){
        Reservation factoryReservation = new Reservation.Builder()
                .reservation_id((Integer)values.get("reservation_id"))
                .seats((ArrayList<Integer>) values.get("seats"))
                .show_id((Integer)values.get("show_id"))
                .total_price((Integer)values.get("total_price"))
                .customer_id((Integer)values.get("customer_id"))
                .build();
        return factoryReservation;
    }
}
