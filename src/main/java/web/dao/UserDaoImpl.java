package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public User readUser(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> readAll() {
        TypedQuery<User> query = (TypedQuery) em.createQuery("FROM User");
        return query.getResultList();
    }

    @Override
    public void save(User user) {
        em.persist(user);
    }

    @Override
    public User update(User userNew, Long idOld) {
        User user = new User();
        user.setId(idOld);
        user.setName(userNew.getName());
        user.setAge(userNew.getAge());
        user.setEmail(userNew.getEmail());
        return em.merge(user);
    }

    @Override
    public void delete(Long id) {
        em.remove(em.find(User.class, id));
    }
}
