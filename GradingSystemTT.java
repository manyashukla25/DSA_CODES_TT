import java.util.Scanner;
public class GradingSystemTT {
    public static void main(String[] args) {
        System.out.println("Name: LAVANYA");
        System.out.println("SAPID: 1000014237\n");
        System.out.println("Enter your percentage here: ");
        Scanner sc = new Scanner(System.in);
        int percentage  = sc.nextInt();
        if(percentage >= 90){
            System.out.println("Your grade is : Grade A");
        }else if(percentage < 90 && percentage >= 70){
            System.out.println("Your grade is : Grade B");
        }else if(percentage < 70 && percentage >= 60){
            System.out.println("Your grade is : Grade C");
        }else if(percentage < 60 && percentage >= 50) {
            System.out.println("Your grade is : Grade D");
        }
        else{
            System.out.println("Your grade is : F");
        }
    }

}
