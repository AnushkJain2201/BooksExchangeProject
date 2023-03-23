import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Customer extends Admin{
    static Scanner sc = new Scanner(System.in);
    private String custName;
    private String custNumber;
    private int custChoice;

    public void showBooks(){
        System.out.println("Following Are The Books Available In Our System");
        System.out.println();
        int i = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query1 = "select * from avlbooks";
            PreparedStatement ps1 = con.prepareStatement(query1);
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next()){
                System.out.println(i + "  " + rs1.getString(2) + "  " + rs1.getString(3));
                i++;
            }
            System.out.println();
            String query2 = "select * from donbooks";
            PreparedStatement ps2 = con.prepareStatement(query2);
            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next()){
                System.out.println(i + "  " + rs2.getString(2) + "  " + rs2.getString(3));
                i++;
            }
            System.out.println();
            String query3 = "select * from excbooks";
            PreparedStatement ps3 = con.prepareStatement(query3);
            ResultSet rs3 = ps3.executeQuery();
            while(rs3.next()){
                System.out.println(i + "  " + rs3.getString(2) + "  " + rs3.getString(3));
                i++;
            }

        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void custTableInput(String name , String number , String date){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "insert into custdetails (customer_name , customer_number , date_time) value (? , ? , ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, number);
            pst.setString(3, date);
            pst.executeLargeUpdate();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    public void custPersDetails(){
        while(true){
            System.out.println("Enter Your Personal Details Here");
            System.out.println();
            System.out.println("Enter Your Name Here");
            custName = sc.nextLine();
            // sc.next();
            System.out.println();
            System.out.println("Enter Your Phone Number");
            custNumber = (sc.nextLine());
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat();
            String dateStr = sdf.format(date);

            custTableInput(custName, custNumber, dateStr);
            System.out.println();
            System.out.println("Your Details Has Been Submitted");
            System.out.println();
            while(true){
                System.out.println("As An Customer You Have Following Options");
                System.out.println();
                System.out.println("1. Show Available Books");
                System.out.println("4. Exit To Main Menu");
                custChoice = sc.nextInt();
                if(custChoice == 1){
                    System.out.println("Showing Available Books");
                    showBooks();
                    System.out.println();
                }
                else if(custChoice == 4){
                    System.out.println("Exiting To Main Menu");
                    System.out.println();
                    break;
                }
                else{
                    System.out.println("Enter Valid Choice");
                    System.out.println();
                }
            }
            break;




        }
    }
}
