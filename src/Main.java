//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        P1();
        P2();
        P3();
        P4();
        P5();
        P6();
        shop();
    }
    public static void P1(){
        int x = 9;
        int y = 7;
        int sum = x + y;
        System.out.println("P1-int Sum is: " + sum);
    }
    public static void P2(){
        double x = 9.7;
        double y = 7.9;
        double sum = x + y;
        System.out.println("P2-double Sum is: " + sum);
    }
    public static void P3(){
        int x = 2;
        double y = 10.5;
        double sum = x + y;
        System.out.println("P3-int+double Sum is: " + sum);
    }
    public static void P4(){
        int x = 10;
        int y = 5;
        int result = x / y;
        System.out.println("P4-result: " + result);

        double z = 10.5;
        double result2 = z / y;
        System.out.println("P4-result: " + result2);
    }
    public static void P5(){
        double x = 10.5;
        double y = 2.5;
        double result = x / y;
        System.out.println("P5-result: " + result);
        int result2 = (int) result;
        System.out.println("P5-result: " + result2);
    }
    public static void P6(){
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println("P6-result: " + q);

        double q2 = (double) y / x;
        System.out.println("P6-result: " + q2);
    }

    public static void shop(){
        double coffee = 5.5;
        double tea = 7.5;
        double cake = 2.5;

        int coffeeQ = 3;
        int teaQ = 4;
        int cakeQ = 2;

        double subtotal = (coffee * coffeeQ) + (tea * teaQ) + (cake * cakeQ);
        double SALES_TAX = 0.06;
        double totalSale = subtotal + (subtotal * SALES_TAX);

        System.out.println("shop-Subtotal: " + "$" + subtotal);
        System.out.println("shop-Total Sale: " + "$" + totalSale);
    }
}