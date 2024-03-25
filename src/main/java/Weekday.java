public enum Weekday {

    MONDAY("mo"),
    TUESDAY("tu"),
    WEDNESDAY("we"),
    THURSDAY("th"),
    FRIDAY("fr"),
    SATURDAY("sa"),
    SUNDAY("su");

    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }

    Weekday(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String toString() {
        return super.toString() + " - " + abbreviation;
    }
}
