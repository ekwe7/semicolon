import java.util.Scanner;
public class ComputeArea{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

/*System.out.print("Enter the radius of number ");
double radius = scanner.nextDouble();


if(radius < 0){
System.out.println("Enter positive number ");
}else{

double area = radius * radius * 3.14159;

System.out.println(radius + " is " + area);

}
*/

System.out.println("Enter a number ");
int number = scanner.nextInt();

System.out.print("Even numbers of " + number + " are ");

for(int i = 0; i <= number; i++){
	if(i % 2 == 0){

System.out.print(i + " ");
}
}

}
}