package hobmanServicePackage;

import java.util.List;

public interface HotelDao {
	
	List<Hotel> getAllTheHotels();
	
	List<Hotel> getAllHotelsByCity(int cityId);
	
	List<Hotel> getAllHotelsByState(int stateId);
	
	Hotel getHotel(int id);
	
	void addHotel(Hotel hotel);
	
	void updateHotel(Hotel hotel);
	
	void deleteHotel(int id);
	

}
