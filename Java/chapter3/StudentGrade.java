import java.util.Scanner;
public class StudentGrade{
public static void main(String[] args) {

Scanner input = new Scanner(System.in);



int total = 0;
int gradeCounter = 1;

while(gradeCounter <= 10){
	System.out.println("Enter Students Grade ");
	int score = input.nextInt();
	 total = score + total;
	
	gradeCounter++;
}

int average = total / 10;


System.out.println("The total score is " + total);
System.out.println("The average score is " + average);


}
}