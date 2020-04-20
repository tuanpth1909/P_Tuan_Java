package Connect;

import java.sql.*;

public class Eployee {
    public static void main(String[] args) {
        try(
                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/buycode?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
                )

        {
          String strSelect = "select name, age, job, adress from human";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String name = rset.getString("name");
                int age = rset.getInt("age");
                String job = rset.getString("job");
                String adress = rset.getString("adress");
                System.out.println(name + "," + age + "," + job + "," + adress );
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }

        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}