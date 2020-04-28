package Java02_04;

import java.sql.*;

public class Ex2_3 {
    public static void main(String[] args) {
        try(
                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/northiwnd?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
                ){
            String strSelect = "select * from products";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()){
                int ProductID  = rset.getInt("ProductID");
                String ProductName = rset.getString("ProductName");
                int SupplierID = rset.getInt("SupplierID");
                int CategoryID = rset.getInt("CategoryID");
                String QuantityPerUnit = rset.getString("QuantityPerUnit");
                System.out.println(ProductID + "," + ProductName + "," + SupplierID + "," + CategoryID + "," + QuantityPerUnit);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
