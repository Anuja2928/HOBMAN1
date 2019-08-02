package hobmanServicePackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;


//@CrossOrigin("http://localhost:4200")
@RestController
@CrossOrigin("http://localhost:4200")
public class CustomerController {
	
	@Autowired
	CustomerDao customerdao;
	
	
	@GetMapping("/customers")
	public String getAllCustomers()
	{
		List<Customer> customerList = customerdao.getAllCustomers();
		String json = new Gson().toJson(customerList);
		return json;
	}
	
	@GetMapping("/customer/{customerEmail}")
	public String customerById(@PathVariable String customerEmail)
	{
		return new Gson().toJson(customerdao.getCustomer(customerEmail));
	}
	
	@PostMapping("/customer/authentication")
	public String authenticateCustomer(@RequestBody Customer customer)
	{
		return new Gson().toJson(customerdao.authenticateCustomer(customer));
	}
	
	@PostMapping("/customers")
	public void addCustomer(@RequestBody Customer customer)
	{
		customerdao.addCustomer(customer);
	}
	
	@PutMapping("/customers")
	public void updateCustomer(@RequestBody Customer customer)
	{
		customerdao.updateCustomer(customer);
	}
	
	@DeleteMapping("/customer/{customerEmail}")
	public void deleteCustomer(@PathVariable String customerEmail)
	{
		customerdao.deleteCustomer(customerEmail);
	}

}
