import java.util.Scanner;
public class Circle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Введіть Радіус: ");
        //Вводимо double бо задати можна дробове
        double radius = sc.nextDouble();
        //Площа кола обчислюється за формулою = PI*radius*radius
        double area = Math.PI * (radius * radius);
        System.out.println("Площа кола дорівнює: " + area);
        //Довжина кола обчислюється за формулою = 2*PI*radius
        double circumference= Math.PI * 2*radius;
        System.out.println("Довжина кола дорівнює: " + circumference) ;
    }
}
