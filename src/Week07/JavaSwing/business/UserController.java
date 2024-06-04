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
}
