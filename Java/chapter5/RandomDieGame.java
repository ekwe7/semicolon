import java.security.SecureRandom;
public class RandomDieGame{
public static void main(String[] args){
SecureRandom numbers = new SecureRandom();
int i = 1;

for(; i <= 5; i++){
	int gameFace = 1 + numbers.nextInt(6);
System.out.printf("%d ", gameFace);

	}
//if(i % 5 == 0)
//System.out.println();
}
}