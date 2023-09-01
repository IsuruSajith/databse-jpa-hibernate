package lk.isuru.self.jpa.one_to_one;

import lk.isuru.self.jpa.entity.Bag;
import lk.isuru.self.jpa.entity.Student;
import lk.isuru.self.jpa.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BiDirectional {
    public static void main(String[] args) {
        try (SessionFactory sf = HibernateUtil.getSessionFactory(); Session session = sf.openSession()) {
            session.beginTransaction();

           /* Student dosi = new Student(6, "Dosi");
            session.persist(dosi);*/
            Bag odelBag = session.get(Bag.class, 2);
           // odelBag.setStudent(dosi);

            Student student1 = session.get(Student.class, 1);
            student1.setBag(odelBag);

            session.getTransaction().commit();

        }
    }
}
