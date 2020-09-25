import org.junit.*;

import static org.junit.Assert.* ;

public class TestSuite_1 {
    @Rule
    public Retry retry = new Retry(3);

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("I'm beforeClass method for TS_1!");
    }

    @Before
    public void before(){
        System.out.println("I'm before method for TS_1");
    }

    @Test
    public void test1(){
        System.out.println("I'm test 1");
        Assert.assertFalse(true);
    }

    @Test
    public void test2(){
        System.out.println("I'm test 2");
    }

    @After
    public void after(){
        System.out.println("I'm after method for TS_1");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("I'm afterClass method for TS_1!");
    }
}
