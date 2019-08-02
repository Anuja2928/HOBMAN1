package hobmanServicePackage;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer", catalog = "hobman")
public class Customer {
	
	private int customerId;
	private String customerEmail;
	private String customerName;
	private String customerAddress;
	private String customerPhoneNumber;
	private String customerPassword;
	private String customerCity;
	private String customerState;
	private int customerPinCode;
	
	
	@GeneratedValue(strategy = IDENTITY)
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	@Id
	@Column(name = "customerEmail", length = 25)
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	@Column(name = "customerName", length = 25)
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Column(name = "customerAddress", length = 20)
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	@Column(name = "customerPhoneNumber", length = 14)
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	@Column(name = "customerPassword", length = 15)
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	@Column(name = "customerCity")
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	@Column(name = "customerState")
	public String getCustomerState() {
		return customerState;
	}
	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}
	
	@Column(name = "customerPinCode", length = 7)
	public int getCustomerPinCode() {
		return customerPinCode;
	}
	public void setCustomerPinCode(int customerPincode) {
		this.customerPinCode = customerPincode;
	}
	
	
	

}
