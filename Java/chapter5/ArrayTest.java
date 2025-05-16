public class ArrayTest{
public static void main(String[] args){

int[] numbers = new int[5];
numbers[0] = 22;
numbers[1] = 51;
numbers[2] = 38;
numbers[3] = 23;
numbers[4] = 48;

int total = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
System.out.println(total);

for(int i = 0; i < numbers.length; i++){
System.out.println(numbers[i] + " ");

	}

System.out.println();

System.out.println(total);
for(int i = 0; i < numbers.length; i++){
System.out.print(numbers[i] + " ");

}





}
}