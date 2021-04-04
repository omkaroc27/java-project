import java.io.*;

class Demo {
                    public static void main(String[] args) throws IOException {
                                        InputStreamReader is = new InputStreamReader(System.in);
                                        BufferedReader br = new BufferedReader(is);
                                        System.out.println("enter your name");
                                        String s = br.readLine();
                                        System.out.println("the output" + s);
                    }
}