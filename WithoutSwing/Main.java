import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean flag = true;

        while(flag){
            System.out.println("-_-_-_-_-_Welcome To Our Book Exchange Application_-_-_-_-_-");
            System.out.println();
            System.out.println("-_-_-_-_-_-_-_-_Choose The Option To Login As_-_-_-_-_-_-_-_-");
            System.out.println();
            System.out.println("                1. ADMIN");
            System.out.println("                2. CUSTOMER");
            System.out.println("                3. EXIT THE APPLICATION");
            System.out.println();
            System.out.println("-_-_-_-_Enter Your Choice Here_-_-_-_-");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println();
                System.out.println("*******************************************************************");
                // System.out.println("admin");
                Admin adm = new Admin();
                adm.admLogin();
                System.out.println("*******************************************************************");
                System.out.println();
                continue;
            }
            else if(choice == 2){
                System.out.println();
                System.out.println("*******************************************************************");
                System.out.println("customer");
                Customer cust = new Customer();
                cust.custPersDetails();
                System.out.println("*******************************************************************");
                System.out.println();
                continue;
            }
            else if(choice == 3){
                System.out.println();
                System.out.println("*******************************************************************");
                System.out.println();
                System.out.println("-_-_-_-_-_THANKS FOR USING OUR APPLICATION_-_-_-_-_-");
                System.out.println("-_-_-_-_-_-_-_-_-_-_-_VISIT AGAIN_-_-_-_-_-_-_-_-_-_-_-");
                System.out.println();
                System.out.println("*******************************************************************");
                System.out.println();
                break;
            }
            else{
                System.out.println();
                System.out.println("*******************************************************************");
                System.out.println();
                System.out.println("-_-_-_-_-_PLEASE ENTER VALID OPTION_-_-_-_-_-");
                System.out.println();
                System.out.println("*******************************************************************");
                System.out.println();
            }
        }
    }
}