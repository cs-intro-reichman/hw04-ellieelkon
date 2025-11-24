public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean [] arr = new boolean [n+1];

        int i = 2;
        while (i < n + 1) 
        {
            arr [i] = true;
            i++;
        }

        int p = 2;
        while (p <= Math.sqrt(n))
        {
            if (arr[p] == true)
            {
                int k = 2 * p;
                while (k <= n)
                {
                    arr[k] = false;
                    k += p;
                }
            }
            p++;
        }
        

        System.out.println("Prime numbers up to " + n + ":");
        
        int count = 0;
        for (i = 2; i <= n; i++)
        {
            if (arr[i] == true)
            {
                System.out.println(i);
                count++;
            }
        }
        
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (count * 100 / n) + "% are primes)");
    }
}