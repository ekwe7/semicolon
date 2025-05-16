public class Arraytask{
public static  void main(String[] args){

char[][] checkgame = new char[3][3];
checkgame[0][0] = 'x';
checkgame[0][1] = 'o';
checkgame[0][2] = 'x';

checkgame[1][0] = 'o';
checkgame[1][1] = 'o';
checkgame[1][2] = 'o';

checkgame[2][0] = 'x';
checkgame[2][1] = 'x';
checkgame[2][2] = 'o';

for(int i = 0; i < checkgame.length; i++){
for(int j = 0; j < 3; j++){

System.out.print(checkame[i][j] + " ");

	}
System.out.println();
}



}
}