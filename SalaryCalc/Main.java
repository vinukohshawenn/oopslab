import emp.Emplo;
import pay.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
List<Emplo> employees = new ArrayList<>();
while (true) {
  System.out.println("\n===== Employee Management System =====");
  System.out.println("1. Create a new Employee");
  System.out.println("2. Generate all Payslips");
  System.out.println("3. Exit");
  System.out.print("Enter your choice (1, 2, or 3): ");
  
  int choice = scanner.nextInt();
  scanner.nextLine();
  switch (choice) {
    case 1:
    createEmployee(scanner, employees);
    break;
    
    case 2:
    if (employees.isEmpty()) {
    System.out.println("\nNo employees have been created yet.");
    } 
      else {
    System.out.println("\n--- Generating All Payslips ---");
      for (Emplo emp : employees) {
      emp.paySlip();
      }
    }
    break;
    
    case 3:
    System.out.println("\nExiting program. Goodbye!");
    scanner.close();
    return;
    
    default:
    System.out.println("\nInvalid choice. Please try again.");
    }
   }
  }
  
  public static void createEmployee(Scanner scanner, List<Emplo> employees) {
  System.out.println("\n--- Choose Employee Type ---");
  System.out.println("1. Prog (Programmer)");
  System.out.println("2. Astpro (Assistant Professor)");
  System.out.println("3. Ascpro (Associate Professor)");
  System.out.println("4. Prof (Professor)");
  System.out.print("Enter employee type: ");
  int type = scanner.nextInt();
  scanner.nextLine();
  if (type < 1 || type > 4) {
  System.out.println("Invalid type. Returning to the main menu.");
  return;
  }
    
  System.out.print("Enter Name: ");
  String name = scanner.nextLine();
  System.out.print("Enter ID: ");
  String id = scanner.nextLine();
  System.out.print("Enter Address: ");
  String address = scanner.nextLine();
  System.out.print("Enter Mail ID: ");
  String mail = scanner.nextLine();
  System.out.print("Enter Mobile No: ");
  String mobile = scanner.nextLine();
  System.out.print("Enter Basic Pay: ");
  double basicPay = scanner.nextDouble();
  scanner.nextLine();
    Emplo employee = null;
    switch (type) {
    case 1:
    employee = new Prog(name, id, address, mail, mobile, basicPay);
    break;
    case 2:
    employee = new Astpro(name, id, address, mail, mobile, basicPay);
    break;
    case 3:
    employee = new Ascpro(name, id, address, mail, mobile, basicPay);
    break;
    case 4:
    employee = new Prof(name, id, address, mail, mobile, basicPay);
    break;
    }
  
    employees.add(employee);
    System.out.println("\nEmployee created successfully!");
  }
}
