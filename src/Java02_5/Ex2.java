package Java02_5;

import java.sql.*;

public class Ex2 {
    public static void main(String[] args) {
         //          Ex2_1();
        //           Ex2_2();
        //           Ex2_3();
        //           Ex2_4();
        //           Ex2_5();
    }
    // Xem toàn bộ 10 cuốn sách mới nhất
    public static void Ex2_1()
    {
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "select * from books where Enable = TRUE Order by DatePublish DESC Limit 10";
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
                System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    //Xem 100 cuốn sách bán chạy nhất
    public static void Ex2_2()
    {
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT Book.IDBook, Book.Name, SUM(OrderDetail.Qty) AS coutBook\n" +
                    "FROM `Order`\n" +
                    "    JOIN Orderdetail ON `Order`.IDOrder = OrderDetail.IDOrder\n" +
                    "    JOIN Book ON OrderDetail.IDBook = Book.IDBook\n" +
                    "WHERE `Order`.CreatedDate > DATE_ADD(CURRENT_DATE, INTERVAL -30 DAY)\n" +
                    "    AND `Order`.Status IN (1, 2, 3, 4, 5)\n" +
                    "    AND `Order`.Enabled = TRUE\n" +
                    "    AND Orderdetail.Enabled = TRUE\n" +
                    "    AND Book.Enabled = TRUE\n" +
                    "GROUP BY Book.IDBook\n" +
                    "ORDER BY coutBook DESC\n" +
                    "LIMIT 100";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next())
            {
                 String Title = rset.getString("Title");
                   System.out.println(Title);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    // Tìm sách theo thể loại (người dùng nhập thể loại, sau đó sẽ hiển thị sách theo thể loại đó)
    public static void Ex2_3()
    {
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT Book.*\n" +
                    "FROM Category\n" +
                    "    JOIN Book on Category.IDCategory = Book.IDCategory\n" +
                    "WHERE Category.Name LIKE '%Ky Nang%'\n" +
                    "    AND Category.Enabled = TRUE";
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
                System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    // Tìm sách theo tên tác giả (người dùng nhập tên tác giả, sau đó sẽ hiển thị toàn bộ sách của tác giả đó)
    public static void Ex2_4()
    {
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT Book.*\n" +
                    "FROM Book\n" +
                    "    JOIN Author on Book.IDAuthor = Author.IDAuthor\n" +
                    "WHERE Author.Name LIKE '%Rosie%'\n" +
                    "    AND Book.Enabled = TRUE\n" +
                    "    AND Author.Enabled = TRUE";
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
                System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    // Xem chi tiết về cuốn sách (người dùng nhập id của sách, hiển thị chi tiết toàn bộ thông tin về sách).
    public static void Ex2_5()
    {
        try(

                Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = connect.createStatement();
        ){
            String strSelect = "SELECT Author.Name, Category.Name, PublishCompany.Name, Book.*\n" +
                    "FROM Book\n" +
                    "    JOIN Author on book.IDAuthor = Author.IDAuthor\n" +
                    "    JOIN Category on book.IDCategory = Category.IDCategory\n" +
                    "    JOIN PublishCompany on book.IDPublishCompany = PublishCompany.IDPublishCompany\n" +
                    "WHERE Book.IDBook = 1\n" +
                    "    AND Book.Enabled = TRUE";
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
                System.out.println(Title + "," + Description + "," + Author + "," + PublishCompany + "," + Category + "," + DatePublish + "," + Price + "," + Qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}