package com.persistence;

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
        entityManagerFactory = Persistence.createEntityManagerFactory( "com.lol.pu" );
    }
    
    @After
    public void tearDown() throws Exception {
        entityManagerFactory.close();
    }  
    @Test
    public void testBasicUsage() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
    }
}
