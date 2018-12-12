package travoff;

public abstract class Trip {
	private Date start;
	private Date end;
	private String destination;
	private double price;
	public Trip (Date start, Date end, String destination) {
		this.start = start;
		this.end = end;
		this.destination = destination;	
	}
	public String toString() {
		return start +" "+ end +" "+destination+" "+ getPrice();
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}	
}
