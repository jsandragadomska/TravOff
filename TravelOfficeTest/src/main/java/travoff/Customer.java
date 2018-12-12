package travoff;

public class Customer {
	private String name;
	private Address address;
	private Trip trip;
	public Customer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void asignTrip(Trip trip) {

		this.trip = trip;
	}
	public String toString() {
		return name +" "+address.toString()+" "+trip.toString();
	}
}
