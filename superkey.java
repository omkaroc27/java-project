class k {
                    int g = 5;
}

class n extends k {
                    int g = 50;

                    void ShowSuper() {
                                        System.out.println(g);
                                        System.out.println(super.g);
                    }
}

class gas {
                    public static void main(String[] args) {
                                        n a = new n();
                                        a.ShowSuper();
                    }
}
