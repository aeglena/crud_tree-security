package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    User readUser(Long id);

    List<User> readAll();

    void save(User user);

    User update(User user, Long id);

    void delete(Long id);
}
