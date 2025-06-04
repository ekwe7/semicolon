import java.util.Scanner;
import java.util.Arrays;

public class EmployeesPayroll{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


int currentMenu = 0;
int previousMenu = -1;
boolean running = true;

String employeeName = "";
double payRate = 0;
double grossPay = 0;
int hoursWorked = 0;
double deduction = 0;
double totalDeduction = 0;
//int[] history = new array[];




while(running){
	int nextMenu;
	switch (currentMenu) {
		case 0 -> nextMenu = showEmployeeMenu(scanner);
		case 1 -> nextMenu = showEmployeeAddMenu(scanner);
		case 2 -> nextMenu = showViewEmployeeMenu(scanner);
                default -> {
System.out.println("Unknown menu, going to main.");
	nextMenu = 0;
}
}

if (nextMenu == -2) {
  running = false;
} else if (nextMenu == -1) {
int temp = currentMenu;
currentMenu = previousMenu;
previousMenu = temp;
} else {
previousMenu = currentMenu;
currentMenu = nextMenu;
}
}

System.out.println("Goodbye! Maybe you would love to try again");
System.out.println("");
}

//EMPLOYEE MAIN MENU
public static int showEmployeeMenu(Scanner scanner) {
System.out.println("\n=== WELCOME TO MY EMPLOYEE'S PAYROLL ===");
System.out.println("1 - Add Employee Payroll");
System.out.println("2 - View Employee Payroll");
System.out.println("0 - Exit");

int choice = scanner.nextInt();
return switch (choice) {
	case 1 -> 1;
	case 2 -> 2;
	case 3 -> 3;
	case 0 -> -2;
	default -> {
System.out.println("Invalid input.");
	yield 1;
     }
    };
}

// ADD TO EMPLOYEE PAY-ROLL
public static int showEmployeeAddMenu(Scanner scanner){

System.out.println("\n=== ADD TO EMPLOYEE'S PAYROLL ===");
System.out.println("Add to Employes's Roll");
System.out.println("Back");

int choice = scanner.nextInt();
switch(choice) {
	case 1 -> System.out.println("Add to Employee Roll");
	case 0 -> { return -1; }
	default -> System.out.println("Invalid input.");
	}

	System.out.println("""
	Add To Employee:
		1. Employee Name 
		2. Hours Worked
		3. Pay-Rate
		4. GrossPay
""");

choice = scanner.nextInt();
switch (choice){
	case 1: System.out.println("=== EDIT EMPLOYEE NAME ===");

		System.out.println("Enter Employee name: ");
		String userName = scanner.nextLine();
		
	//case 2: System.out.print(" ");
		System.out.println("Enter Employee work hour: ");
		int userWorkHour = scanner.nextInt();

	//case 3: System.out.print(" ");
		System.out.println("Enter Employee pay-roll: ");
		double userPayRoll = scanner.nextDouble();

	//case 4: System.out.print(" ");
		System.out.println("Enter Employee deduction rate: ");
		double employeeDeductionRAte = scanner.nextDouble();

double employeeGrossPay = userPayRoll * userWorkHour - employeeDeductionRAte ;

System.out.println(employeeGrossPay);

}
return 2;
}

// VIEW EMPLOYEE PAY-ROLL
public static int showViewEmployeeMenu(Scanner scanner){

System.out.println("\n=== VIEW EMPLOYEE'S PAY-ROLL ===");

System.out.println("Edit Employes's Pay-Roll");
System.out.println("Back");

int choice = scanner.nextInt();
String userChoice = scanner.nextLine();

switch(choice) {
	case 1 -> System.out.println("View to Employee Pay-Roll");
	case 0 -> { return -1; }
	default -> System.out.println("Invalid input.");
	}
	
	System.out.println("""
	Edit To Employee Pay-Roll:
		1. Edit Employee Name 
		2. Edit Hours Worked
		3. Edit Pay-Rate
		4. Edit GrossPay
""");

choice = scanner.nextInt();
switch (choice){
	case 1: System.out.print("You want to edit Employees pay-roll");

		System.out.println("Enter Employee name: ");
		String userName = scanner.nextLine();

		System.out.print("Edit Employees Work_hour: ");
		double userWorkHour = scanner.nextDouble();

		System.out.print("Edit Employees Pay-Roll: ");
		double userPayRoll = scanner.nextDouble();

		System.out.print("Edit Employees deduction rate: ");
		double employeeDeductionRAte = scanner.nextDouble();

	double totalDeduction = userWorkHour * userPayRoll - employeeDeductionRAte;
	System.out.println("Your total pay-roll is: "+ totalDeduction);

}
	
	
return 2;
}



}
        
    