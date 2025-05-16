

import java.util.Scanner;
public class ComputeAreaCheck{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter the radius of number ");
int number = scanner.nextInt();

for(int i = 0; i <= number; i ++){
	if(i % 2 == 0){
	System.out.print(i + " ");
	}
	
}

}
}