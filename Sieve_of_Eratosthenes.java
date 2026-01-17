import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {
    static void main() {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n<=2){
          System.out.println("0");
          return;
      }

      boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
      isPrime[0]=false;
      isPrime[1]=false;
      int cnt=0;

      for(int i=2;i<n;i++){
          if(isPrime[i]){
              cnt++;
              for(int j=2*i;j<n;j+=i){
                  isPrime[j]=false;
              }
          }
      }
        System.out.println(cnt);
    }
}
