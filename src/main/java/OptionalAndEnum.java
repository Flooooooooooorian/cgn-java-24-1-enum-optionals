import java.util.Optional;

public class OptionalAndEnum {

    public static void main(String[] args) {
        Termin termin = new Termin("2", Weekday.MONDAY);
        termin.setWeekDay(Weekday.SATURDAY);


        System.out.println(termin.getWeekDay());

        Termin termin2 = new Termin("3", Weekday.SUNDAY);
        termin2.setWeekDay(Weekday.MONDAY);

        System.out.println(termin2.getWeekDay());

        if (termin.getWeekDay() == Weekday.SATURDAY) {
            System.out.println("Ja es ist Samstag!");
        }

        Weekday.values();


        System.out.println("-----------------------");


        TerminRepo terminRepo = new TerminRepo();

        Optional<Termin> optionalTermin = terminRepo.getTerminById("1");

        System.out.println(optionalTermin);


        if (optionalTermin.isPresent()) {
            Termin t1 = optionalTermin.get();

            System.out.println(t1.getWeekDay());
        }
        else {
            System.out.println("Optional is empty");
        }

    }
}
