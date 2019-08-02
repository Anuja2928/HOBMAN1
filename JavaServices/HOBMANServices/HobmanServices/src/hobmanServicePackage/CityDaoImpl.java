package hobmanServicePackage;

import java.util.List;
import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CityDaoImpl implements CityDao {

	@Autowired
	HibernateTemplate template;

	@Override
	public List<City> getAllCity(int stateId) {

		System.out.println("Into DAOImplemetation with stateId : "+stateId);
		List<City> listCity = (List<City>) template.find("from City where stateId = ?", stateId);

		return listCity;

	}

	@Override
	public City getCity(int id) {

		City city = template.get(City.class, id);
		return city;

	}

	/*
	 * 
	 * @Override
	 * 
	 * @Transactional public void addCity(City city) {
	 * 
	 * 
	 * template.save(city);
	 * 
	 * }
	 * 
	 * @Override
	 * 
	 * @Transactional public void updateCity(City city) {
	 * 
	 * // template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.
	 * COMMIT); template.update(city);
	 * 
	 * }
	 * 
	 * @Override
	 * 
	 * @Transactional public void deleteCity(int id) {
	 * 
	 * // template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.
	 * COMMIT); template.delete(template.get(City.class, id));
	 * 
	 * }
	 * 
	 * 
	 */

}
