import java.util.Scanner;
public class Average{
public static void main(String[] args) {

	Scanner scanner = new Scanner (System.in);

	System.out.print("Enter a value ");
	int input1 = scanner.nextInt();
	int input2 = scanner.nextInt();
	int input3 = scanner.nextInt();
	int input4 = scanner.nextInt();
	int input5 = scanner.nextInt();

int largest = input1;
int smallest = input1;
int even = 0;
int countEven = 0;

if(input2 > largest){
	largest = input2;
}
if(input3 > largest){
	largest = input3;
}
if(input4 > largest){
	largest =input4;
}
if(input5 > largest){
	largest = input5;
}

if(input2 < smallest){
	smallest = input2;
}
if(input3 < smallest){
	smallest = input3;
}
if(input4 < smallest){
	smallest = input4;
}
if(input5 < smallest){
	smallest = input5;
}
if(input2 % 2 == 0){
	even += input2;
	countEven = 1;
}
if(input3 % 2 == 0){
	even += input3;
	countEven = countEven + 1;
}
if(input4 % 2 == 0){
	even += input4;
	countEven = countEven + 1;
}
if(input5 % 2 == 0){
	even += input5;
	countEven = countEven + 1;
}

int averageNumber = even / countEven;

System.out.printf("The largest number is %d%n ",  largest);
System.out.printf("The smallest number is %d%n ",  smallest);
System.out.printf("The average of the even number is %d%n ", even);
System.out.printf("The average of even number is %d%n ", countEven);
}
}