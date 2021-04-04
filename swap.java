public class swap {
    public static void main(String[] args) {
     int a=10;
     int b=20;
     swap(a,b);
    }
    public static void swap(int n1,int n2)
    {
        System.out.println("value before swaping a:"+n1+"b:"+n2);
        int c=n1;
        n1=n2;
        n2=c;
        System.out.println("value after swapping a:"+n1+"b:"+n2);
    }
}
