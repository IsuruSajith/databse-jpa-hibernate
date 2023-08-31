package lk.isuru.self.jpa;

import lk.isuru.self.jpa.entity.Bag;
import lk.isuru.self.jpa.entity.Student;
import lk.isuru.self.jpa.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneToOne {
    public static void main(String[] args) {

        try (SessionFactory sf = HibernateUtil.getSessionFactory();
             Session session = sf.openSession()) {
            session.beginTransaction();

            Student isuru = new Student(1,"isuru");
            Student kasun = new Student(4,"kasun");
            Bag addidas = new Bag(1, "addidas", isuru);
            Bag odel = new Bag(2, "odel",kasun);

            session.persist(isuru);
            session.persist(kasun);
            session.persist(addidas);
            session.persist(odel);
            //kasun.setBag(addidas);

            session.getTransaction().commit();
        }
    }
}
