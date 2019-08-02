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


@RestController
@CrossOrigin("http://localhost:4200")
public class StateController {

	
	@Autowired
	StateDao statedao;
	
	@GetMapping(value = "/states")
	public String getAllStates()
	{
		List<State> listStates = statedao.getAllState();
		String json = new Gson().toJson(listStates);
		return json;
	}
	
	@GetMapping(value = "/state/{id}")
	public String getState(@PathVariable int id)
	{
		return new Gson().toJson(statedao.getState(id));
	}
}