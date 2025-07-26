//do it yourself again
//The Sieve of Eratosthenes 
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;  // No primes less than 2
        // A new array with every entry as true, consider every number as prime, initially. 
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);//worhty

        isPrime[0] = false;//as 0 is not prime.
        isPrime[1] = false;//as 1 is not prime.
        //mark all the factors of i as non prime(false), as they have a factor - non prime.
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {//start from i*i as smaller numbers than that ould be covered by smaller numbers.
                    isPrime[j] = false;
                }
            }
        }
        //count the remaining tue values in array representing the true primes.
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
