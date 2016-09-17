package test.demoforslides;

import demoforslides.OurSystem;
import demoforslides.Environment;
import java.sql.Timestamp;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class OurSystem2Test {
  
  @Mock
  Environment environmentMock;
  @InjectMocks 
  OurSystem os;
  
  @Test
  public void test_getTimeWithInjection() {
    
    Timestamp ts = new java.sql.Timestamp(new Date(1474107316444l).getTime());
    when(os.getTime()).thenReturn(ts);
    
    assertEquals(ts, os.getTime());
  }
  
}
