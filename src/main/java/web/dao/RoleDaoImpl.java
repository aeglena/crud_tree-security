package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class RoleDaoImpl implements RoleDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Role getById(Long id) {
        return em.find(Role.class, id);
    }

    @Override
    public Role getRoleByName(String name) {
        Query query = em.createQuery("FROM Role r WHERE r.name=:name", Role.class);
        query.setParameter("name", name);
        return (Role) query.getSingleResult();
    }
}
