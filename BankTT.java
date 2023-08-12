import java.util.*;
public class BankTT {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Name: LAVANYA");
System.out.println("SAPID: 1000014237\n");
System.out.println("Welcome to City Bank");
System.out.println("Please select the type of loan you want to apply for:");
System.out.println("1. Home Loan");
System.out.println("2. Education Loan");
System.out.println("3. Car Loan");
int choice = scanner.nextInt();
Loan loan = null;
switch (choice) {
case 1:
loan = new HomeLoan();
break;
case 2:
loan = new EducationLoan();
break;
case 3:
loan = new CarLoan();
break;
default:
System.out.println("Invalid choice.");
return;
}
System.out.println("Please enter the loan (amount):");
double amount = scanner.nextDouble();
System.out.println("Please enter the loan duration in months:");
int duration = scanner.nextInt();
EMIPlan plan = loan.calculateEMIPlan(amount, duration);
System.out.println(plan.toString());
scanner.close();
}
}
abstract class Loan {
protected double interestRate;
public abstract EMIPlan calculateEMIPlan(double amount, int duration);
public double getInterestRate() {
return interestRate;
}
}
class HomeLoan extends Loan {
public HomeLoan() {
interestRate = 12.0;
}
public EMIPlan calculateEMIPlan(double amount, int duration) {
double emi = amount * interestRate * Math.pow((1 + interestRate),
duration)
/ (Math.pow((1 + interestRate), duration) - 1);
return new EMIPlan(emi, interestRate);
}
}
class EducationLoan extends Loan {
public EducationLoan() {
interestRate = 7.0;
}
public EMIPlan calculateEMIPlan(double amount, int duration) {
double emi = amount * interestRate * Math.pow((1 + interestRate),
duration)
/ (Math.pow((1 + interestRate), duration) - 1);
return new EMIPlan(emi, interestRate);
}
}
class CarLoan extends Loan {
public CarLoan() {
interestRate = 10.0;
}
public EMIPlan calculateEMIPlan(double amount, int duration) {
double emi = amount * interestRate * Math.pow((1 + interestRate),
duration)
/ (Math.pow((1 + interestRate), duration) - 1);
return new EMIPlan(emi, interestRate);
}
}
class EMIPlan {
private double emi;
private double interestRate;
public EMIPlan(double emi, double interestRate) {
this.emi = emi;
this.interestRate = interestRate;
}
public double getEMI() {
return emi;
}
public double getTotalAmount() {
return emi * interestRate;
}
public String toString() {
return "EMI: " + emi + "\nTotal Amount: " + getTotalAmount();
}
}