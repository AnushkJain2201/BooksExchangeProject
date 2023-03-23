import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.sql.*;

public class Admin {
    static Scanner sc = new Scanner(System.in);

    // int admChoice = 0;
    void showCustomers(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "select * from custdetails";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    void showExchangedBooks(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "select * from excbooks";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    void showDonatedBooks(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "select * from donbooks";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    void showAvailableBooks(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "select * from avlbooks";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void showBooks(){
        while(true){
            System.out.println();
            System.out.println("Here You Have Following Options-->");
            System.out.println();
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Exchanged Books");
            System.out.println("3. Show Donated Books");
            System.out.println("4. Exit To Admin Option Menu");

            int showBookChoice = sc.nextInt();

            if(showBookChoice == 1){
                System.out.println("Showing Available Books");
                System.out.println();

                showAvailableBooks();
            }

            else if(showBookChoice == 2){
                System.out.println("Showing Exchanged Books");
                System.out.println();

                showExchangedBooks();
            }

            else if(showBookChoice == 3){
                System.out.println("Showing Donated Books");
                System.out.println();

                showDonatedBooks();
            }
            else if(showBookChoice == 4){
                System.out.println();
                System.out.println("Exiting To Admin Menu");
                System.out.println();
                break;
            }
        }
        
    }


    public void admLogin() {
        while (true) {
            System.out.println("Enter Your Name");
            System.out.println();
            String admUsNam = sc.nextLine();
            System.out.println("Enter Your Password");
            System.out.println();
            String admPass = sc.nextLine();
            String finCheckAdm = null;
            try {
                BufferedReader br = new BufferedReader(new FileReader(new File("admLogin.txt")));
                String str = null;
                while ((str = br.readLine()) != null) {
                    finCheckAdm = str;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (finCheckAdm.equals(admUsNam + admPass)) {
                System.out.println("LOGIN SCUCESSFUL");
                System.out.println();
                while (true) {
                    System.out.println("-_-_-_-_-_-_-_-_As An ADMIN You Have The Following Options_-_-_-_-_-_-_-_-");
                    System.out.println();
                    System.out.println("1. Show Books");
                    System.out.println("2. Show Customers");
                    System.out.println("4. Exit To Main Menu");
                    int admChoice = sc.nextInt();
                    if (admChoice == 1) {
                        System.out.println();
                        System.out.println("show books");
                        showBooks();
                        System.out.println();

                    }

                    else if(admChoice == 2){
                        System.out.println();
                        showCustomers();
                    }

                    else if (admChoice == 4) {
                        System.out.println("You are Exiting To main menu");
                        System.out.println();
                        System.out.println("****************************************************");
                        break; // to break to main menu
                    } 
                    
                    else {
                        System.out.println();
                        System.out.println("*******************************************************************");
                        System.out.println();
                        System.out.println("-_-_-_-_-_PLEASE ENTER VALID OPTION_-_-_-_-_-");
                        System.out.println();
                        System.out.println("*******************************************************************");
                        System.out.println();
                    }
                }
                
                break;
            } 
            
            else {
                System.out.println("LOGIN FAILED");
            }
        }

    }
}
