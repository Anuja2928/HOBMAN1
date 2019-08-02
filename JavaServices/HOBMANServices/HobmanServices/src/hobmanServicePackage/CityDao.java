package hobmanServicePackage;
import java.util.List;
public interface CityDao {

	
List<City> getAllCity(int stateId);
	
	City getCity(int id);
	
/*	void addCity(City city);
	
	void updateCity(City city);
	
	void deleteCity(int id);	
	
	*/
	
	
}
