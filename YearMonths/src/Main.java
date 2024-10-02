//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    enum YearsMonths {
        JANUARY("1"), FEBRUARY("2"), MARCH("3"), APRIL("4"), MAY("5"), JUNE("6"), JULY("7"), AUGUST("8"), SEPTEMBER("9"), OCTOMBER("10"), NOVEMBER("11"), DECEMBER("12");

        private String code;

        private YearsMonths(String codeValue) {
            code = codeValue;
        }

        public String getCode() {
            return code;
        }
    }

    public static void main(String[] args) {

        YearsMonths fMY = YearsMonths.SEPTEMBER;
        System.out.println("Today's month is " + fMY + " " + fMY.getCode());

        for (YearsMonths year : YearsMonths.values()) {
            System.out.println(year.name() + "  " + (year.ordinal() + 1));

        }

    }
}