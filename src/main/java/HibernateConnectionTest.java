import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class HibernateConnectionTest {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        String query = "from TEST_CASE_RUNNING_STATUS";
        Query query1 = session.createQuery(query);
        List list = query1.list();
        System.out.println("list :"+list);



    }
}
