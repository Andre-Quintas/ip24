/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

class Counter {
	private int value;
	private int max;

    Counter(int max) {
        this.value = 0;
        this.max = max;
    }

    public int value() {
        return this.value;
    }
    
    public boolean atStart() {
        return this.value == 0;
    }
    
    public boolean atEnd() {
        return this.value == this.max;
    }
    
    public void increment() {
        this.value++;
    }
    
    public void decrement() {
        this.value--;
    }
}

class Calculator {
    private int value;
    
    Calculator() {
        this.value = value;
    }
    
    public int value() {
        return this.value; 
    }
    
    public void plus(int n) {
        this.value += n;
    }
    
    public void times(int n) {
        this.value *= n;
    }
    
    public void power(int n) {
        int v = this.value;
        for (int i = 1; i < n; i++)
            this.value *= v;
    }
}

public class MyClass {
  public static void main(String args[]) {
    /*Counter c = new Counter(5);
	System.out.println(c.value());
	while(!c.atEnd()) {
		c.increment();
		System.out.println(c.value());
	}
	while(!c.atStart()) {
		c.decrement();
		System.out.println(c.value());
	}*/
	
	/*Calculator c = new Calculator();
	System.out.println(c.value());
	c.plus(2);
	System.out.println(c.value());
	c.times(4);
	System.out.println(c.value());
	c.power(3);
	System.out.println(c.value());*/

  }
}