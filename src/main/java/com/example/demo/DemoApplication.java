package com.example.demo;


import org.apache.commons.dbcp2.BasicDataSource;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoApplication {

  private static BasicDataSource dataSource = null;

  static {
    dataSource = new BasicDataSource();
    dataSource.setUrl("jdbc:sqlite:/Users/msoumik/softwares/sqllite/ex1");

    dataSource.setMinIdle(5);
    dataSource.setMaxIdle(10);
    dataSource.setMaxTotal(25);

  }


  public static void main(String[] args) throws Exception{
    for (int i =1; i <=10; i++) {
      //getDataFromDB();
      getDataFromDBUsingPool();

    }
  }



  private static void getDataFromDBUsingPool() throws SQLException, ClassNotFoundException {
    long startTime = System.currentTimeMillis();
    //Class.forName("com.mysql.jdbc.Driver");
    //Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","password");
     Connection con = dataSource.getConnection();

    Statement stmt=con.createStatement();
    //createTable(stmt);
    //populateTable(con);
    selectFromTable(stmt);

    if (stmt != null) {
      stmt.close();
    }
    if (con != null) {
      con.close();
    }
    System.out.println("Time taken : "+(System.currentTimeMillis() - startTime));
  }


  private static void getDataFromDB() throws SQLException, ClassNotFoundException {
    long startTime = System.currentTimeMillis();
    //Class.forName("com.mysql.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:sqlite:/Users/msoumik/softwares/sqllite/ex1");
    Statement stmt=con.createStatement();
    //createTable(stmt);
    //populateTable(con);
    selectFromTable(stmt);

    if (stmt != null) {
      stmt.close();
    }
    if (con != null) {
      con.close();
    }
    System.out.println("Time taken : "+(System.currentTimeMillis() - startTime));
  }



  private static void createTable(Statement stmt) throws SQLException {
    String sql = "CREATE TABLE employees " +
      "(id INTEGER not NULL AUTO_INCREMENT, " +
      " name VARCHAR(255), " +
      " age INTEGER, " +
      " PRIMARY KEY ( id ))";
    stmt.execute(sql);
    System.out.println("Table created");
  }

  private static void populateTable(Connection con) throws SQLException {
    String sql = "Insert into employees( name, age) values (?, ?) ";
    PreparedStatement preparedStatement = con.prepareStatement(sql);
    for (int i = 1; i<= 100; i++) {
      preparedStatement.setString(1, "name"+i);
      preparedStatement.setInt(2, 40);
      preparedStatement.addBatch();
    }
    preparedStatement.executeBatch();
    System.out.println("Table populated");
    if (preparedStatement != null) {
      preparedStatement.close();
    }
  }

  private static void selectFromTable(Statement stmt) throws SQLException {
    String sql = "Select StudentName, CurrentYear from StudentsMaster; ";
    ResultSet resultSet = stmt.executeQuery(sql);
    while(resultSet.next()) {
      //System.out.println("Name : "+resultSet.getString(1)+", Year: "+resultSet.getInt(2));
    }
    if (resultSet != null) {
      resultSet.close();
    }
  }


}
