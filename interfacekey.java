////interface kye an abstract kayword 
//it is used to specify an  interface which classes must implement
// in java class never supports multiple inheritance whaereas interface support multiple inheritance
interface B {
                    void Show();
}

interface R extends B {
                    void display();

}

public class interfacekey implements B, R {
                    public void Show() {
                                        System.out.println("java interface ");
                    }

                    public void display() {
                                        System.out.println("java pro");
                    }

                    public static void main(String[] args) {
                                        B a = new interfacekey();
                                        a.Show();
                                        ((R) a).display();
                    }
}
// abst have only instance var BUT IN INTERFACE ALL VAR IN AN INTERFACE are by
// default piblic static final
// it may cantain only public memberS