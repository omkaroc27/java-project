//catch block is propularly kown as exception .
//Exception throw during execution of try block aree handle in a catch block .
//catch block hold the ref of Exception classs 
public class catchblock {
                    public static void main(String[] args) {
                                        int i = 10;
                                        int j = args.length;
                                        try {
                                                            System.out.println(i / j);
                                        } catch (ArithmeticException ae)// this is a catch block after the end of try
                                                                        // black
                                        {
                                                            ae.printStackTrace();
                                        }
                    }
}
// this program generat cmd line argument exception and 'j 'is initionliza by 0
