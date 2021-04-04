public class innerclass {
    String name="omkar";
    public class innerclass02{
        public void hello(){
            System.out.println("helllo"+name);
        }

    }
    public static void main(String[] args) {
        //todo auto
       // Demo_01 obj=new Demo_01();
       //Innerclass inner = new innerclass();
       //inner.helllo;
       innerclass obj=new innerclass();
       innerclass.innerclass02 inner=obj.new innerclass02();
       inner.hello();

    }
}
