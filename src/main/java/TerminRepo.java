import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TerminRepo {

    Map<String, Termin> allAppointments = Map.of("1", new Termin("1", Weekday.MONDAY));

    public Optional<Termin> getTerminById(String id) {
        return Optional.ofNullable(allAppointments.get(id));
    }
}
