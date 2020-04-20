package Java02_04;

import java.sql.*;

public class Ex2_1 {
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
            String strSelect = "select * from customers";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
               String CustomerID = rset.getString("CustomerID");
                String CompanyName = rset.getString("CompanyName");
                String ContactName = rset.getString("ContactName");
                String ContactTitle = rset.getString("ContactTitle");
                String Address = rset.getString("Address");
                String City = rset.getString("City");
                String Region = rset.getString("Region");
                String PostalCode = rset.getString("PostalCode");
                String 	Country = rset.getString("Country");
                String Phone = rset.getString("Phone");
                String Fax = rset.getString("Fax");
                System.out.println(CustomerID + "," + CompanyName + "," + ContactName + "," + ContactTitle + "," + Address + "," + City + "," + Region + "," + PostalCode + "," + Country + "," + Phone + "," + Fax);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
