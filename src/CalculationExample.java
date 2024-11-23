import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum x + y = " + a);
            System.out.println("Sub x - y = " + b);
            System.out.println("Multi x * y = " + c);
            System.out.println("Div x / y = " + d);
        } catch (Exception e) {
            System.err.println("Exception Occure: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        System.out.println("Nhap y: ");
        int y = sc.nextInt();
        CalculationExample cal = new CalculationExample();
        cal.calculate(x, y);
    }
}
