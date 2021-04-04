class momorrypointer {
                    int x;

                    public static void main(String[] args) {
                                        // emorry pointer is class name soo class name must follow for creating obj
                                        // here memorry class an instance var x
                                        // z is refrance var created inside the stack area
                                        momorrypointer z = new momorrypointer();
                                        z.x = 3;
                                        System.out.println(z.x);
                    }
}
