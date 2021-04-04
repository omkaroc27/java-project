/*public class innerclasssample {
                    static class X {
                                        static int j = 80;
                    }

                    public static void main(String[] args) {
                                        System.out.println(innerclasssample.X.j);
                    }
}*/
public class innerclasssamplev {
                    static class X {
                                        int j = 60;
                    }

                    public static void main(String[] args) {
                                        X a = new X();
                                        System.out.println(a.j);
                    }
}
