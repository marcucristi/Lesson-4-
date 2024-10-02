//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    enum Weekday {
        MONDAY("1"), TUESDAY("2"), WEDNESDAY("3"), THURSDAY("4"), FRIDAY("5"), SATURDAY("6"), SUNDAY("7");

        private String code;

        private Weekday(String codeValue) {
            code = codeValue;
        }

        public String getCode() {
            return code;
        }

        public boolean isWeekDay() {
            if(this == SATURDAY) {
                return false;
            }

            if(this == SUNDAY) {
                return false;
            }
            return true;

        }

        public boolean isHoliday() {
            if (this == SATURDAY) {
                return true;
            }

            if (this == SUNDAY) {
                return true;
            }

            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Is it a week day MONDAY? " + Weekday.MONDAY.isWeekDay());
        System.out.println("Is it a week day TUESDAY? " + Weekday.TUESDAY.isWeekDay());
        System.out.println("Is it a week day WEDNESDAY? " + Weekday.WEDNESDAY.isWeekDay());
        System.out.println("Is it a week day THURSDAY? " + Weekday.THURSDAY.isWeekDay());
        System.out.println("Is it a week day FRIDAY? " + Weekday.FRIDAY.isWeekDay());
        System.out.println("Is it a week day SATURDAY? " + Weekday.SATURDAY.isWeekDay());
        System.out.println("Is it a week day SUNDAY? " + Weekday.SUNDAY.isWeekDay());
    }
}