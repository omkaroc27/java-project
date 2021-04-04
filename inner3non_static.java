public class inner3non_static {
                    String name;
                    static int age;

                    private String getName(String n) {
                                        name = n;
                                        return name;
                    }

                    static int getAge(int a) {
                                        age = a;
                                        return age;
                    }

                    private class Test1 {
                                        int Rollno;
                                        String add;

                                        int getRollno(int r) {
                                                            Rollno = r;
                                                            return Rollno;
                                        }

                                        String getaddress(String s) {
                                                            add = s;
                                                            return add;
                                        }

                                        void display() {

                                                            System.out.println("name is " + getName("omkar "));
                                                            System.out.println("age is " + inner3non_static.getAge(21));
                                                            System.out.println("roll no is " + getRollno(02));
                                                            System.out.println("Adress " + inner3non_static.getaddress(
                                                                                                    "omkar "));
                                        }
                    }

                    public static void main(String[] args) {
                                        inner3non_static t1 = new inner3non_static();
                                        t1.show();
                    }

                    public static String getAge(String string) {
                                        return null;
                    }

                    public static String getaddress(String string) {
                                        return null;
                    }

                    void show() {
                                        Test1 t1 = new Test1();
                                        t1.display();
                    }
}
// non stactic inner classs can not have static data members and static mem
// metod in the case of declaring data mem and membrer method
// in other hand static meem class have stsatic & non sttic member & method
