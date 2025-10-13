public class PatternAlphabet {
    public static void main(String[] args) {
        int n= 1;
        int  c=3;
        for(int i=0; i<5; i++){
            for(int j=0; j<=i;j++){
                System.out.print(n+" ");
                n--;

            }
            n=n+c;
            c=c+2;
         
            System.out.println();
        }
    }
    
}
