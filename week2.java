class week2 {
 double abs(double n) {
    if (n < 0) {
        return -n;
    } else {
        return n;
    }
}


int max(int a, int b) {
    if (a < b) {
        return b;
    } else {
        return a;
    }
}


int min(int a, int b) {
    if (a < b) {
        return a;
    } else {
        return b;
    }
}


int irsGroup(int a) {
    if (a < 10000) {
        return 1;
    } else if (a <= 25500) {
        return 2;
    } else if (a <= 48500) {
        return 3;
    } else {
        return 4;
    }
}


double irsTax(int a) {
    if (a == 1) {
        return 0.12;
    } else if (a == 2) {
        return 0.18;
    } else if (a == 3) {
        return 0.23;
    } else if (a == 4) {
        return 0.29;
    } else {
        return 0;
    }
}



static void varAssign() {
int n = 1;
n = 2;
n = n + 1;
n = 4;
n = n + 1;


}

static void varAssignDiv() {
int v = 2024;
v /= 10;
v /= 10;
v /= 10;

}

int firstDigit(int n) {
    while (n > 10) {
        n /= 10;
    }
    return n;
}

static void naturalsIterator() {
int i = 0;
while(i <= 4) {
   i = i + 1;
}
}

int sumNaturals(int max) {
    int sum = 0;
    for (int i = 1; i <= max; i++) {
        sum += i;
    }
    return sum;
}

static void reverseIteration() {
int x = 5;
while(x > 0) {
   x--;
}
}

int powerOfTwo(int n) {
    int num = 1;
    for(int i=0; i<n; i++) {
        num *= 2;
    }
    return num;
}

boolean isMultiple(int n1, int n2) {
    return (double)(n1/n2) == ((double)n1 / (double)n2);
}

int intDivision(int n1, int n2) {
    int iter = 0;
    for (int i=n1; i>=n2; iter++) {
        i -= n2;
    }
    return iter;
}

static void iterationStepTwo() {
int p = 2;
while(p < 10) {
    p += 2;
}
}

int sumEvenBetween(int n1, int n2) {
    int sum = 0;
    if (n1 % 2 != 0) {n1++;}
    while (n1 <= n2) {
        sum += n1;
        n1 += 2;
    }
    return sum;
}

char nextLetter(char c) {
    return c == 'z' ? 'a' : (char)(((int)c)+1);
}

int gcd(int a, int b) {
    int temp = 0;
    while (b != 0) {
        temp = a;
        a = b;
        b = temp%b;
    }
    return a;
}

int invert(int n1) {
    int n2 = 0;
    int n = 0;
    while (n1 > 0) {
        n = n1 - (n1/10)*10;
        n1 -= n;
        n1 /= 10;
        n2 += n;
        n2 *= 10;
    }
    n2 /= 10;
    return n2;
}

int fibonacci(int n) {
    int n1 = 1;
    int n2 = 1;
    int temp = 0;
    for (int i = 0; i<n; i++) {
        temp = n2;
        n2 = n1;
        n1 = temp + n2;
    }
    return temp;
} 
}

class IrsUtil {
    static int irsGroup(int a) {
        if (a < 10000) {
            return 1;
        } else if (a <= 25500) {
            return 2;
        } else if (a <= 48500) {
            return 3;
        } else {
            return 4;
        }
    }
    
    static double irsTax(int a) {
    if (a == 1) {
        return 0.12;
    } else if (a == 2) {
        return 0.18;
    } else if (a == 3) {
        return 0.23;
    } else if (a == 4) {
        return 0.29;
    } else {
        return 0;
    }
}
    
}
