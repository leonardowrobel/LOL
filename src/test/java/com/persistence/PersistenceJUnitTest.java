package com.persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leonardo
 */
public class PersistenceJUnitTest {

    private EntityManagerFactory entityManagerFactory;

    public PersistenceJUnitTest() {
    }

    @Before
    public void setUp() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory("com.lol.pu");
    }

    @After
    public void tearDown() throws Exception {
        entityManagerFactory.close();
    }

    @Test
    public void testPersist() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(new TestePersistence("E"));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    @Test
    public void testSelect() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<TestePersistence> result = entityManager.createQuery("from TestePersistence", TestePersistence.class).getResultList();
        System.out.println("==========================================");
        for(TestePersistence test : result) {
            System.out.println("-----> " + test.getId().intValue() + test.getTitle());
        }
        System.out.println("==========================================");
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
