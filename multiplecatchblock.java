public class multiplecatchblock {
                    public static void main(String[] args) {
                                        try {
                                                            int i = 10;
                                                            int j = args.length;
                                                            System.out.println(i / j);
                                                            int k = Integer.parseInt(args[1]);
                                                            System.out.println(k);
                                        } catch (ArithmeticException ae) {
                                                            System.out.println(ae.getMessage()); // TODO: handle
                                                                                                 // exception
                                        } catch (NumberFormatException aoe) {
                                                            System.out.println(aoe.getMessage());
                                        } catch (Exception ne) {
                                                            System.out.println(ne.getMessage());
                                        }
                    }
}
