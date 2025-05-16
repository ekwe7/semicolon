import java.util.Scanner;
public class Integer{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a value ");
int number = scanner.nextInt();

int sum = 100;

int square = number * number;

if(square > sum)
	System.out.println("Number and it's Square are greater than Sum ");

if(square < sum)
	System.out.println("Number and it's square are less than Sum ");


}
}