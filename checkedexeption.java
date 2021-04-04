public class checkedexeption {
                    void show() {
                                        try {
                                                            throw new Exception();
                                        } catch (Exception e) {
                                                            System.out.println("java first exception");
                                        }
                    }

                    void display() throws Exception {
                                        throw new Exception();
                    }

                    public static void main(String[] args) {
                                        checkedexeption c = new checkedexeption();
                                        c.show();
                                        try {
                                                            c.display();
                                        } catch (Throwable t)

                                        {
                                                            System.out.println("interface");
                                        }
                    }
}
