import java.util.Scanner;
public class StackAdt {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter initial stack size: ");
int initialSize = scanner.nextInt();
scanner.nextLine();
StackArray<String> stack = new StackArray<>(initialSize);
boolean running = true;
while (running) {
System.out.println("\n--- Stack Menu ---");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Display");
System.out.println("4. Exit");
System.out.print("Choice: ");
int choice = scanner.nextInt();
scanner.nextLine();
try {
switch (choice) {
case 1:
System.out.print("Enter value to push: ");
String value = scanner.nextLine();
stack.push(value);
System.out.println(value + " pushed to stack.");
break;
case 2:
String popped = stack.pop();
System.out.println(popped + " popped from stack.");
break;
case 3:
stack.display();
break;
case 4:
System.out.println("Program exiting...");
running = false;
break;
default:
System.out.println("Invalid choice. Please enter 1-4.");
}
} catch (StackOverflowException | StackUnderflowException e) {
System.out.println("Exception: " + e.getMessage());
}
}
scanner.close();
}
}
