import java.util.Scanner;
public class MaximumFinder{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter three values ");
double  number1 = scanner.nextDouble();
double  number2 = scanner.nextDouble();
double  number3 = scanner.nextDouble();

double maximum = number1;

if(number2 > maximum){
	maximum = number2;
}
if(number3 > maximum){
	maximum = number3;
}
System.out.println("maximum number is " + maximum);
}
}