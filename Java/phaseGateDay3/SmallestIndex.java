public class SmallestIndex{
public static void main(String[] args){

//public static int[] smallestIndex(int[] array){
int[] number = {2, 12, 15, 4, 15, 5};
int largest = number[0];
int temp = 0;

for(int index = 0; index < number.length; index++){
		if(number[index] > largest){
		largest = number[index];
		temp = index;
		}


}
System.out.print(temp);

}
}