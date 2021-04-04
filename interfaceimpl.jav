public class interfaceimpl{

public interface MyInnerImpl implements MyIface1
 {
       public void sayhello(string name)
        {
           System.out.println("haello"+name+"by class");

       } 
    }
    //sayhello is abstract method 
     public static void main(String[] args) 
     {
         interfaceimpl obj= new interfaceimpl();
         MyInnerImpl inner=obj.new MyInnerImpl();
         inner.sayhello("omkarcharate");
     }   //interface is every thuing is public
    }
