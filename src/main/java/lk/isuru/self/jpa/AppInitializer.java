package lk.isuru.self.jpa;

import lk.isuru.self.jpa.entity.Bag;
import lk.isuru.self.jpa.entity.Student;
import lk.isuru.self.jpa.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppInitializer {
    public static void main(String[] args) {

        try (SessionFactory sf = HibernateUtil.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

            Student isuru = new Student(1,"isuru");
            Bag addidas = new Bag(1, "addidas", isuru);

            //session.persist(isuru);
            session.persist(addidas);

            session.getTransaction().commit();
        }
    }
}
