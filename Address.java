package week3;

public class Address {
	    private String street;
	    private String city;
	    private String zip;

	    public void setStreet(String s) { street = s; }
	    public void setCity(String c) { city = c; }
	    public void setZip(String z) { zip = z; }

	    public String getStreet() { return street; }
	    public String getCity() { return city; }
	    public String getZip() { return zip; }

	    public static void main(String[] args) {
	        Address a = new Address();
	        a.setStreet("Howrah");
	        a.setCity("Kolkata");
	        a.setZip("00000");

	        System.out.println(a.getStreet() + ", " + a.getCity());
	    }
	}


