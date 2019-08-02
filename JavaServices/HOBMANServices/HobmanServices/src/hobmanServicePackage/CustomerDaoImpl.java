package hobmanServicePackage;

import java.util.Iterator;
import java.util.List;

import org.hibernate.FlushMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	HibernateTemplate template;
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		
		List<Customer> listCustomer = (List<Customer>) template.find("from Customer");
		return listCustomer;
	}

	@Override
	public Customer getCustomer(String customerEmail) {
		// TODO Auto-generated method stub
		
		Customer customer = template.get(Customer.class, customerEmail);
		return customer;
	}

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
		template.save(customer);

	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

		template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
		template.update(customer);
	}

	@Override
	@Transactional
	public void deleteCustomer(String customerEmail) {
		// TODO Auto-generated method stub
		
		template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
		template.delete(template.get(Customer.class, customerEmail));

	}
	
	public String authenticateCustomer(Customer customer)
	{
		String emailId = customer.getCustomerEmail();
		String password = customer.getCustomerPassword();
		
		List<Customer> listCustomer = getAllCustomers();
		
		Iterator iterateCustomer = listCustomer.iterator();
		
		String returnString = "not valid";
		
		while(iterateCustomer.hasNext())
		{
			Customer singleCustomer  = (Customer)iterateCustomer.next();
			if(singleCustomer.getCustomerEmail().equals(emailId) && singleCustomer.getCustomerPassword().equals(password))
			{
				returnString = "Successfully Logged In";
				return returnString;
			}
		}
		return returnString;
	}
		
		
	}


