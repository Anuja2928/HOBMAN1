package hobmanServicePackage;


import java.util.List;
import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class StateDaoImpl implements StateDao {

	@Autowired
	HibernateTemplate template;
	
	@Override
	public List<State> getAllState() {
		// TODO Auto-generated method stub
		
	List<State> stateList = (List<State>)template.find("from State");
		return stateList;
	}

	@Override
	public State getState(int id) {
		// TODO Auto-generated method stub
		
	State state = 	template.get(State.class, id);
		return state;
	}

}