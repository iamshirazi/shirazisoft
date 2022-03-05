/*
import javax.persistence.*;
import java.util.List;

public class JPATest {

    public static void main(String[] args) {

        // Creating objects representing some products
        AddressBook ab = new AddressBook();

        BuddyInfo buddy1 = new BuddyInfo();
        buddy1.setId(1);
        buddy1.setName("Robert");
        buddy1.setPhone("(613) 012-9999");

        BuddyInfo buddy2 = new BuddyInfo();
        buddy2.setId(2);
        buddy2.setName("Billy");
        buddy2.setPhone("(613) 543-0022");

        // Connecting to the database through EntityManagerFactory
        // connection details loaded from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");

        EntityManager em = emf.createEntityManager();

        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Persisting the product entity objects
        em.persist(buddy1);
        em.persist(buddy2);

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query q = em.createQuery("SELECT b FROM BuddyInfo b");

        @SuppressWarnings("unchecked")
        List<BuddyInfo> results = q.getResultList();

        System.out.println("List of buddies\n----------------");

        for (BuddyInfo p : results) {

            System.out.println(p.getName() + " (id=" + p.getId() + ")");
        }

        ////////////////ADDRESS BOOK TIME////////////////////
        System.out.println();
        System.out.println();

        tx.begin();

        ab.addBuddies(buddy1);
        ab.addBuddies(buddy2);

        em.persist(ab);

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query q2 = em.createQuery("SELECT a FROM AddressBook a");

        @SuppressWarnings("unchecked")
        List<AddressBook> results2 = q2.getResultList();

        System.out.println("AddressBook Details\n----------------");

        for (AddressBook w : results2) {

            System.out.println(w.getBuddies() + " (id=" + w.getId() + ")");
        }

        // Closing connection
        em.close();

        emf.close();

    }

}
*/