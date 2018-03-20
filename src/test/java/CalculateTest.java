import junit.Calculate;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import static org.junit.Assert.*;
public class CalculateTest{

    int testSum = 11;
    int testSub=2;
    Calculate calculate =null;

    @Before
    public void setUp(){
        System.out.println("creating the object");
        calculate = new Calculate();
    }
    @Test
    public void testSum(){
        int sum  = calculate.sum(5,6);
        System.out.println("@Test sum(): " + sum + " = " + testSum);
        assertEquals(sum,testSum);
    }
    @Test
    public void testSub(){
        int sub = calculate.sub(10,8);
        System.out.println("@Test Sub(): " + sub + " = " + testSub);
        assertEquals(sub,testSub);
    }
    @After
    public void tearDown(){
        System.out.println("Nullifing the object");
        calculate = null;
        System.out.println("calculate: "+calculate);
    }
}
