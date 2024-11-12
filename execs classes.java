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
