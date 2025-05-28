public class UniqueNumbers{
public static void main(String[] args){

int[] array = {1, 2, 3, 2};

//public static int[] uniqueArrayNumbers(int[] array){

int sum = 0;
for(int count = 0; count < array.length(); count++){
	int total = 0;

	for(int counter = 0; counter < total.length(); counter++){

	if(array[count] == array[counter]){
		sum = total + count;
	}else
	if(array[counter] == 1){
		sum = sum + array[1];
}
	
}

	}
	System.out.print(sum);


}
}