

/**
 *
 * @author Attakorn P.
 */
public class PrimeFactors {

    /**
     * @param args the command line arguments
     */
    
    public static void prime_factors(int n){
        
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
               System.out.print(i + " ");
            }

            while (n%i == 0)
            {
                n /= i;
            }
            
            if(i>2){
                i++;
            }
        }
        if (n >= 2)
            System.out.print(n + " \n");
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        prime_factors(Integer.parseInt(args[0]));
    }
    
}
