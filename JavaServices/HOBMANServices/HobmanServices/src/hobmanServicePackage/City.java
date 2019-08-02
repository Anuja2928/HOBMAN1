package hobmanServicePackage;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city", catalog = "hobman")

public class City {

	private int cityId;	
	private String cityName;
	private int StateId;
	
	
	
	
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	

	@Column(name = "cityName", length = 25)
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	

	@Column(name = "stateId", length = 4)
	public int getStateId() {
		return StateId;
	}
	public void setStateId(int stateId) {
		StateId = stateId;
	}

	
	
	
	
	
	
	
	
}
