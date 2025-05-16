public class MultiplicationTable{
public static int myMultiplicationTable(int number1, int number2){


System.out.println("\t\t\t\t" + "Multiplication Table");
System.out.println("\t\t\t\t" +"---------------------");

	for(int i = 1; i <= 9; i++){
	System.out.print( "\t" + i );
	}
	System.out.println(" ");
System.out.print("\t" + "--------------------------------------------------------------------");
	System.out.println(" ");

	int count = 1;
	int counter;
//for(int i = 1; i <= 9; i++){
	//System.out.print(i + "|");
	
	for(count = number1; count <= number2; count++){
		for(counter = number1; counter <= number2; counter++){
//}
		System.out.print("\t" + counter +"x"+count+"="+ count * counter +"");
	}
	
	//return();
	System.out.println();
}
	return count;





}
}