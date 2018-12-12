package travoff;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TravelOffice {
	private Set <Customer> customers = new HashSet<>();
	private Map <String, Trip> trips = new HashMap<>();
	
	public void addCustomer(Customer customer) {

		customers.add(customer);
	}
	public boolean removeCustomer(Customer c) {
		if(c != null) {
			return customers.remove(c);
		}
		return false;
	}
	public void addTrip(String id, Trip trip) {

		trips.put(id, trip);
	}
	public boolean reoveTrip(String id) {
		if (id != null) {
			return trips.remove(id) != null;
		}
		return false;
	}
	public Customer findCustomerByName(String name) {
		for (Customer c : customers) {
			if(c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}
	public Set<Customer> getCustomerSet() {
		return customers;
	}

	public Map<String, Trip> getTripMap() {
		return trips;
	}
	
	public int getCustomerCount() {

		return customers.size();
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public Map<String, Trip> getTrips() {

		return trips;
	}

	@Override
	public String toString() {
		String report = "";
		for (Customer c : customers) {
			report += c + "\n";
		}
		return report;
	}
	
	
	
	//	int customerCount = 0;
//	travoff.Customer customers[] = new travoff.Customer[2];

//	public void addCustomer(travoff.Customer customer) {
//		if (customerCount == customers.length) {
//			travoff.Customer temp[] = new travoff.Customer[customers.length + 2];
//			System.arraycopy(customers, 0, temp, 0, customers.length);
//			customers = temp;
//		}
//		customers[customerCount++] = customer;
//	}

//	public int getCustomerCount() {
//		return customerCount;
//	}

//	public String toString() {
//		String report = "";
//		for (int i = 0; i < customers.size(); i++) {
//			report += customers.toString() + "\n";
//		}
//		return report;
//	}
	
	
}

