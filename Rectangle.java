package QWE;

public class Rectangle {
    public double side1,side2;

    public Rectangle(){}

    //Формула для знаходження площі
    public double areaCalculator(double num1,double num2){
        side1 = (num1 * num2);
        return side1;
    }

    //Формула для знаходження периметра прямокутника
    public double perimeterCalculator(double num1,double num2){
        side2 = (num1 + num2)*2;
        return side2;
    }

    public void viewResult(){
        System.out.println("Площа прямокутника: "+side1);
        System.out.println("Периметр прямокутника: "+side2);
    }
}
