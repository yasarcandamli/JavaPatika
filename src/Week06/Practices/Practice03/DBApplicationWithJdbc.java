package Week06.Practices.Practice03;

import java.sql.*;

public class DBApplicationWithJdbc {
    public static final String DB_URL = "jdbc:postgresql://localhost/patika";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "yasarcan";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        //Inserting the element of the employees table using preparedStatement
        String prSql = "INSERT INTO employees (employee_name, employee_position, employee_salary) VALUES (?, ?, ?)";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            PreparedStatement preparedStatement = connection.prepareStatement(prSql);
            preparedStatement.setString(1, "Mete");
            preparedStatement.setString(2, "Lawyer");
            preparedStatement.setInt(3, 100000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Berkan");
            preparedStatement.setString(2, "Computer Engineer");
            preparedStatement.setInt(3, 90000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Emre");
            preparedStatement.setString(2, "Software Developer");
            preparedStatement.setInt(3, 120000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Emin");
            preparedStatement.setString(2, "Physiotherapist");
            preparedStatement.setInt(3, 95000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Muhammed");
            preparedStatement.setString(2, "Doctor");
            preparedStatement.setInt(3, 140000);
            preparedStatement.executeUpdate();

            preparedStatement.close();

            statement = connection.createStatement();

            //Printing the elements of the employees table
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("employee_id"));
                System.out.println("Name: " + resultSet.getString("employee_name"));
                System.out.println("Position: " + resultSet.getString("employee_position"));
                System.out.println("Salary: " + resultSet.getInt("employee_salary"));
                System.out.println("-------------------------");
            }

            resultSet.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
