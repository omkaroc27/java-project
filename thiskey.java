class A {
                    A() {
                                        System.out.println("perent ");
                    }
}

class W extends A {
                    W() {
                                        super();
                                        System.out.println("child class ");
                    }

                    W gun() {
                                        return this;
                    }

                    void Show() {
                                        System.out.println("aere u foxed ");
                    }

                    class g extends W {
                                        public void main(String[] args) {
                                                            W d = new W();
                                                            W x = d.gun();
                                                            if (d == x) {
                                                                                x.Show();
                                                            }
                                        }

                    }
}
// here child class gun() method return this ,yhe address of current memorry
// location is asign to x
