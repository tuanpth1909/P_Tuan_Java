package Java02_5;

import java.sql.*;

public class Ex3 {
    public static void main(String[] args) {
        //Ex3_1();
        //Ex3_2();
        //Ex3_3();
        //Ex3_4();
        //Ex3_5();
        //Ex3_6();
        //Ex3_7();
        //Ex3_8();
        //Ex3_9();
    }

    public static void Ex3_1(){
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT *\n" +
                    "FROM `Order`\n" +
                    "WHERE Status = 1\n" +
                    "    AND Enabled = TRUE\n" +
                    "ORDER BY CreatedDate DESC\n" +
                    "LIMIT 30";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String Title = rset.getString("Title");
                String Description = rset.getString("Description");
                String Author = rset.getString("Author");
                String PublishCompany = rset.getString("PublishCompany");
                String Category = rset.getString("Category");
                Date DatePublish = rset.getDate("DataPublish");
                float Price = rset.getFloat("Price");
                int Qty = rset.getInt("Qty");
//                System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void Ex3_2(){
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT *\n" +
                    "FROM `Order`\n" +
                    "    JOIN OrderDetail on `order`.IDOrder = OrderDetail.IDOrder\n" +
                    "    JOIN Customer on `order`.IDCustomer = Customer.IDCustomer\n" +
                    "WHERE Customer.IDCustomer = 1\n" +
                    "    AND `Order`.Enabled = TRUE\n" +
                    "    AND OrderDetail.Enabled = TRUE\n" +
                    "    AND Customer.Enabled = TRUE\n" +
                    "ORDER BY `Order`.CreatedDate DESC, `Order`.IDOrder DESC";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String Title = rset.getString("Title");
                String Description = rset.getString("Description");
                String Author = rset.getString("Author");
                String PublishCompany = rset.getString("PublishCompany");
                String Category = rset.getString("Category");
                Date DatePublish = rset.getDate("DataPublish");
                float Price = rset.getFloat("Price");
                int Qty = rset.getInt("Qty");
//                System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void Ex3_3(){
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT Status,\n" +
                    "CASE Status\n" +
                    "    WHEN 1 THEN 'Mới tiếp nhận'\n" +
                    "    WHEN 2 THEN 'Đang chờ xử lý'\n" +
                    "    WHEN 3 THEN 'Đã đóng gói'\n" +
                    "    WHEN 4 THEN 'Đã gửi vận chuyển'\n" +
                    "    WHEN 5 THEN 'Giao hàng thành công'\n" +
                    "    WHEN 0 THEN 'Khách hàng hủy'\n" +
                    "    ELSE '[] Không hợp lệ'\n" +
                    "END StatusString\n" +
                    "FROM `Order`\n" +
                    "WHERE IDOrder = 1\n" +
                    "    AND `Order`.Enabled = TRUE";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String Title = rset.getString("Title");
                String Description = rset.getString("Description");
                String Author = rset.getString("Author");
                String PublishCompany = rset.getString("PublishCompany");
                String Category = rset.getString("Category");
                Date DatePublish = rset.getDate("DataPublish");
                float Price = rset.getFloat("Price");
                int Qty = rset.getInt("Qty");
 //               System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void Ex3_4(){
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT *\n" +
                    "FROM `Order`\n" +
                    "    JOIN OrderDetail on `Order`.IDOrder = OrderDetail.IDOrder\n" +
                    "    JOIN Customer on `order`.IDCustomer = Customer.IDCustomer\n" +
                    "WHERE `Order`.IDOrder = 1\n" +
                    "    AND `Order`.Enabled = TRUE\n" +
                    "    AND OrderDetail.Enabled = TRUE\n" +
                    "    AND Customer.Enabled = TRUE";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String Title = rset.getString("Title");
                String Description = rset.getString("Description");
                String Author = rset.getString("Author");
                String PublishCompany = rset.getString("PublishCompany");
                String Category = rset.getString("Category");
                Date DatePublish = rset.getDate("DataPublish");
                float Price = rset.getFloat("Price");
                int Qty = rset.getInt("Qty");
 //               System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void Ex3_5(){
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT *\n" +
                    "FROM `Order`\n" +
                    "    JOIN OrderDetail on `Order`.IDOrder = OrderDetail.IDOrder\n" +
                    "    JOIN Customer on `order`.IDCustomer = Customer.IDCustomer\n" +
                    "WHERE `Order`.Status = 2\n" +
                    "    AND `Order`.Enabled = TRUE\n" +
                    "    AND OrderDetail.Enabled = TRUE\n" +
                    "    AND Customer.Enabled = TRUE";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String Title = rset.getString("Title");
                String Description = rset.getString("Description");
                String Author = rset.getString("Author");
                String PublishCompany = rset.getString("PublishCompany");
                String Category = rset.getString("Category");
                Date DatePublish = rset.getDate("DataPublish");
                float Price = rset.getFloat("Price");
                int Qty = rset.getInt("Qty");
//                System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void Ex3_6(){
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT *\n" +
                    "FROM `Order`\n" +
                    "    JOIN OrderDetail on `Order`.IDOrder = OrderDetail.IDOrder\n" +
                    "    JOIN Customer on `order`.IDCustomer = Customer.IDCustomer\n" +
                    "WHERE `Order`.Status = 3\n" +
                    "    AND `Order`.Enabled = TRUE\n" +
                    "    AND OrderDetail.Enabled = TRUE\n" +
                    "    AND Customer.Enabled = TRUE";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String Title = rset.getString("Title");
                String Description = rset.getString("Description");
                String Author = rset.getString("Author");
                String PublishCompany = rset.getString("PublishCompany");
                String Category = rset.getString("Category");
                Date DatePublish = rset.getDate("DataPublish");
                float Price = rset.getFloat("Price");
                int Qty = rset.getInt("Qty");
//                System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void Ex3_7(){
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT *\n" +
                    "FROM `Order`\n" +
                    "    JOIN OrderDetail on `Order`.IDOrder = OrderDetail.IDOrder\n" +
                    "    JOIN Customer on `order`.IDCustomer = Customer.IDCustomer\n" +
                    "WHERE `Order`.Status = 4\n" +
                    "    AND `Order`.Enabled = TRUE\n" +
                    "    AND OrderDetail.Enabled = TRUE\n" +
                    "    AND Customer.Enabled = TRUE";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String Title = rset.getString("Title");
                String Description = rset.getString("Description");
                String Author = rset.getString("Author");
                String PublishCompany = rset.getString("PublishCompany");
                String Category = rset.getString("Category");
                Date DatePublish = rset.getDate("DataPublish");
                float Price = rset.getFloat("Price");
                int Qty = rset.getInt("Qty");
 //               System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void Ex3_8(){
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT *\n" +
                    "FROM `Order`\n" +
                    "    JOIN OrderDetail on `Order`.IDOrder = OrderDetail.IDOrder\n" +
                    "    JOIN Customer on `order`.IDCustomer = Customer.IDCustomer\n" +
                    "WHERE `Order`.Status = 5\n" +
                    "    AND `Order`.Enabled = TRUE\n" +
                    "    AND OrderDetail.Enabled = TRUE\n" +
                    "    AND Customer.Enabled = TRUE";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String Title = rset.getString("Title");
                String Description = rset.getString("Description");
                String Author = rset.getString("Author");
                String PublishCompany = rset.getString("PublishCompany");
                String Category = rset.getString("Category");
                Date DatePublish = rset.getDate("DataPublish");
                float Price = rset.getFloat("Price");
                int Qty = rset.getInt("Qty");
//                System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static void Ex3_9(){
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT *\n" +
                    "FROM `Order`\n" +
                    "    JOIN OrderDetail on `Order`.IDOrder = OrderDetail.IDOrder\n" +
                    "    JOIN Customer on `order`.IDCustomer = Customer.IDCustomer\n" +
                    "WHERE `Order`.Status = 0\n" +
                    "    AND `Order`.Enabled = TRUE\n" +
                    "    AND OrderDetail.Enabled = TRUE\n" +
                    "    AND Customer.Enabled = TRUE";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                String Title = rset.getString("Title");
                String Description = rset.getString("Description");
                String Author = rset.getString("Author");
                String PublishCompany = rset.getString("PublishCompany");
                String Category = rset.getString("Category");
                Date DatePublish = rset.getDate("DataPublish");
                float Price = rset.getFloat("Price");
                int Qty = rset.getInt("Qty");
//                System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
