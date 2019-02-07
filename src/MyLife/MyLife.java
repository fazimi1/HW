package MyLife;

public class MyLife {
String work = "Domino's Pizza";
int years = 6;
String College = "Baruch College";
int height;
String car = "Honda Civic";

public void workplace(){
	System.out.println("This is where I work. " + work);
}
public void numberofyears() {
	System.out.println("This is how long I have worked at Domino's Pizza. " + years + " years");
	
}
public int height(int feet, int inches) {

	System.out.println("My height is " + feet + " ft " +  inches + " inches");
	return height;
}
public void school() {
	System.out.println("This is the college I graduated in. " + College);
}
public void firstcar() {
	System.out.println("This was my first car. " + car);
}

}
