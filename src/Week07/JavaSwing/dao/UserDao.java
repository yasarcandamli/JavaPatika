package Week07.JavaSwing.dao;

import Week07.JavaSwing.core.Database;
import Week07.JavaSwing.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDao {
    private Connection connection;

    public UserDao() {
        this.connection = Database.connection();
        //Gelen verileri User entity nesneler aktaracak
        //CRUD: ekleme silme okuma güncelleme
    }

    public ArrayList<User> findAll() {
        ArrayList<User> users = new ArrayList<>();
        String query = "SELECT * FROM public.users";
        try {
            ResultSet resultSet = this.connection.createStatement().executeQuery(query);
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setMail(resultSet.getString("mail"));
                user.setPassword(resultSet.getString("password"));
                user.setType(User.Type.valueOf(resultSet.getString("type")));
                user.setGender(User.Gender.valueOf(resultSet.getString("gender")));

                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public User getById(int id) {
        User user = new User();
        String query = "SELECT * FROM public.users WHERE id = ?";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setMail(resultSet.getString("mail"));
                user.setPassword(resultSet.getString("password"));
                user.setType(User.Type.valueOf(resultSet.getString("type")));
                user.setGender(User.Gender.valueOf(resultSet.getString("gender")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
