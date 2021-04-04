//class p {
//        public static void main(String[] args) {
//                            int a=5;
//                            System.out.println(a.hashcode());
//        }             
// }
// //in above ex result in compilation error boz a is not refrance var & memorry not allocated to it from heap
class p {
                    // int a = 5;
                    p ref;

                    public static void main(String[] args) {
                                        // p x = new p();
                                        // System.out.println(x);
                                        p x = new p();
                                        System.out.println(x.ref);
                    }
}