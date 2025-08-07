import cc.cc;
import discon.discon;
import timecon.timecon;
import java.util.Scanner;
public class Converter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int mainChoice;
do {
System.out.println("\n--- Main Menu ---");
System.out.println("1. Currency Converter");
System.out.println("2. Distance Converter");
System.out.println("3. Time Converter");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
while (!scanner.hasNextInt()) {
System.out.print("Invalid input. Please enter a number between 1 and 4: ");
scanner.next();
}
mainChoice = scanner.nextInt();
switch (mainChoice) {
case 1 -> curcon(scanner);
case 2 -> distconv(scanner);
case 3 -> timeconv(scanner);
case 4 -> System.out.println("Exiting the application.");
default -> System.out.println("Invalid choice. Please enter a number between 1
and 4.");
}
} while (mainChoice != 4);
scanner.close();
}
public static void curcon(Scanner scanner) {
cc curr = new cc();
System.out.println("\n--- Currency Converter Menu ---");
System.out.println("1. Dollar to INR");
System.out.println("2. INR to Dollar");
System.out.println("3. Euro to INR");
System.out.println("4. INR to Euro");
System.out.println("5. Yen to INR");
System.out.println("6. INR to Yen");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
System.out.print("Enter the amount to convert: ");
double amount = scanner.nextDouble();
switch (choice) {
case 1 -> System.out.printf("%.2f USD is equal to %.2f INR%n", amount,
curr.dollarToInr(amount));
case 2 -> System.out.printf("%.2f INR is equal to %.2f USD%n", amount,
curr.inrToDollar(amount));
case 3 -> System.out.printf("%.2f EUR is equal to %.2f INR%n", amount,
curr.euroToInr(amount));
case 4 -> System.out.printf("%.2f INR is equal to %.2f EUR%n", amount,
curr.inrToEuro(amount));
case 5 -> System.out.printf("%.2f JPY is equal to %.2f INR%n", amount,
curr.yenToInr(amount));
case 6 -> System.out.printf("%.2f INR is equal to %.2f JPY%n", amount,
curr.inrToYen(amount));
default -> System.out.println("Invalid currency conversion choice.");
}
}
  public static void distconv(Scanner scanner) {
  discon dc = new discon();
  System.out.println("\n--- Distance Converter Menu ---");
  System.out.println("1. Meter to Kilometer");
  System.out.println("2. Kilometer to Meter");
  System.out.println("3. Miles to Kilometer");
  System.out.println("4. Kilometer to Miles");
  System.out.print("Enter your choice: ");
  int choice = scanner.nextInt();
  System.out.print("Enter the distance to convert: ");
  double distance = scanner.nextDouble();
  switch (choice) {
  case 1 -> System.out.printf("%.2f meters is equal to %.2f km%n", distance,
  dc.meterToKm(distance));
  case 2 -> System.out.printf("%.2f km is equal to %.2f meters%n", distance,
  dc.kmToMeter(distance));
  case 3 -> System.out.printf("%.2f miles is equal to %.2f km%n", distance,
  dc.milesToKm(distance));
  case 4 -> System.out.printf("%.2f km is equal to %.2f miles%n", distance,
  dc.kmToMiles(distance));
  default -> System.out.println("Invalid distance conversion choice.");
  }
}
  public static void timeconv(Scanner scanner) {
  timecon tc = new timecon();
  System.out.println("\n--- Time Converter Menu ---");
  System.out.println("1. Hours to Minutes");
  System.out.println("2. Minutes to Hours");
  System.out.println("3. Hours to Seconds");
  System.out.println("4. Seconds to Hours");
  System.out.print("Enter your choice: ");
  int choice = scanner.nextInt();
  System.out.print("Enter the time to convert: ");
  double time = scanner.nextDouble();

  switch (choice) {

    case 1 -> System.out.printf("%.2f hours is equal to %.2f minutes%n", time,
    tc.hoursToMinutes(time));

    case 2 -> System.out.printf("%.2f minutes is equal to %.2f hours%n", time,
    tc.minutesToHours(time));

    case 3 -> System.out.printf("%.2f hours is equal to %.2f seconds%n", time,
    tc.hoursToSeconds(time));

    case 4 -> System.out.printf("%.2f seconds is equal to %.2f hours%n", time,
    tc.secondsToHours(time));

    default -> System.out.println("Invalid time conversion choice.");
    }
  }
}
