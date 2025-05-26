public class NumberArray{
public static int arrayFunctionSquare(int[] array){

int[] array = new array[0][];
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
	
}
for(int square : array){
	int anwser = square * 2;
	}
	return answer;
  }


}
