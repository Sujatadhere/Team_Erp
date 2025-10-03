public class PrimePattern {
    public static void main(String[] args) {
        int n=2;
        for(int i=0; i<5; i++){
            for(int j=0; j<=i;j++){
                for(; ;){
                    if(isPrime(n))break;
                    n++;
                }
                System.out.print(n+ " ");
                n++;

                        
            }
            System.out.println();
        }
    }
    public static boolean isPrime(int n){

        for(int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
}
