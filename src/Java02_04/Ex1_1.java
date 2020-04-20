package Java02_04;

import java.sql.*;

public class Ex1_1 {
    public static void main(String[] args) {
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
                ){
          String strSelect = "select title, price from books where author = 'CodeLean VN'";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                System.out.println(title + "," + price);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
