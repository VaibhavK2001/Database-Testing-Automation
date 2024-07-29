import org.testng.annotations.Test;

import  java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbc extends Setup
{

    @Test
    public void InsertData() throws SQLException, ClassNotFoundException {
        connection = this.setUp();
        String query = "Insert into Student (name,location,course) values (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Ram");
            preparedStatement.setString(2,"Jalgoan");
            preparedStatement.setString(3,"AI");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }



    @Test
    public void selectData() throws SQLException, ClassNotFoundException {

        Connection connection = setUp();
        String query = "Select * from student";
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(query);
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
        }

    }

    @Test
    public void deleteData() throws SQLException, ClassNotFoundException {
        connection = this.setUp();
        String query = "delete from student where id = 6;";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeUpdate();
        System.out.println("Record Deleted");
    }



}
