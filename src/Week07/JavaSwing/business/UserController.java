package Week07.JavaSwing.business;

import Week07.JavaSwing.dao.UserDao;
import Week07.JavaSwing.entity.User;

import java.util.ArrayList;

public class UserController {
    private UserDao userDao;

    public UserController() {
        this.userDao = new UserDao();
    }

    public ArrayList<User> findAll() {
        return this.userDao.findAll();
    }

    public User getById(int id) {
        if (id == 0) {
            System.out.println("ID değeri 0 veya 0'dan küçük olamaz!");
            return new User();
        }
        return this.userDao.getById(id);
    }
}
