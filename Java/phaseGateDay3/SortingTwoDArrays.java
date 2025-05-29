import java.util.Arrays;
public class SortingTwoDArrays{
public static int[] arrayFunctionSquare(int[][] array){

int[][] newArray = array;
int counter = 0;
int count = 0;

for( ;count < array.length; count++){
  for(;counter < array.length; counter++){

	if(array[count] > array[counter]){
	int memo = array[count];
	array[count] = array[counter];
	array[counter] = array[count];
	
}
for(int i = 0; i < newArray.length; i++){
	System.out.print(newArray[i] * newArray[i]);
}

	}
	
}



}
