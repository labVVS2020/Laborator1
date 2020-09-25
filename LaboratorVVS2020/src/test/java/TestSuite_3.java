import org.junit.*;

public class TestSuite_3 extends TestRules {

    @Test
    public void test5(){
        System.out.println("I'm test 5");

    }

    @Test(timeout = 500)
    public void test6(){
        System.out.println("I'm test 6");
    }

}
