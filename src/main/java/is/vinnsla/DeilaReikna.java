package is.vinnsla;

public class DeilaReikna implements Reikna {
    public int reikna(int a, int b) {
        if ( b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return  a/ b;
    }
}
