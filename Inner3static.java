public class Inner3static {
                    String name;
                    static String add;
                    static int age;

                    private static class Test1 {
                                        String Rollno;

                                        String getName(String n) {
                                                            Inner3static i3 = new Inner3static();
                                                            i3.name = n;
                                                            return i3.name;
                                        }

                                        int getAge(int a) {
                                                            Inner3static.age = age;
                                                            return Inner3static.age;
                                        }
                    }

                    protected static class Test2 extends Test1 {
                                        String getRollno(String string) {
                                                            Rollno = string;
                                                            return Rollno;
                                        }

                                        String getaddress(String a) {
                                                            Inner3static.add = a;
                                                            return Inner3static.add;

                                        }

                    }

                    public static void main(String[] args) {
                                        Test2 T = new Test2();
                                        System.out.println("name is " + T.getName("omkar "));
                                        System.out.println("age is " + T.getAge(21));
                                        System.out.println("roll no is " + T.getRollno("02 "));
                                        System.out.println("Adress " + T.getaddress("omkar "));
                    }
}