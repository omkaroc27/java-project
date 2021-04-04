public class clonearry {
    public static void main(String[] args) {
        int a[]={11,22,33};
        System.out.println("the orignal array:-" );
        for(int i:a)
            System.out.println(i);
        System.out.println("the clone array:-");
        //this is logic part important
        int c[]=a.clone();44
        for(int i:c)
        System.out.println(i);
        System.out.print("they both are equal:-");
        System.out.println(  );
        System.out.print(a!=c);
       // System.out.println(  );
       // System.out.println(a==c);

    }
}
