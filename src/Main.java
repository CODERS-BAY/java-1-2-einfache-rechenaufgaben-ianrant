public class Main {
    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 53;
        double number3 = 32.59;
        double number4 = 21.91;

        System.out.println("Calculations with int values:");
        System.out.printf("%4d + %4d  =  %4d", number1, number2, (number1 + number2));
        System.out.println();
        System.out.printf("%4d - %4d  =  %4d", number1, number2, (number1 - number2));
        System.out.println();
        System.out.printf("%4d * %4d  =  %4d", number1, number2, (number1 * number2));
        System.out.println();
        System.out.printf("%4d / %4d  =  %4d", number1, number2, (number1 / number2));
        System.out.println();
        System.out.println();
        System.out.println("Calculations with int values:");
        System.out.println();
        System.out.printf("%%8.3f + %%8.3f = %8.3f", number3, number4, (number3 + number4));
        System.out.println();
        System.out.printf("%8.3f - %8.3f = %8.3f", number3, number4, (number3 - number4));
        System.out.println();
        System.out.printf("%8.3f * %8.3f = %8.3f", number3, number4, (number3 * number4));
        System.out.println();
        System.out.printf("%8.3f / %8.3f = %8.3f", number3, number4, (number3 / number4));
    }
}
