package jpademoforslides.testrunner;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import jpademoforslides.entity.Person;


public class Tester {
  
  
  public static void main(String[] args) {
    Persistence.generateSchema("pu", null);
    Person p1 = new Person("Lars");
    Person p2 = new Person("Peter");
    Person p3 = new Person("Ole");
    Person p4 = new Person("Hans");
    EntityManager em = Persistence.createEntityManagerFactory("pu_test").createEntityManager();
    //EntityManager em = Persistence.createEntityManagerFactory("pu").createEntityManager();
    em.getTransaction().begin();
    em.persist(p1);
    em.persist(p2);
    em.persist(p3);
    em.persist(p4);
    em.getTransaction().commit();
    
    List<Person> persons = em.createQuery("select p from Person p").getResultList();
    for(Person p : persons){
      System.out.println(p.getName());
    }
    em.close();
    
  }
  
}
