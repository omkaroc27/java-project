class u {
                    u() {
                                        System.out.println("prents class");
                    }
}

class q extends u {
                    q() {
                                        super();// super classs default constructer
                                        System.out.println("child class");
                    }
}

class ok extends q {
                    public static void main(String[] args) {
                                        q a = new q();

                    }
}