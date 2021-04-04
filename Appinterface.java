public class Appinterface {
    public static void main(String[] args, String string) {
        MyIface1 a=new MyIface1(){
            //syshello is method it is n'ot a class name 
            public void sayHello(String name){
                System.out.println("hello"+name+"by anonyamous inner class");

            }
        };
        MyIface1 b=new MyIface1(){
            public void sayhello(String name){
                System.out.println("hello"+name+"osjhdk");
            }
        };
        a.sayHello("hello");
        b.sayHello("charate");
    }
}
