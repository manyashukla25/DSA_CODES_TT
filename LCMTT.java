import java.util.Scanner;
public class LCMTT {
    public static void main(String[] args) {
      System.out.println("Name: LAVANYA");
      System.out.println("SAP ID: 1000014237\n");
      Scanner sc=new Scanner(System.in);  
      System.out.println("Enter the first number: ");
      int n1=sc.nextInt();
      System.out.println("Enter the second number: ");
      int n2=sc.nextInt();
      int lcm;
      lcm = (n1 > n2) ? n1 : n2;
      while(true) {
        if( lcm % n1 == 0 && lcm % n2 == 0 ) {
          System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
          break;
        }
        ++lcm;
      }
    }
  }
