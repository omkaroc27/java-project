
class x {
                    int a;
}

public class methodpass {

                    public static void main(String[] args) {
                                        x p = new x();
                                        p.a = 10;
                                        methodpass d = new methodpass();
                                        d.MethodShow(p);

                    }

                    void MethodShow(x ref) {
                                        System.out.println(ref.a);
                    }
}
