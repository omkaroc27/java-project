import java.io.*;

public class Readlinetryctch {
                    public static void main(String[] args) {
                                        InputStreamReader is = new InputStreamReader(System.in);
                                        BufferedReader br = new BufferedReader(is);
                                        String s;
                                        try {
                                                            s = br.readLine();
                                                            System.out.println(s);
                                        } catch (IOException e) {
                                        }
                                        System.out.println();
                    }

}
