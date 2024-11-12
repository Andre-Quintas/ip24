class week4 {
 static void arrayRead() {
int[] numbers = {4, 3, 2, 1}; 
int sum = numbers[0];
sum += numbers[1];
sum += numbers[2];
sum += numbers[3];
}

int sum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++)
        sum += array[i];
    return sum;
}

static void arrayOfDigits() {
int[] digits = new int[10];
int i = 0;
while(i<10) {
    digits[i] = i;
    i++;
}
}

int[] naturals(int n) {
    assert n >= 0 : "argumento não pode ser negativo";
    int[] nats = new int[n];
    for (int i = 0; i<n; i++)
        nats[i] = i+1;
    return nats;
}

boolean isOrdered(int[] array) {
    for (int i = 1; i<array.length; i++)
        if (array[i] < array[i-1])
            return false;
    return true;
}

int[] inverted(int[] old_array) {
    int[] new_array = new int[old_array.length];
    for (int i =  0; i < old_array.length; i++) {
        new_array[old_array.length - i - 1] = old_array[i];
    }
    return new_array;
}

boolean contains(int[] array, int n) {
    for (int i = 0 ; i < array.length; i++)
        if (array[i] == n)
            return true;
    return false;
}

int count(int[] array, int n) {
    int sum = 0 ;
    for (int i = 0 ; i < array.length; i++)
        if (array[i] == n)
            sum++;
    return sum;
}

boolean isPalindrome(char[] array) {
    for (int i = 0; i < array.length/2; i++)
        if (array[i] != array[array.length - 1 - i])
            return false;
    return true;
}

boolean areEqual(int[] a, int[] b) {
    if (a.length != b.length)
        return false;
    for (int i = 0; i < a.length; i++)
        if (a[i] != b[i])
            return false;
    return true;
}

int[] merge(int[] left, int[] right) {
    int[] array = new int[left.length + right.length];
    for (int i = 0; i < left.length; i++)
        array[i] = left[i];
    for (int i = left.length; i < right.length + left.length; i++)
        array[i] = right[i-left.length];
    return array;
}

boolean alternatedBooleans(boolean[] array) {
    for(int i  = 1 ; i < array.length; i++)
        if (array[i] == array[i-1])
            return false;
    return true;
}

boolean[] invertedBooleans(boolean[] array) {
    for(int i  = 0; i < array.length; i++)
        array[i] = !array[i];
    return array;
} 
}

class arrayUtil {
    static boolean isEmpty(int[] array) {
        return array.length == 0;
    }
    
    static int first(int[] array) {
        return array[0];
    }
    
    static int last(int[] array) {
        return array[array.length - 1];
    }
    
    static int nextIndex(int[] array, int n) {
        if (array.length <= n+1)
            return 0;
        return n+1;
    }
    
    static int prevIndex(int[] array, int n) {
        if (n == 0)
            return array.length -1;
        return n-1;
    }
    
    static int element(int[] array, int n) {
        if (n < 0)
            return array[array.length + n];
        return array[n];
    }
}

class ArrayCopy {
    static int[] copyNewSize(int[] array, int n) {
        int[] new_array = new int[n];
        for (int i = 0 ; i < n; i++) {
            if (i >= array.length)
                new_array[i] = 0;
            else 
                new_array[i] = array[i];
        }
        return new_array;
    }
    
    static int[] copy(int[] array) {
        return copyNewSize(array, array.length);
    }


}

class randomArray {
    static int[] randomArray(int n) {
        int[] array = new int[n];
        for(int i = 0 ; i < n; i++)
            array[i] = RandomInts.randomUntil(10);
        return array;
    }
    
    static int randomIndex(int[] array) {
        return RandomInts.randomUntil(array.length);
    }
    
    static int randomElement(int[] array) {
        return array[RandomInts.randomUntil(array.length)];
    }
}

class doubleStats {
    static double min(double[] array) {
        double m = array[0];
        for (int i = 1; i< array.length; i++) 
            if (m > array[i])
                m = array[i];
        return m;
    }
      
    static double max(double[] array) {
        double m = array[0];
        for (int i = 1; i< array.length; i++) 
            if (m < array[i])
                m = array[i];
        return m; 
    }
    
    static double sum(double[] array) {
        double m = 0;
        for (int i = 0; i< array.length; i++) 
            m += array[i];
        return m; 
    }
    
    static double average(double[] array) {
        double m = sum(array);
        return m / array.length; 
    }
}

class subArray {
    static int[] subArray(int[] array, int f, int l) {
        int[] new_array = new int[l-f+1];
        for (int i = f ; i <= l; i++)
            new_array[i-f] = array[i];
        return new_array;
    }
    
    static int[] leftSide(int[] array, boolean b) {
        int size = array.length % 2 == 0 ? (array.length / 2) : (b ? (array.length / 2 + 1) : (array.length / 2) );
        int[] new_array = new int[size];
        for (int i  = 0; i < size; i++)
            new_array[i] = array[i];
        return new_array;
    }
    
    static int[] rightSide(int[] array, boolean b) {
        int size = array.length % 2 == 0 ? (array.length / 2) : (b ? (array.length / 2 + 1) : (array.length / 2) );
        int[] new_array = new int[size];
        for (int i = 0; i < size; i++)
            new_array[i] = array[i + array.length - size];
        return new_array;
    }
}