package Connect;

import java.sql.*;

public class JdbcSelectTest {
    public static void main(String[] args) {
        try(
                Connection comn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                               "&useSSL=false" +
                              "&allowPublicKeyRetrieval=true",
                       "root",
                       ""
//                       "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&severTimezone=UTC","root",""
                );
                Statement stmt = comn.createStatement();
                ){
            String strSelect = "select title , price, qty from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + "," + price + "," + qty );
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
