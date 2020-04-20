package Java02_04;

import java.sql.*;
import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
//        exercises2_1();
//        exercises2_2();
//        exercises2_3();
//        exercises2_4();
//            exercises2_5();
        exercises2_6();
    }

    public static void exercises2_1() {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement();
        ) {
            String strSelect = "select ContactName from customers";
            ResultSet resultSet = statement.executeQuery(strSelect);
            int i = 0;
            System.out.println("Contact name:");
            while (resultSet.next()) {
                String contactName = resultSet.getString("ContactName");
                System.out.println(contactName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void exercises2_2() {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement();
        )  {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Nhap ten ban muon tim:");
            String name = Scanner.next();
            String strSelect = "select * from customers WHERE ContactName = '" + name + "'";
            ResultSet resultSet = statement.executeQuery(strSelect);
            System.out.println("CustomerID \t\t CompanyName \t\t\t\t\t\t\t ContactName \t\t ContactTitle \t\t Address \t\t\t\t\t" +
                    "\t\t  City \t\t\t\t Region \t\t PostalCode \t\t Country \t\t Phone \t\t\t\t Fax");
            while (resultSet.next()) {
                String customerId = resultSet.getString("CustomerID");
                String contactName = resultSet.getString("ContactName");
                String companyName = resultSet.getString("CompanyName");
                String address = resultSet.getString("Address");
                String contactTitle = resultSet.getString("ContactTitle");
                String city = resultSet.getString("City");
                String region = resultSet.getString("Region");
                String postalCode = resultSet.getString("PostalCode");
                String country = resultSet.getString("Country");
                String phone = resultSet.getString("Phone");
                String fix = resultSet.getString("Fax");
                System.out.println(customerId +
                        "\t\t  " + companyName +
                        "\t\t  " + contactName +
                        "\t\t  " + contactTitle +
                        "\t\t\t\t  " + address +
                        "\t\t  " + city +
                        "\t\t  " + region +
                        "\t\t\t  " + postalCode +
                        "\t\t\t\t  " + country +
                        "\t\t  " + phone +
                        "\t\t  " + fix
                );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void exercises2_3() {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement();
        )  {
            String strSelect = "select * from products";
            ResultSet resultSet = statement.executeQuery(strSelect);
            while (resultSet.next()) {
                int ProductId = resultSet.getInt("ProductID");
                String ProductName = resultSet.getString("ProductName");
                int SupplierID = resultSet.getInt("SupplierID");
                int CategoryID = resultSet.getInt("CategoryID");
                String QuantityPerUnit = resultSet.getString("QuantityPerUnit");
                double UnitPrice = resultSet.getDouble("UnitPrice");
                int UnitsInStock = resultSet.getInt("UnitsInStock");
                int UnitsOnOrder = resultSet.getInt("UnitsOnOrder");
                int ReorderLevel = resultSet.getInt("ReorderLevel");
                int Discontinued = resultSet.getInt("Discontinued");
                System.out.println(
//                        ProductId +
                        "\t" + ProductName
//                        "\t" + SupplierID +
//                        "\t" + CategoryID +
//                        "\t" + QuantityPerUnit +
//                        "\t" + UnitPrice +
//                        "\t" + UnitsInStock +
//                        "\t" + UnitsOnOrder +
//                        "\t" + ReorderLevel +
//                        "\t" + Discontinued
                );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void exercises2_4() {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement();
        )  {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Nhap khoang gia A ban muon tim:");
            double numA = Scanner.nextDouble();
            System.out.println("Nhap khoang gia B ban muon tim:");
            double numB = Scanner.nextDouble();
            String strSelect = "select * from Products WHERE unitPrice Between " + numA + "AND  " + numB;
            ResultSet resultSet = statement.executeQuery(strSelect);
            while (resultSet.next()) {
                int ProductId = resultSet.getInt("ProductID");
                String ProductName = resultSet.getString("ProductName");
                int SupplierID = resultSet.getInt("SupplierID");
                int CategoryID = resultSet.getInt("CategoryID");
                String QuantityPerUnit = resultSet.getString("QuantityPerUnit");
                double UnitPrice = resultSet.getDouble("UnitPrice");
                int UnitsInStock = resultSet.getInt("UnitsInStock");
                int UnitsOnOrder = resultSet.getInt("UnitsOnOrder");
                int ReorderLevel = resultSet.getInt("ReorderLevel");
                int Discontinued = resultSet.getInt("Discontinued");
                System.out.println(
                        ProductId +
                                "\t" + ProductName +
                                "\t" + SupplierID +
                                "\t" + CategoryID +
                                "\t" + QuantityPerUnit +
                                "\t" + UnitPrice +
                                "\t" + UnitsInStock +
                                "\t" + UnitsOnOrder +
                                "\t" + ReorderLevel +
                                "\t" + Discontinued
                );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void exercises2_5() {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement();
        )  {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Nhap khoang gia A ban muon tim:");
            double numA = Scanner.nextDouble();
            System.out.println("Nhap khoang gia B ban muon tim:");
            double numB = Scanner.nextDouble();
            String strSelect = "select * from Products WHERE unitPrice Between " + numA + "AND  " + numB;
            ResultSet resultSet = statement.executeQuery(strSelect);
            while (resultSet.next()) {
                int ProductId = resultSet.getInt("ProductID");
                String ProductName = resultSet.getString("ProductName");
                int SupplierID = resultSet.getInt("SupplierID");
                int CategoryID = resultSet.getInt("CategoryID");
                String QuantityPerUnit = resultSet.getString("QuantityPerUnit");
                double UnitPrice = resultSet.getDouble("UnitPrice");
                int UnitsInStock = resultSet.getInt("UnitsInStock");
                int UnitsOnOrder = resultSet.getInt("UnitsOnOrder");
                int ReorderLevel = resultSet.getInt("ReorderLevel");
                int Discontinued = resultSet.getInt("Discontinued");
                System.out.println(
                        ProductId +
                                "\t" + ProductName +
                                "\t" + SupplierID +
                                "\t" + CategoryID +
                                "\t" + QuantityPerUnit +
                                "\t" + UnitPrice +
                                "\t" + UnitsInStock +
                                "\t" + UnitsOnOrder +
                                "\t" + ReorderLevel +
                                "\t" + Discontinued
                );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void exercises2_6() {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement();
        )  {
            System.out.println("Nhap id san pham ban can tim");
            Scanner Scanner = new Scanner(System.in);
            String ctmID = Scanner.next();
            String strSelect = "select * from orders where CustomerID =" + "'" + ctmID + "'";
            ResultSet resultSet = statement.executeQuery(strSelect);
            System.out.println("OrderID \t CustomerID \t EmployeeID \t OrderDate \t\t RequiredDate \t\t\t     ShippedDate \t ShipVia \t\t Freight \t\t ShipName" +
                    "\t\t\t\t ShipAddress \t\t\t ShipCity \t\t ShipRegion \t\t ShipPostalCode \t ShipCountry");
            while (resultSet.next()) {
                int OrderID = resultSet.getInt("OrderID");
                String CustomerID = resultSet.getString("CustomerID");
                int EmployeeID = resultSet.getInt("EmployeeID");
                Date OrderDate = resultSet.getDate("OrderDate");
                Date RequiredDate = resultSet.getDate("RequiredDate");
                Date ShippedDate = resultSet.getDate("ShippedDate");
                int ShipVia = resultSet.getInt("ShipVia");
                double Freight = resultSet.getDouble("Freight");
                String ShipName = resultSet.getString("ShipName");
                String ShipAddress = resultSet.getString("ShipAddress");
                String ShipCity = resultSet.getString("ShipCity");
                String ShipRegion = resultSet.getString("ShipRegion");
                String ShipPostalCode = resultSet.getString("ShipPostalCode");
                String ShipCountry = resultSet.getString("ShipCountry");
                System.out.println(
                        OrderID +
                                "\t\t\t" + CustomerID +
                                "\t\t\t" + EmployeeID +
                                "\t\t\t" + OrderDate +
                                "\t\t\t" + RequiredDate +
                                "\t\t\t" + ShippedDate +
                                "\t\t\t" + ShipVia +
                                "\t\t\t" + Freight +
                                "\t\t\t" + ShipName +
                                "\t\t\t" + ShipAddress+
                                "\t\t\t" + ShipCity+
                                "\t\t\t" + ShipRegion+
                                "\t\t\t    " + ShipPostalCode+
                                "\t\t\t\t" + ShipCountry
                );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}