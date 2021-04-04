public class testReturnvalue {
    public static void main(String[] args) {
        testReturnvalue obj=new testReturnvalue();
        int a=10;
        int b=20;
        int get=obj. add(a,b);
        System.out.println(get);
    }
    public int add(int n1 ,int n2)
    {
        int result=n1+n2;
        return result;
    }
    
}
