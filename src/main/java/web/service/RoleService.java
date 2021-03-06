package web.service;

import web.model.Role;

public interface RoleService {
    void add(Role role);
    void update(Role role, Long id);
    void delete(Long id);
    Role read(Long id);
}
