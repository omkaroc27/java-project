class g {
                    void fun() {
                                        System.out.println("prent class");
                    }
}

class h extends g {
                    void fun(int g) {
                                        System.out.println("child class ");
                    }
}

class las extends h {
                    public static void main(String[] args) {
                                        g a = new g();
                                        a.fun();
                                        h b = new h();
                                        b.fun();
                                        b.fun(9);
                    }
}

// here a is refrance of base class g where obj are constructed for this child
// class
// when fun() called thfrough ref than at compile time its chacks the fun()
