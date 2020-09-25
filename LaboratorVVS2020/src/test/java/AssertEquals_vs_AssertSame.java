import org.junit.Assert;
import org.junit.Test;

public class AssertEquals_vs_AssertSame {




        private  A a1 = new A(0);
        private  A a2 = new A(0);

        private B b1 = B.getInstance ();
        private B b2 = B.getInstance ();


        @Test
        public void  testAssertSame(){

            Assert.assertSame(b1, b2);
        }

        @Test
        public void  testAssertEquals(){

            Assert.assertEquals(b1, b2);
        }
}



