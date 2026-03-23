package week3;

public class Box {
	    double w, h, d;

	    public Box(double x) {
	        w = h = d = x;
	    }

	    public Box(double a, double b, double c) {
	        w = a;
	        h = b;
	        d = c;
	    }

	    public Box() {
	        w = 10;
	        h = 8;
	        d = 12;
	    }

	    public void getVolume() {
	        System.out.println("Volume = " + (w * h * d));
	    }

	    public static void main(String[] args) {
	        Box b1 = new Box(5);
	        Box b2 = new Box(2, 3, 4);
	        Box b3 = new Box();

	        b1.getVolume();
	        b2.getVolume();
	        b3.getVolume();
	    }
	}
	


