public class B {

    private static final B b = new B();

    private B() {}


    public static B getInstance() {
        return b;
    }

    // deci B trebuie sa fie instantiat de doua ori, right?

}
