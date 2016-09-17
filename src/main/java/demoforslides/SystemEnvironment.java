package demoforslides;


import java.sql.Timestamp;
import java.util.Date;

public class SystemEnvironment implements Environment 
{
  @Override public Timestamp 
  getTime() { 
    return new Timestamp(new Date().getTime());
  }
  
  public static void main(String[] args) {
    System.out.println(new SystemEnvironment().getTime());
     System.out.println(new SystemEnvironment().getTime().getTime());
    System.out.println(new Date(1474107441232l).getTime());
//    Date date = new Date(1474107316444);
  System.out.println(new Timestamp(new Date(1474107316444l).getTime()));
  }
} 


