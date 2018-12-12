package travoff;

public class Address {
	private String street;
	private String zip;
	private String city;
	public Address(String street, String zip, String city) {
		this.street = street;
		this.zip = zip;
		this.city = city;
	}
	public String toString() {
		return street +" "+ zip +" "+ city;
	}
}
