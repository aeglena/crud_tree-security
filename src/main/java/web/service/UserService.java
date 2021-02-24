package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    User readUser(Long id);

    List<User> readAll();

    void save(User user);

    User update(User user, Long id);

    void delete(Long id);
}
