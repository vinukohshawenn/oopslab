package pay;
import emp.Emplo;
public class Ascpro extends Emplo {
  private double basicPay;
  private String designation;
  public Ascpro(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
  super(empName, empId, address, mailId, mobileNo);
  this.basicPay = basicPay;
  this.designation = "Associate Professor";
  }

public void paySlip() {
  double DA = 0.97 * basicPay;
  double HRA = 0.10 * basicPay;
  double PF = 0.12 * basicPay;
  double staffClubFund = 0.001 * basicPay;
  double grossSalary = basicPay + DA + HRA;
  double netSalary = grossSalary - PF - staffClubFund;
  display();
  System.out.println("Designation: " + designation);
  System.out.println("Basic Pay: " + basicPay);
  System.out.println("Gross Salary: " + grossSalary);
  System.out.println("Net Salary: " + netSalary);
  System.out.println("-------------------------------------------");
  }
}
