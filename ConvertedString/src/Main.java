//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String boStr = "tRue";
        String byStr = "120";
        String shStr = "32000";
        String inStr = "147895632";
        String loStr = "987654321987654321";
        String doStr = "4444.5d";
        String flStr = "2354.56f";


        boolean booleanValue = Boolean.parseBoolean(boStr);
        System.out.println("Boolean e - " + booleanValue);

        byte byteValue = Byte.parseByte(byStr);
        System.out.println("Byte e - " + byteValue);

        short shortValue = Short.parseShort(shStr);
        System.out.println("Short - e " + shortValue);

        int intValue = Integer.parseInt(inStr);
        System.out.println("Int e - " + intValue);

        long longValue = Long.parseLong(loStr);
        System.out.println("Long e - " + longValue);

        double doubleValue = Double.parseDouble(doStr);
        System.out.println("Double e - " + doubleValue);

        float floatValue = Float.parseFloat(flStr);
        System.out.println("Float e - " + floatValue);
    }
}