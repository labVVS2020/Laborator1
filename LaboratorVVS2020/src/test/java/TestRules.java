import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestRules {
    @Rule
    public Retry retry = new Retry(3);

    @BeforeClass
    public static void beforeClass() {
        System.out.println ("I'm beforeClass method!");
    }

    @Before
    public void before() {
        System.out.println ("I'm before method");
    }

    @After
    public void after(){
        System.out.println("I'm after method ");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("I'm afterClass method ");
    }

    @Rule
    public TestRule listen = new TestWatcher () {

        @Override
        public void failed(Throwable t, Description description){
            System.out.println ("Test "+ description.getMethodName () + " Fail");
        }

        @Override
        public void succeeded( Description description ){
            System.out.println ("Test "+ description.getMethodName () + " Pass");
        }
    };
}
