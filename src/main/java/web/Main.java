//package web;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import web.config.PersistenceJPAConfig;
//import web.model.User;
//import web.service.UserService;
//import web.service.UserServiceImpl;
//
//import java.util.List;
//
//public class Main {
//    public static void main(String [] args){
//
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceJPAConfig.class);
//        UserService userServiceBean = applicationContext.getBean(UserService.class);
//        User user = new User("Helen", 39, "aeg@mail.ru");
//        User user1 = new User("Andrei", 45, "kim@mail.ru");
//        User user2 = new User("Veroni", 45, "kim@mail.ru");
//        userServiceBean.save(user);
//        userServiceBean.save(user1);
//        //userServiceBean.update(user2,2L);
//       // User user3 = userServiceBean.read(3L);
//        System.out.println(user1);
//        List<User> users = userServiceBean.readAll();
//        System.out.println(users);
//
//
//    }
//}
