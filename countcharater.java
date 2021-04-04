public class countcharater {
    public static void main(String[] args) {
        String stt ="the best both world   ";
        int count=0;
        //COUNT EACAh CHAR EXCEPT SPACE
        for(int i=0;i<stt.length();i++)
        count++;
        System.out.println("total number of character in string"+count);
    }
}
