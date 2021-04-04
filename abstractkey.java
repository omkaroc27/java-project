//it is a keyword and modifier usede in case of class and method if the class is declare as abstract the programmer 
//can not instants thant class that means he can not create object of that class 
//sysntax: abstract clss A{}
//the programmer can craete ref of abstract but cannot crate obj of abstract class
abstract class E {
                    public abstract void fun();

                    E() {
                                        System.out.println("x xonstructer");
                    }
}

class V extends E {
                    public void fun() {
                                        System.out.println("hello");
                    }

                    V() {
                                        super();
                    }
}

class Task {
                    public static void main(String[] args) {
                                        V a = new V();
                                        a.fun();
                    }
}
// abstract class is way to org a complex problem in a structure way
// abst classes are templete for further specific classes
// abst class gives an identity to the derived object