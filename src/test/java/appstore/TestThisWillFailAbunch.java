package appstore;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestThisWillFailAbunch {
    @Test
    public void aFailingTest() {
         assertTrue("I expected this to pass!", false);
    }

    @Ignore
    @Test
    public void aFailingTest2() {
        // doSomething();
        assertTrue("I expected this to pass!", true);
    }

    @Ignore
    @Test
    public void aFailingTest3() {
        // doSomething();
        assertTrue("I expected this to pass!", true);
    }

    //@Ignore
    @Test
    public void aFailingTest4() {
      //  doSomething();
        assertTrue("I expected this to pass!", true);
    }

    @Ignore
    @Test
    public void aNewFailingTest31() {
      //  doSomething();
        assertTrue("I expected this to pass!", true);
    }

    @Test
    public void aNotherNewFailingTest4() {
        // doSomething();
        assertTrue("I expected this to pass!", true);
    }

    @Test
    public void aFailingTest5() {
        // doSomething();
       assertTrue("I expected this to pass!", true);
    }

    @Test
    public void aFailingTest6() {
        // doSomething();
        assertTrue("I expected this to pass!", true);
    }

    @Test
    public void aPassingTest3() {
         assertTrue("Success!", true);
    }

    @Test
    public void aPassingTest4() {
         assertTrue("Success!", true);
    }

    private void doSomething() {
        interesting();
    }
    private void interesting() {
        RubeGoldburgMachine machine = new RubeGoldburgMachine();
        machine.processPayment();
    }

    private class RubeGoldburgMachine {
        void processPayment() {
            throw new IllegalStateException("bad payment code");
        }
    }
}
