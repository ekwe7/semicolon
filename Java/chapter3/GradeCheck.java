import java.util.Scanner;
public class GradeCheck{
public static void main (String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter Student's grade ");
int checkA = input.nextInt();



if(checkA >= 90){
	System.out.println("Your grade is A");
}
else
if(checkA >= 80){
	System.out.println("Your grade is B");
}
else
if(checkA >= 70){
	System.out.println("Your grade is C");
}
else
if(checkA >= 60){
	System.out.println("Your grade is D");
}
else{
	System.out.println("You failed this Exam");
}



}
}