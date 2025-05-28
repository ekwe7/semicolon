public class StringWordReverse{
public static void main(String[] args){

String words = "abcdefd";
String wordCompare = "ch";
int count = 0;
int counter = 0;

for(; count < words.length(); count++){
	int checker = 0;
	char checkValues = words.charAt(count);

	for(;counter < words.length(); counter++){
	if(checkValues > count && checkValues == wordCompare){
	checker = checkValues + count;

	}else

	if(words != wordCompare){
	checker = counter;
}
System.out.print(count);

}

	}



}
}