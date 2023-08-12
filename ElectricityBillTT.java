import java.util.Scanner;
public class ElectricityBillTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: LAVANYA");
        System.out.println("SAPID: 1000014237\n");
        System.out.println("Enter your units here: ");
        int units  = sc.nextInt();
        double finalBill = 0;
        if(units <= 199){
            finalBill = units * 1.2;
            System.out.println("Your bill is : " + finalBill);
        }else if(units < 200 && units >= 400){
            finalBill = units * 1.5;
            System.out.println("Your bill is : " + finalBill);
        }else if(units < 400 && units >= 600){
            finalBill = units * 1.8;
            finalBill += finalBill * 0.15;
            System.out.println("Your bill is : " + finalBill);
        }else{
            finalBill = units * 2;
            finalBill += finalBill * 0.15;
            System.out.println("Your bill is : " + finalBill);
        }
        System.out.println("Thank you for your service!");
    }
    }