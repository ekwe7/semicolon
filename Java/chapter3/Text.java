import java.util.Scanner;
public class Text{
public static void main(String[] args) {


Scanner input = new Scanner(System.in);

	final double pi = 3.14159;


System.out.println("Enter a radius value ");
double radius = input.nextDouble();

double area = radius * radius * pi;

System.out.println(radius + area);
}
}