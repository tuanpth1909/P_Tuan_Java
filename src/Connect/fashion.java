package Connect;

import java.sql.*;

public class fashion {
    public static void main(String[] args) {
        try(
                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/buycode?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
                ){
            String strSelect = "select nameproduct, namebrand, price, qty from fashion";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()){
                String nameproduct = rset.getString("nameproduct");
                String namebrand = rset.getString("namebrand");
                float price = rset.getFloat("price");
                int qty = rset.getInt("qty");
                System.out.println(nameproduct + "," + namebrand + "," + price + "," + qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}