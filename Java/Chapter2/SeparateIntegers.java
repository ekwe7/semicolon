import java.util.Scanner;
public class SeparateIntegers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter set of 5 Values ");
int numbers = input.nextInt();

int num1 = 0;
int num2 = 0;
int num3 = 0;
int num4 = 0;
int num5 = 0;

if (numbers >= 10000) {

if (numbers <= 99999) {


num1 = numbers / 10000;
numbers = numbers - num1 * 10000;

num2 = numbers / 1000;
numbers = numbers - num2 * 1000;

num3 = numbers / 100;
numbers = numbers - num3 * 100;

num4 = numbers / 10;
numbers = numbers - num4 * 10;

num5 = numbers;


System.out.printf("%d ", num1);
System.out.printf("%d ", num2);
System.out.printf("%d ", num3);
System.out.printf("%d ", num4);
System.out.printf("%d ", num5);

}
}
}
}