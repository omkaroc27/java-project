public class areaCalculation {
    public static void main(String[] args) {
        int l=10;
        int w=72;
        float r=2.3f;
        int rectangle =areaCalculation(l,w) ;
        float circle =areaCalculation(r);
        System.out.println("area of reactngle is "+rectangle);
        System.out.println("area of circle"+circle);
    }
    public static int areaCalculation(int n1 ,int n2){
                int result=n1*n2;
                return result;
    }
    public static float areaCalculation(float r){
        float result=3.14f*r*r;
        return result;
    }
}
