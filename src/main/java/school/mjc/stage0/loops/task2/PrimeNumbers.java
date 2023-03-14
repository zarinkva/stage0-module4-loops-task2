package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 0;
        while (num <= printToInclusive) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            num++;
        }
    }

    // helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumbers primeNumbers=new PrimeNumbers();
        primeNumbers.printPrimeNumbers(19);
    }
}
