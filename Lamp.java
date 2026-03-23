package week3;

public class Lamp {
	 boolean isOn;

	    public void turnOn() {
	        isOn = true;
	        System.out.println("Lamp ON: " + isOn);
	    }

	    public void turnOff() {
	        isOn = false;
	        System.out.println("Lamp OFF: " + isOn);
	    }

	    public static void main(String[] args) {
	        Lamp l = new Lamp();
	        l.turnOn();
	        l.turnOff();
	    }

}
