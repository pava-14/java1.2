public class Main {
    public static void main(String[] args) {
        // TODO: подставлять номер карты нужно сюда между двойными кавычками, без пробелов
        // String number = "5351719427810741";

        //VISA
        //String number = "4929941954511502";
        //String number = "4024007136611083";

        //VisaElectron
        //String number = "4844221854665498";
        //String number = "4917664743050145";

        //MasterCard
        //String number = "5401081619375276";
        //String number = "5179484915093017";

        //MIR
        //String number = "2201382000000013";
        //String number = "2200000000000061";

        //AmericanExpress
        //String number = "340479580406549"; //FAIL
        //String number = "374935533381435"; //FAIL

        //Visa (13-digit)
        //String number = "4539407299513"; //FAIL
        //String number = "4929228805533"; //FAIL

        //Maestro
        //String number = "586824160825533338"; //FAIL
        String number = "6799990100000000019"; //FAIL

        System.out.println(String.format("%s", number));
        System.out.println(String.format("Result is %s", isValidCardNumber(number) ? "OK" : "FAIL"));
    }


    public static boolean isValidCardNumber(String number) {
        if (number == null) {
            return false;
        }

        if (number.length() != 16) {
            return false;
        }

        long result = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit;
            try {
                digit = Integer.parseInt(number.charAt(i) + "");
            } catch (NumberFormatException e) {
                return false;
            }

            if (i % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            result += digit;
        }

        boolean b = (result != 0) && (result % 10 == 0);
        return b;
    }
}