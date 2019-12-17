import java.util.Arrays;


public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
   
    
    public static void main(String[] args) {
          Arrays.fill(sieve, true); //sets all values to true
          sieve[0] = false;
          sieve[1] = false;
          
          //for(int i=2; i<=999; i++){
              //int n= 2;
              // if(i%n==0 && n!=i){
                     //sieve[i]= false;
               //}
            // else{
                  // sieve[i]= true;
            // }
           //n++;
          for (int i=2; i<sieve.length; i++){
              for(int j=2*i; j< sieve.length; j+= i) {
                 sieve[j]= false;
              }
          }
          System.out.println(Arrays.toString(sieve)); 
          int[] result = collectPrimes();
          System.out.println(Arrays.toString(result)); 
          printPrimeFactors(132, result);
    }

    public static int[] collectPrimes(){
        int count = 0;
        for (int i =0; i<sieve.length; i++) {
            if (sieve[i]== true){
                count ++;
            }   
         }
        int[] primes = new int[count];
        int m = 0;
        for (int q= 0; q <sieve.length; q++) {
            if(sieve[q]==true){
                primes[m] = q;
                m++;
            }
        }  
        return primes;
    }

    public static void printPrimeFactors(int n, int[] prime){
        
        for(int b= 0; b <prime.length; b++){
            if(prime[b]!=0){
                int m=0;
                while(n% prime[b]== 0){   
                    if(n%prime[b]==0){
                       n= n/(prime[b]);
                       m++;
                     }
                    if(m>0){
                      System.out.println(prime[b] + ":" + m);
                    }
                }
                /*if(m>0){
                }*/
            }
        }
    }
}

    


