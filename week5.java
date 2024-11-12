class week5 {
 static void incrementation() {
int i = 1;
i++;
i++;
i++;
}

static void cumulativeAssign() {
int n = 1;
n += 2;
n += 3;
n += 4;
}

static void whileToFor() {
int s = 0;
for (int i = 1; i <= 5; i++)
    s += i;
}

void invertValues(boolean[] array) {
    for(int i  = 0; i < array.length; i++)
        array[i] = !array[i];
}

void replace(char[] letters, char find, char replace) {
    for (int i = 0; i<letters.length; i++)
        if (letters[i] == find)
            letters[i] = replace;
}

void replaceFirst(char[] letters, char find, char replace) {
    for (int i = 0; i<letters.length; i++)
        if (letters[i] == find) {
            letters[i] = replace;
            break;
        }
}

void replaceLast(char[] letters, char find, char replace) {
    for (int i = (letters.length - 1); i>=0; i--)
        if (letters[i] == find) {
            letters[i] = replace;
            break;
        }
}

void constrain(double[] array, double f, double l) {
    for (int i = 0; i<array.length; i++)
        array[i] = array[i] < f ? f : (array[i] > l ? l : array[i]);
} 
}

class SumArrayAbs {
     static void arrayToAbs(int[] array) {
         for(int i = 0; i < array.length; i++)
             if(array[i] < 0)
                 array[i] = -array[i];
     }
     
     static int sum(int[] array) {
         int s = 0;
         for(int i = 0; i < array.length; i++)
             s += array[i];
         return s;
     }
     
     static int sumAbs(int[] array) {
        int[] new_array = ArrayCopy.copy(array);
        arrayToAbs(new_array);
        return sum(new_array);
     }
 }

 class ArrayOrder {
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    static void invert(int[] array) {
        for (int i = 0; i < array.length/2; i++)
            swap(array, i, array.length - 1 - i);
    }
}

class Shuffle {
    static void randomSwap(int[] array) {
        int n1 = RandomInts.randomUntil(array.length), n2 = RandomInts.randomUntil(array.length);
        while (n1 == n2)
            n1 = RandomInts.randomUntil(array.length);
            
        ArrayOrder.swap(array, n1, n2);
    }
    
    static void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            ArrayOrder.swap(array, i, RandomInts.randomUntil(i));
        }
    }
}

class arrayShift {
    static void shiftLeft(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length-1; i++)
            array[i] = array[i+1];
        array[array.length - 1] = temp;
        
    }
    
    static void shiftRight(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--)
            array[i] = array[i-1];
        array[0] = temp;
    }
}

class bubbleSort {
    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) 
                    ArrayOrder.swap(array, j, j+1);
            }
        }
    }
}