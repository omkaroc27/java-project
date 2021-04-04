public class typeCasting{
    public static void main(String[] args) {
        char a='A';
        //implicit conversion
        System.out.println("this is implicit");
        int b=a;
        System.out.println("int number b"+b);
        float c=a;
        System.out.println("flot value"+c);
        double d=a;
        System.out.println("double value"+d);
        //explicit con
        double e=50.5;
        int y =(int) e;
        System.out.println("the value of e "+e);
        System.out.println("the value of y"+y);
    }
    
}