package test.demoforslides;


import demoforslides.SystemEnvironment;
import demoforslides.OurSystem;
import demoforslides.Environment;
import java.sql.Timestamp;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class OurSystemTest {
  
  
  Environment environmentMock=  mock(SystemEnvironment.class);
  
  @Test
  public void test_getTime() {
    
    OurSystem os = new OurSystem(environmentMock);
    Timestamp ts = new java.sql.Timestamp(new Date(1474107316444l).getTime());
    when(os.getTime()).thenReturn(ts);
    
    assertEquals(ts, os.getTime());
  }
  
}
