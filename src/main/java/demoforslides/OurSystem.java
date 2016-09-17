package demoforslides;

import java.sql.Timestamp;
public class OurSystem {
  Environment env;
 
  public OurSystem(Environment env) {
    this.env = env;
  }
  public Timestamp getTime(){
    return env.getTime();
  }
}
