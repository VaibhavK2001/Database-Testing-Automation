//package org.example;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Main {
//    public static Connection setUp() {
//        String url = "jdbc:mysql://localhost:3306/student";
//        String user = "root";
//        String password = "vaibhav";
//
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Connection is Successfull " + connection);
//
//            return connection;
//
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public static void main(String[] args) {
//
//        setUp();
//        }
//}
