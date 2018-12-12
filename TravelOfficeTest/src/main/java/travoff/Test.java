package travoff;

public class Test {
	public static void main(String[] args) {
		TravelOffice to = new TravelOffice();
		Date start1 = new Date(2018, 12, 18);
		Date start2 = new Date(2019, 02, 22);
		Date end1 = new Date(2018, 12, 23);
		Date end2 = new Date(2019, 03, 07);
		Address address1 = new Address("Elizabet Laan", "467", "Knokke-Heist");
		Address address2 = new Address("Krupowki", "789", "Zakopane");
		AbroadTrip trip1 = new AbroadTrip(start1, end1, "Belgium");
		DomesticTrip trip2 = new DomesticTrip(start2, end2, "Poland");
		Customer customer1 = new Customer("Marian");
		Customer customer2 = new Customer("Halina");
		Customer customer3 = new Customer("Zenek");
		trip1.setPrice(1999l);
		trip1.setInsurance(109.42);
		trip2.setPrice(2359l);
		trip2.setOwnArrivalDiscount(200);
		customer1.asignTrip(trip1);
		customer1.setAddress(address1);
		customer2.asignTrip(trip2);
		customer2.setAddress(address2);
		customer3.asignTrip(trip2);
		customer3.asignTrip(trip1);
		customer3.setAddress(address2);
		to.addCustomer(customer1);
		to.addCustomer(customer2);
		to.addCustomer(customer3);
		to.addTrip("0001", trip1);
		to.addTrip("0002", trip2);
//		System.out.println(to.getCustomers());
		System.out.println(to.toString());
	}
}