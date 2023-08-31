package lk.isuru.self.jpa.one_to_one;

import lk.isuru.self.jpa.entity.Bag;
import lk.isuru.self.jpa.entity.Student;
import lk.isuru.self.jpa.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneToOne2 {
    public static void main(String[] args) {
        try(SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session=sf.openSession()) {
            session.beginTransaction();

            Student student2 = session.get(Student.class, 4);

            System.out.println(student2.getBag().toString());
            Bag bag1 = session.get(Bag.class, 1);
            System.out.println(session.contains(bag1));

            session.getTransaction().commit();

        }
    }
}
