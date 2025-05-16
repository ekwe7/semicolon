import java.util.Scanner;
public class Fahreheit{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter number in fahreheit ");
	double fahreheit = input.nextDouble();

	double celsius = (5 / 9.0) * (fahreheit - 32);
	
	System.out.println("fahreheit " + fahreheit + "is " + celsius);

}
}