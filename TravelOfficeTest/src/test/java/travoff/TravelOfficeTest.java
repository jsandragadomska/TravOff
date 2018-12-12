package travoff;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TravelOfficeTest {
    static TravelOffice travelOffice;
    static Customer customer1;
    static Customer customer2;
    static Trip trip;
    static Date start;
    static Date end;

    @BeforeClass
    public static void initial() {
        travelOffice = new TravelOffice();
        customer1 = new Customer("Jan Kowalski");
        customer2 = new Customer("Marian Kocięba");
        start = new Date(2018, 12, 29);
        end = new Date(2019, 1, 13);
        trip = new DomesticTrip(start, end, "Poznań");
    }

    @Test
    public void shouldAddCustomer1() {
        Set<Customer> customerSet = new HashSet<>();
        customerSet.add(customer1);
        travelOffice.addCustomer(customer1);
        assertArrayEquals(customerSet.toArray(), travelOffice.getCustomerSet().toArray());
    }

    @Test
    public void shouldCountCustomers() {
        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);
        assertTrue(travelOffice.getCustomers().size() == 2);
    }

    @Test
    public void shouldRemoveCustomer() {
        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);
        travelOffice.removeCustomer(customer1);
        assertTrue(travelOffice.getCustomers().size() == 1);
    }

    @Test
    public void shouldRemoveTrip() {
        travelOffice.addTrip("0001", trip);
        travelOffice.addTrip("0002", trip);
        travelOffice.reoveTrip("0001");
        assertTrue(travelOffice.getTrips().size() == 1);
    }

    @Test
    public void shouldFindCustomerByName() {
        travelOffice.addCustomer(customer1);
        assertTrue(travelOffice.findCustomerByName("Jan Kowalski").getName().equals(customer1.getName()));
    }
}