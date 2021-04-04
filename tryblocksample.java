//the java code that may produce an exeption is placeed within a try block for a suitable catch block to handle the Exeption

public class tryblocksample {
                    void show() {
                                        int arr[] = { 99 };
                                        System.out.println(arr[1]);
                    }

                    void fun() {
                                        char c[] = { 'A', 'B' };
                                        String s1 = new String();
                                        System.out.println(s1);
                    }

                    void display() {
                                        int ar[][] = new int[1][];
                                        System.out.println(ar[0].length);
                    }

                    public static void main(String[] args) {
                                        tryblocksample ee = new tryblocksample();
                                        try {
                                                            ee.show();
                                        } catch (ArrayIndexOutOfBoundsException aoe) {
                                                            System.out.println(aoe.getMessage());
                                        }
                                        try {
                                                            ee.fun();
                                        } catch (StringIndexOutOfBoundsException se) {
                                                            System.out.println(se.getMessage());
                                        }
                                        try {
                                                            ee.display();
                                        } catch (NullPointerException ne) {
                                                            System.out.println(ne.getMessage());
                                        }
                    }
}
// in above program when main method call the show ()method ,
// it generate arrayIndex Out of bound exception which is calling time & display
// the reasons of exception 1 index