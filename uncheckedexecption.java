public class uncheckedexecption {
                    public void show() {
                                        try {
                                                            throw new Error();
                                        } catch (Exception e) {
                                                            System.out.println("hello bc");
                                        }
                    }

                    void display() {
                                        throw new Error();

                    }

                    public static void main(String[] args) {
                                        var u = new uncheckedexecption();
                                        u.show();
                                        try {
                                                            u.display();
                                        } catch (Throwable t) {
                                                            System.out.println("interface");
                                        }
                    }

                    private static void extracted(uncheckedexecption u) {
                                        u.display();
                    };

}
// this program produce error out put basically trow new error we can pass an
// error msg so that