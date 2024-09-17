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