public class ArrayClass{
public static void main(String[] agrs){

int scores[][] = new int[3][3];

scores[0][0] = 'X';
scores[0][1] = 'X';
scores[0][2] = 'X';

scores[1][0] = 'X';
scores[1][1] = '0';
scores[1][2] = '0';

scores[2][0] = 'X';
scores[2][1] = 'X';
scores[2][2] = '0';

for(int i = 0; i < scores.length; i++){
	for(int k = 0; k < 3; k++){
System.out.println(scores[i][k] + " ");
	}
}
System.out.println();

}
}