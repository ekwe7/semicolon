import java.util.Scanner;
public class GradeStudent{
public static void main(String[] args) {

Scanner input = new Scanner(System.in);


int total = 0;
int gradeCounter = 1;

while(total <= 10){
	System.out.print("Enter grade");
	int grade = input.nextInt();
	total = total + grade;
	gradeCounter ++;
}

	int average = total / 10;

System.out.printf("%n The total number is %d%n ", total);
System.out.printf("The average number of student is %d%n ", average);

}
}