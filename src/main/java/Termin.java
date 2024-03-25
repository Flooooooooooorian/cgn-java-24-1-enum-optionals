public class Termin {

    private String id;
    private Weekday weekDay;


    public Termin(String id, Weekday weekDay) {
        this.id = id;
        this.weekDay = weekDay;
    }

    public Weekday getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(Weekday weekDay) {
        this.weekDay = weekDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
