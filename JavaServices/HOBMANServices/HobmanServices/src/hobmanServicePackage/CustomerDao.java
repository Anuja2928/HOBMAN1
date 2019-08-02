package hobmanServicePackage;

import java.util.List;

public interface CustomerDao {
	
	List<Customer> getAllCustomers();
	Customer getCustomer(String customerEmail);
	
	void addCustomer(Customer customer);
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(String customerEmail);
	
	String authenticateCustomer(Customer customer);
	

}
