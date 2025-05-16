import java.util.Scanner;
public class MultiTable{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your first value ");
int number1 = scanner.nextInt();
System.out.print("Enter your second value ");
int number2 = scanner.nextInt();

MultiplicationTable.myMultiplicationTable(number1, number2);
}
}