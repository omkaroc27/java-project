class Operator {
    public static void main(String[] args) {

        // int,float,char,string,double -big decimal number,boolen declaretion
        int age = 22;
        float omkar = 69.60f;
        String name = "onkaar_charate";
        char grade = 'A';
        long mark = 999991191914227272l;

        // System.out.println("my name is :- "+name);
        // System.out.println("and my garde is :- "+grade);
        // arithmatic operator
        float sum = age + omkar;
        System.out.println(sum);
        // *,/,%,-,+
        var firstNum = 212;
        int secondNum = 313;
        int sum1 = firstNum * secondNum;
        // System.out.println(sum1);
        // double sum2=(double)firstNum % (double)secondNum;
        // System.out.println(sum2);
        int a = 22;
        a = a + 1;
        System.out.println(a);
        // a++;
        a--;
        System.out.println(a);
        // assignmenet operator i '='
        // -----------------------------------------------------------------------
        // logical operator
        int ko = 19;
        if (ko > 18 && ko < 40) {
            System.out.println("yes");
        } else {
            System.out.println("not");
        }

    }
}