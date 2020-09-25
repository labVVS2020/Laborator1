import org.junit.*;

import static org.junit.Assert.* ;

public class TestSuite_2 {

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("I'm beforeClass method! for TS_2");
    }

    @Before
    public void before(){
        System.out.println("I'm before method for TS_2");
    }

    @Test
    public void test3(){
        System.out.println("I'm test 3");
    }

    @Test
    public void test4(){
        System.out.println("I'm test 4");
    }

    @After
    public void after(){
        System.out.println("I'm after method for TS_2");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("I'm afterClass method! for TS_2");
    }
}
