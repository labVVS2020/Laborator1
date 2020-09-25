import java.util.Objects;

public class A {
    private int i;
    public A(int i){ this.i = i; }

    public int getI() {
        return i;
    }


    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass () != o.getClass () ) return false;
        A a = (A) o;
        return i == a.i;
    }


}