import A.S;
import A.Z;
import A.Vector;
public class HelloWorld {
    public static void main(String[] args) {
        Vector<Z,String> nil = Vector.nil();
        Vector<S<Z>,String> v = nil.cons("A", nil);
        Vector<S<S<Z>>,String> v2 = v.cons("B", v);
        Vector<S<S<S<Z>>>,String> v3 = v2.cons("C", v2);
        // Vector<S<S<S<Z>>>,String> v4 = v3.cons("C", v3);  // Fails to typecheck
        v3.print();
    }
}
