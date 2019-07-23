package QWE;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть довжину прямокутника: ");
        double num1 = in.nextDouble();
        System.out.println("ВВедіть ширину прямокутника: ");
        double num2 = in.nextDouble();

        rec.perimeterCalculator(num1,num2);
        rec.areaCalculator(num1,num2);

        rec.viewResult();
    }
}