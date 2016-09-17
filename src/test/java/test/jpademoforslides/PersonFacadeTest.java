package test.jpademoforslides;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpademoforslides.entity.Person;
import jpademoforslides.facade.PersonFacade;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class PersonFacadeTest {
  
  EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_test");
  PersonFacade facade = new PersonFacade(emf);
  
  @Before
  public void setup(){
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.createQuery("delete from Person p").executeUpdate();
    em.getTransaction().commit();
    em.close();
  }
  
  @Test
  public void verifyEmptyTable(){
    assertEquals("DB should contain no Persons", 0,facade.getPersonCount());
  }
  
  @Test
  public void addPerson(){
    facade.create(new Person("Kurt"));
    assertEquals("DB should contain one Persons", 1,facade.getPersonCount());
  }
  
}
