package hobmanServicePackage;

import java.util.List;
import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class HotelDaoImpl implements HotelDao {

	@Autowired
	HibernateTemplate template;
	
	public List<Hotel> getAllTheHotels()
	{
		List<Hotel> listHotels = (List<Hotel>) template.find("from Hotel ");
		return listHotels;
	}
	
	@Override
	public List<Hotel> getAllHotelsByCity(int cityId) {
		// TODO Auto-generated method stub
		
		List<Hotel> listHotel = (List<Hotel>)template.find("from Hotel where hotelCityId =?",cityId);
		
		return listHotel;
	}

	public List<Hotel> getAllHotelsByState(int stateId)
	{
		List<Hotel> listHotel = (List<Hotel>) template.find("from Hotel where hotelStateId = ?", stateId);
		return listHotel;
	}
	@Override
	public Hotel getHotel(int id) {
		// TODO Auto-generated method stub
		
		Hotel hotel = template.get(Hotel.class, id);
		return hotel;
	}

	@Override
	@Transactional
	public void addHotel(Hotel hotel) {
		// TODO Auto-generated method stub

		template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
		template.save(hotel);
	}

	@Override
	@Transactional
	public void updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub

		template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
		template.update(hotel);;
	}

	@Override
	@Transactional
	public void deleteHotel(int id) {
		// TODO Auto-generated method stub

		template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
		template.delete(template.get(Hotel.class, id));
	}

}
