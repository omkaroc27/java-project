import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter your age:");
        int age=Sc.nextInt();
        System.out.println("enter your name:");
        String name=Sc.next();
        System.out.println("my age is "+age+" " +"my name is "+name);
    }
    
}
