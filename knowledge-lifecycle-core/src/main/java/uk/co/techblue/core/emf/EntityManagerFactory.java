package uk.co.techblue.core.emf;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class EntityManagerFactory {

    @Produces
    @PersistenceContext(unitName = "org.jbpm.persistence.jpa")
    public EntityManager getEntityManager()
    {
        final javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.jbpm.persistence.jpa");
        return emf.createEntityManager();
    }

    @Produces
    @PersistenceContext(unitName = "org.jbpm.services.task")
    public EntityManager getTaskEntityManager()
    {
        final javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.jbpm.services.task");
        return emf.createEntityManager();
    }

}
