import org.junit.*;

public class TestSuite_4 extends TestRules  {

    @Test(expected = AssertionError.class)
    public void test6(){
        System.out.println("I'm test 6");
        Assert.assertFalse(true);
    }

    @Test
    @Ignore
    public void test7(){
        System.out.println("I'm test 7");
    }

}
