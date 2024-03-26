import java.util.Map;
import java.util.Optional;

public class TerminRepo {

    Map<String, Appointment> allAppointments = Map.of("1", new Appointment("1", Weekday.MONDAY));

    public Optional<Appointment> getTerminById(String id) {
        return Optional.ofNullable(allAppointments.get(id));
    }
}
