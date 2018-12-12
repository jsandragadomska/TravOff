package travoff;

public class DomesticTrip extends Trip{
	private int ownArrivalDiscount;
	public DomesticTrip(Date start, Date end, String destination) {
		super(start, end, destination);
	}
	public void setOwnArrivalDiscount(int ownArrivalDiscount) {
		this.ownArrivalDiscount = ownArrivalDiscount;
	}
	public double getPrice() {
		double priceDisc;
		priceDisc = super.getPrice() - ownArrivalDiscount;
		return priceDisc;
	}
	public double getOwnArrivalDiscount() {
		return ownArrivalDiscount;
	}
}
