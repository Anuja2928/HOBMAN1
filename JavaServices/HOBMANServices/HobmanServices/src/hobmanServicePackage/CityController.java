package hobmanServicePackage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

import hobmanServicePackage.CityDao;


@RestController
@CrossOrigin("http://localhost:4200")
public class CityController {

	@Autowired
	CityDao citydao;
	
	
	@GetMapping(value = "/cities/{stateId}")
	public String getAllCities(@PathVariable int stateId)
	{
		System.out.println("Into the controller with stateId : "+stateId);
		List<City> listCity = citydao.getAllCity(stateId);
		String json = new Gson().toJson(listCity);
		return json;
	}
	
	
	@GetMapping(value = "/city/{id}")
	public String getCity(@PathVariable int id)
	{
		return new Gson().toJson(citydao.getCity(id));
	}
	
	
	
	
	
	
}
