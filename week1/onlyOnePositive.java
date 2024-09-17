boolean onlyOnePositive(int n1, int n2) {
    return (n1>0 && n2>0) ? false : (n1>0 || n2>0);
}