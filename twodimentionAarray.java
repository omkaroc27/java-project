class twodimen{
    public static void main(String[] args) {
        int a[][]={{3,2}, {2,3}};
        int b[][]={{4,5}, {5,4}};
        //creating another matrix to store sum 
       int c[][]= new int[2][2];
        //adding $ printing addition of tow matrix
        for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            c[i][j]=a[i][j]+b[i][j];
          
            System.out.print(c[i][j]+" ");
       
        }
        System.out.println();
       // System.out.println(i);
      
        }
    }}