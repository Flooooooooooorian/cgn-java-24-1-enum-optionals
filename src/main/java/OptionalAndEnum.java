import java.util.Optional;

public class OptionalAndEnum {

    public static void main(String[] args) {
        Appointment appointment = new Appointment("2", Weekday.MONDAY);
        appointment.setWeekDay(Weekday.SATURDAY);


        System.out.println(appointment.getWeekDay());

        Appointment appointment2 = new Appointment("3", Weekday.SUNDAY);
        appointment2.setWeekDay(Weekday.MONDAY);

        System.out.println(appointment2.getWeekDay());

        if (appointment.getWeekDay() == Weekday.SATURDAY) {
            System.out.println("Ja es ist Samstag!");
        }

        Weekday.values();


        System.out.println("-----------------------");


        TerminRepo terminRepo = new TerminRepo();

        Optional<Appointment> optionalTermin = terminRepo.getTerminById("1");

        System.out.println(optionalTermin);


        if (optionalTermin.isPresent()) {
            Appointment t1 = optionalTermin.get();

            System.out.println(t1.getWeekDay());
        }
        else {
            System.out.println("Optional is empty");
        }

    }
}
