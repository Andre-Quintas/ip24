class week7 {
 int count(char c, String text) {
    int m = 0;
    for (int i = 0; i<text.length(); i++)
    {
        if (c == text.charAt(i))
            m++;
    }
    return m;
}

boolean allUpperCase(String s) {
    for (int i = 0; i<s.length(); i++)
        if ((int)s.charAt(i) < 65 || (int)s.charAt(i) > 90)
            return false;
    return true;
}

boolean isWord(String s) {
    if (s.isEmpty())
        return false;
    for (int i = 0; i<s.length(); i++)
        if (!(((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90) || ((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122)))
            return false;
    return true;
}

boolean isPalindrome(String s) {
    for (int i = 0; i<s.length()/2; i++)
        if (s.charAt(i) != s.charAt(s.length() - 1 - i))
            return false;   
    return true;
}

int countWords(String s) {
    int count = 0;
    if (s.length() != 0 && s.charAt(0) != ' ')
        count++;
    for (int i = 1; i<s.length(); i++)
        if (s.charAt(i) != ' ' && s.charAt(i-1) == ' ')
            count++;
    return count;
}

String wrap(String s, char c) {
    String str = "";
    if (c == '(' || c == ')') {
        str = "(".concat(s);
        return str.concat(")");
    }
    else if (c == '[' || c == ']') {
        str = "[".concat(s);
        return str.concat("]");
    }
    else if (c == '{' || c == '}') {
        str = "{".concat(s);
        return str.concat("}");
    }
    else {
        return c + s + c;
    }
}

int count(String s, String[] array) {
    int m = 0;
    for (int i = 0; i<array.length; i++) {
        if (array[i].equals(s))
            m++;
    }
    return m;
}

String largest( String[] array) {
    String m = "";
    for (int i =0; i<array.length; i++) {
        if (array[i].length() > m.length())
            m = array[i];
    }
    return m;
}

String join(String[] array, String sep) {
    String m = "";
    for (int i =0; i<array.length; i++) {
        m += array[i];
        if (i != array.length-1)
            m += sep;
    }
    return m;
} 
}

