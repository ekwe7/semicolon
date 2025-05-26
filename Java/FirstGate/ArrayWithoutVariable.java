import java.util.Arrays;
public class ArrayWithoutVariable{
public static void main(String[] args){

int[] array = {7, 2, 9, 3, 0};
int counter = 0;
int count = 0;
for( ;count < array.length; count++){

	for(;counter < array.length; counter++){
	if(array[count] > array[counter]){
	int memo = array[count];
	array[count] = array[counter];
	array[counter] = array[count];

}

	}
	System.out.print("Anwser is: " +Arrays.toString(array));
}

}
}