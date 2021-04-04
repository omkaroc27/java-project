//nested try block means onee try block define with is another try block  
public class nestedtryblock {
                    public static void main(String[] args) {
                                        int i = 100;
                                        int j = args.length;
                                        try {
                                                            System.out.println(i / j);
                                                            try {
                                                                                System.out.println(args[1]);
                                                            } catch (ArrayIndexOutOfBoundsException aoe) {
                                                                                System.out.println(aoe.getMessage());
                                                            }
                                        } catch (ArithmeticException oe) {
                                                            System.out.println(oe.getMessage());
                                        }
                    }
}
// in above example if the programmer does not pass args through comd propmpt
// then j is initionlize by zero