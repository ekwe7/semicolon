public class VowelSound{
public static void main(String[] args){

//Vowels and consonants

int vowels = 0;
int consonants = 0;
int spaces = 0;
//int lowerCase = word.length();

String word = "Hey welcome to semicolon";
word = word.toLowerCase();

for(int counter = 0; counter <= word.length; counter++){
    char ch = word.charAt(counter);
	if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
		vowels++;
	}
}
System.out.println("Number of vowels is " + vowels++);			

}
}