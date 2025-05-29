import java.util.Arrays;
import java.util.Scanner;
public class FactorsofNumber{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();

int total = 0;
int check = 0;


for(int index = 1; index <= number; index++){
	if(number % index == 0){
	total++;
	}
}

int[] numberFactor = new int[total];
for(int counter = 1; counter <= number; counter++){
	if(number % counter == 0){
	numberFactor[check] = counter;
	check++;
	}
}
System.out.print(Arrays.toString(numberFactor));

}
}