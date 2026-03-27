class Nomcalculator {

public int add(int a, int b) {
return a + b;
}

protected void display() {
System.out.println("This is display");
}

private void show() {
System.out.println("This is a show");
}

public void accessPrivate() {
show();
}
}

class Advcalculator extends Nomcalculator {

@Override
public int add(int a, int b) {
return a + b + 1;
}

@Override
public void display() {
System.out.println("This is an advanced display");
}

public void show() {
System.out.println("This is an advanced show");
}
}

public class Advaddition {
public static void main(String[] args) {

Nomcalculator a = new Nomcalculator();

System.out.println("Sum of two integers: " + a.add(2, 3));

a.display();

a.accessPrivate();

Advcalculator b = new Advcalculator();

System.out.println("Sum of two integers: " + b.add(2, 3));

b.display();

b.show();

Nomcalculator d = new Advcalculator();

System.out.println("Sum of two integers: " + d.add(2, 3));

d.display();

d.accessPrivate();

}
}