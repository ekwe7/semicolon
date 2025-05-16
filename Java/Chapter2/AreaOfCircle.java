import java.util.Scanner;
public class AreaOfCircle{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the radius of a circle ");
double radius = input.nextDouble();

double area = 0;
double pie = 3.14159;

area = radius * radius * pie;


System.out.printf("The area of a circle of radius " + area);
}
}