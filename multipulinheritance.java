class z {
                    z() {
                                        System.out.println("z class");
                    }

                    void show() {
                                        System.out.println("java dad");
                    }
}

class y extends z {
                    y() {
                                        System.out.println("y class");

                    }

                    void fun() {
                                        System.out.println("java child");
                    }
}

class l extends y {
                    l() {
                                        System.out.println("x class");
                    }

                    void omkar() {
                                        System.out.println("java childs child ");
                    }
}

class Demo66 {
                    public static void main(String[] args) {
                                        l oc = new l();
                                        oc.show();
                                        oc.fun();
                                        oc.omkar();
                    }
}
