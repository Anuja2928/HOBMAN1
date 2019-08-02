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
public class HotelController {

	@Autowired
	HotelDao hoteldao;
	
	@GetMapping(value = "/hotels")
	public String getAllTheHotels()
	{
		List<Hotel> listHotel = hoteldao.getAllTheHotels();
		String json = new Gson().toJson(listHotel);
		return json;
	}
	
	@GetMapping(value = "/hotelsbycity/{cityId}")
	public String getAllHotelsByCity(@PathVariable int cityId)
	{
		List<Hotel> listHotel = hoteldao.getAllHotelsByCity(cityId);
		String json = new Gson().toJson(listHotel);
		return json;
	}
	
	@GetMapping(value = "/hotels/{stateId}")
	public String getHotelsByState(@PathVariable int stateId)
	{
		List<Hotel> listHotelsByState = hoteldao.getAllHotelsByState(stateId);
		String json = new Gson().toJson(listHotelsByState);
		return json;
	}
	
	@GetMapping(value = "/hotel/{id}")
	public String getHotel(@PathVariable int id)
	{
		return new Gson().toJson(hoteldao.getHotel(id));
	}
	
	@PostMapping(value = "/hotels")
	public void addHotel(@RequestBody Hotel hotel)
	{
		hoteldao.addHotel(hotel);
	}
	
	
	@PutMapping(value = "/hotels")
	public void updateHotel(@RequestBody Hotel hotel)
	{
		hoteldao.updateHotel(hotel);
	}
	
	@DeleteMapping(value ="/hotel/{id}")
	public void deleteHotel(@PathVariable int id)
	{
		hoteldao.deleteHotel(id);
	}
}
