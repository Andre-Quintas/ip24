class week1 {
 int next(int n) {
    return n+1;
}

int previous(int n) {
    return n-1;
}

double doubleOf(double n) {
     return 2*n;
}

int square(int n) {
    return n*n;
}

int difference(int a, int b) {
    return a-b;
}

double average(double n1, double n2) {
    return (n1+n2)/2;
}

double average(int a, int b) {
    return ((double)(a+b))/2;
}

int round(double n) {
    return (int) (n+0.5);
}

boolean isNegative(int x) {
    return x < 0;
}

boolean isDigit(int n) {
    return n >= 0 && n <= 9;
}

static boolean isEven(int n) {
    return n%2==0;
}

boolean isOdd(int n) {
    return n%2!=0;
}

double abs(double n) {
    return n<0 ? -n : n;
}

double min(double n1, double n2) {
    return n1<n2 ? n1 : n2;
}

int sumNaturals(int n) {
    return (n*(n+1))/2;
}

boolean isVowel(char c) {
    return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
}

boolean inOrder(int  n1, int n2, int n3) {
    return n1 < n2 && n2 < n3;
}

boolean isIncluded(int n, int min, int max) {
    return n<=max && n>=min;
}

boolean isExcluded(int n, int min, int max) {
    return n>max || n<min;
}

boolean xor(boolean a, boolean b) {
    return a&&b ? false : a||b;
}

boolean sameSignal(int n1, int n2) {
    return (n1>0 && n2>0) || (n1<0 && n2<0);
}

boolean onlyOnePositive(int n1, int n2) {
    return (n1>0 && n2>0) ? false : (n1>0 || n2>0);
} 
}

class Util {
     static double max(double a, double b) {
         return a > b ? a : b;
     }
     
     static double min(double n1, double n2) {
        return n1<n2 ? n1 : n2;
    }
        
    static boolean inOrder(int  n1, int n2, int n3) {
        return n1 < n2 && n2 < n3;
    }
}