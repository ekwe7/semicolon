import java.util.Scanner;
public class GradeSystem{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int total = 0;
int counter = 1;

while(counter <= 5){
	System.out.println("Enter grade ");
	int score = input.nextInt();
	total = total + score;
	counter = counter + 1;
}

	int average = total / 5;
	System.out.println("The total value is " + total);
	System.out.println("The average value is " + average);
}
}