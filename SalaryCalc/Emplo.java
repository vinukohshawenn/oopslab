package emp;
public abstract class Emplo {
private String empName, empId, address, mailId, mobileNo;
  public Emplo(String empName, String empId, String address, String mailId, String mobileNo) {
  this.empName = empName;
  this.empId = empId;
  this.address = address;
  this.mailId = mailId;
  this.mobileNo = mobileNo;
  }

  public void display() {
  System.out.println("-------------------------------------------");
  System.out.println("Employee Name: " + empName);
  System.out.println("Employee ID: " + empId);
  System.out.println("Address: " + address);
  System.out.println("Mail ID: " + mailId);
  System.out.println("Mobile No: " + mobileNo);
  }
public abstract void paySlip();
}
