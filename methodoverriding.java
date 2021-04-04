//method overriiding is a techneqe which support runtime dynamic  polymoraphism
//methpod over alllows a subclasss(child) to provide its own implementation of method which alrady provide by base class(prent)
class M {
                    M() {
                                        System.out.println("inside super class");
                                        fun();
                    }

                    void fun() {
                                        System.err.println("omkar");
                    }
}

class K extends M {
                    K() {
                                        System.out.println("b.b()");
                    }

                    void fun() {
                                        System.out.println("child");
                    }
}

class fas extends K {
                    public static void main(String[] args) {
                                        K a = new K();
                                        a.fun();
                    }
}