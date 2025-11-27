package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {

    Connection connection;

    Statement statement;

    public conn() throws ClassNotFoundException, SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","shakshi26");
            statement = connection.createStatement();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
