package lk.isuru.self.jpa.one_to_one;

import lk.isuru.self.jpa.entity.Student;
import lk.isuru.self.jpa.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BiDirectional {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtil.getSessionFactory(); Session session = sf.openSession()) {
            session.beginTransaction();

            new Student()


            session.getTransaction().commit();

        }
    }
}
