import assets.*;
import assets.credit.*;
import liable.*;
import liable.Debit.*;
import java.util.Scanner;

public class bank {
                    public static int balence;
                    public static int credit;
                    public static int code;
                    public static int Debit;
                    public static int code2;
                    public static int code1;
                    public static int code3;

                    public static void main(String[] args) {
                                        Scanner s = new Scanner(System.in);
                                        liab l = new liab();
                                        asset a = new asset();
                                        credit c = new credit();
                                        Debit d = new Debit();
                                        balence = a.showAmt(1150);
                                        l.input();
                                        l.show();
                                        while (true) {
                                                            System.out.println("enter the choice from below \n\t 1=balence\n\t 2=withdrow\n\t 3=deposit\n\t 4=quit");
                                                            System.out.println("choose the current code ");
                                                            code = s.nextInt();
                                                            switch (code) {
                                                            case 1:
                                                                                System.out.println("your account bal is "
                                                                                                                        + balence
                                                                                                                        + "\n\n\n");

                                                                                break;
                                                            case 2:
                                                                                System.out.println("are u want to withdrow\n\tchoose from below \n\n\t0=no\n\t1=yes");
                                                                                code1 = s.nextInt();
                                                                                if (code1 == 1) {
                                                                                                    credit = c.showCredit();
                                                                                                    balence = balence - credit;
                                                                                                    System.out.println("rest bal is " + balence
                                                                                                                                            + "\n\n\n");
                                                                                } else {
                                                                                                    break;
                                                                                }
                                                                                break;
                                                            case 3:
                                                                                System.out.println("are u want to deposit \n\tchoose from below\n\n\t\t0=no\n\n\t\t1=yes");
                                                                                code2 = s.nextInt();
                                                                                if (code2 == 1) {
                                                                                                    Debit = d.showDebit();
                                                                                                    balence = balence + Debit;
                                                                                                    System.out.println("now your account balence is "
                                                                                                                                            + balence
                                                                                                                                            + "\n\n\n");
                                                                                } else {
                                                                                                    break;
                                                                                }
                                                                                break;
                                                            default:
                                                                                System.out.println("are u want to exit \n\tchoose from below\n\n\t\t0=no\n\n\t\t1=yes");
                                                                                code3 = s.nextInt();
                                                                                if (code3 == 1) {
                                                                                                    System.out.println("thank you -----\n\n" + "created by@omkaroc4");
                                                                                                    System.exit(10);
                                                                                } else {
                                                                                                    break;
                                                                                }
                                                            }
                                        }
                    };
}
