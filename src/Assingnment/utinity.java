package Assingnment;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class utinity {
        //region DataBase_Methods

        public static ResultSet executeQuery(String database, String query) {
            try {
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/" + database + "?" +
                                "&serverTimezone=UTC" +
                                "&allowPublicKeyRetrieval=true" +
                                "&useSSL=false",
                        "root",
                        ""
                );

                Statement statement = connection.createStatement();

                return statement.executeQuery(query);
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            return null;
        }

        public static int executeUpdate(String database, String query) {
            try (
                    Connection connection = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/" + database + "?" +
                                    "&serverTimezone=UTC" +
                                    "&allowPublicKeyRetrieval=true" +
                                    "&useSSL=false",
                            "root",
                            ""
                    );

                    Statement statement = connection.createStatement();
            ) {
                return statement.executeUpdate(query);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return -1;
        }

        public static int getInputInt() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

        public static double getInputDouble() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        }


        public static String getInputLine() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }


        public static void pause_PressEnterToContinue() {
            System.out.println("\n\tNhấn phím [Enter] để tiếp tục...");
            try {
                System.in.read();
                //getInputStringLine();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("[ERROR] " + e);
            }
        }

        public static boolean isConfirm(String message) {
            System.out.print(message + " [Y/N]: ");
            while (true) {
                String confirm = getInputLine();
                switch (confirm) {
                    case "Y":
                    case "y":
                        System.out.println("Bạn chọn [CÓ]");
                        return true;
                    case "N":
                    case "n":
                        System.out.println("Bạn chọn [KHÔNG]");
                        return false;
                    default:
                        System.out.println("[ERROR] Lựa chọn không hợp lệ, mời chọn lại...");
                        break;
                }
            }
        }
        //endregion

}
