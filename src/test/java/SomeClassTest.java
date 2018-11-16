import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SomeClassTest {
    @Before
    public void setup(){
        SomeClass someClass = new SomeClass();
    }
    @Test
    public void testSomethingAndFail() {
        Assert.assertTrue(false);
    }
}