class week3 {
 boolean isPerfectSquare(int n) {
    return Math.sqrt(n) == Math.floor(Math.sqrt(n));
} 
}

class EvenOdd {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    static boolean isOdd(int n) {
        return !isEven(n);
    }
    
}

class RandomInts {
    static int random() {
        return (int) (Math.random() * 1000000);
    }

    static int randomUntil(int max) {
        return (int) (Math.random() * max);
    }

    static int randomWithin(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
    
}

class EvenOddRandom {
    static int randomEven(int max) {
        return RandomInts.randomUntil((int)(max/2)) * 2;
    }
    
    static int randomOdd(int max) {
        int n = RandomInts.randomUntil(max);
        return EvenOdd.isOdd(n) ? n : randomOdd(max);
    }
}

class Divisors {
    static int countDivisors(int n) {
        int count = 1;
        for(int i = 2 ; i <= n; i++) {
            count += (n%i==0) ? 1 : 0;
        }
        return count;
    }
    
    static int sumProperDivisors(int n) {
        int sum = 0;
        for(int i = 1 ; i < n; i++) {
            sum += (n%i==0) ? i : 0;
        }
        return sum;
    }
    
    static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for(int i = 2 ; i < n; i++)
            if (n%i==0)
                return false;
        return true;
    }
}

class primeNumbers {
    static int countPrimes(int n) {
        int count = 0;
        for (int i = 2 ; i<n; i++)
            if (Divisors.isPrime(i))
                count++;
        return count;
    }
    
    static boolean existsPrimeBetween(int min, int max) {
        for (int i = min+1 ; i<max; i++) 
            if (Divisors.isPrime(i))
                return true;
        return false;
    }
    
}

class perfectNumbers {
    static boolean isPerfect(int n) {
        return Divisors.sumProperDivisors(n) == n;
    }
    
    static int countPerfectNumbers(int n) {
        int count = 0;
        for(int i = 1; i<n; i++)
            if (isPerfect(i))
                count++;
        return count;
    }
}

class LargerPrimeDiff {
    static int largestPrimeDiff(int max) {
        int firstbiggest = 0;
        int secondbiggest = 0;
        for (int i = 2; i<max; i++) {
            if (Divisors.isPrime(i)) {
                secondbiggest = firstbiggest;
                firstbiggest = i;
            }
        }
        return firstbiggest - secondbiggest;
    }
}