import java.util.Scanner;
public class IncreasePay {
public static void main (String[] args) {

	Scanner scanner = new Scanner(System.in);

System.out.print("Enter the score ");
double score = new scanner.nextDouble();
double pay = 0.0;
double scorew = 0.0;

if(score > 90)
	pay = (pay * 0.03) + pay;


System.out.printf("Score is greater than %d%n", pay);

}
}