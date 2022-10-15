public class Primes {
    public static void main(String[] args) {
        System.out.println("Prime numbers in [1; 100]:");
        int i = 2;
        while (i<=100){
            if (isPrime(i)){
                System.out.print(i + " ");}
            i = i + 1;
    }
    }

    public static boolean isPrime(int n) {
        int m = n;
        while (m > 2){
            if (n%(m-1)==0)
                return false;
            else
                m = m - 1;
        }
        return true;
    }
}
