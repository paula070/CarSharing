//package pl.sda.orange.java2.carsharing.Login;
//
//import java.sql.*;
//import java.util.Scanner;

//public class LoginSystemWithH2 {
  //  private static final String DB_URL = "jdbc:h2:~/test";
    //private static final String DB_USER = "test";
    //private static final String DB_PASSWORD = "test";

    //private Connection connection;

    //public LoginSystemWithH2() {
        //try {
         //   connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         //   createTableIfNotExists();
        //} catch (SQLException e) {
        //    e.printStackTrace();
       // }
    //}

   // public void createTableIfNotExists() throws SQLException {
    //    String createTableQuery = "CREATE TABLE IF NOT EXISTS users (username VARCHAR(50) PRIMARY KEY, password VARCHAR(50))";
     //   try (PreparedStatement statement = connection.prepareStatement(createTableQuery)) {
     //       statement.execute();
     //   }
  //  }

   // public void addUser(String username, String password) throws SQLException {
     //   String insertQuery = "INSERT INTO users (username, password) VALUES (?, ?)";
      //  try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
      //      statement.setString(1, username);
       //     statement.setString(2, password);
       //     statement.setString(3, username);
       //     statement.setString(4, password);
       //     statement.setString(5, username);
         //   statement.setString(6, password);
          //  statement.setString(7, username);
          //  statement.setString(8, password);
         //   statement.setString(9, username);
         //   statement.setString(10, password);
         //   statement.setString(11, username);
        //    statement.setString(12, password);
         //   statement.executeUpdate();
       // }
    //}

   // public boolean login(String username, String password) throws SQLException {
     ///   String selectQuery = "SELECT password FROM users WHERE username = ?";
      //  try (PreparedStatement statement = connection.prepareStatement(selectQuery)) {
      //      statement.setString(1, username);
       //     try (ResultSet resultSet = statement.executeQuery()) {
        //        if (resultSet.next()) {
        //            String storedPassword = resultSet.getString("password");
       //             if (password.equals(storedPassword)) {
        //                System.out.println("Login successful!");
         //               return true;
          //          }return
           //     }
         //  }
       /// }
      //  System.out.println("Invalid username or password. Please try again.");
       // return false;
   // }



//}
