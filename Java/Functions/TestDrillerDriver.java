import java.util.Scanner;
public class TestDrillerDriver{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter number of copies ");
int number = scanner.nextInt();

System.out.print(TestDriller.testDriller(number));


}
}