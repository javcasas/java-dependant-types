package A;
import A.S;
import A.Z;

public class Vector<L,E> {
  private E content;
  private Vector<L,E> tail;
  public Vector(E item, Vector<L,E> tail) {
    content = item;
    this.tail = tail;
  }
  public Vector<S<L>,E> cons(E item, Vector<L,E> tail) {
    return new Vector(item, tail);
  }
  public static Vector nil() {
    return new Vector(null, null);
  }
  public void print() {
    if (content == null) {
      System.out.print("[]");
    } else {
      System.out.print(content);
      System.out.print(":");
      tail.print();
    }
  }
}
