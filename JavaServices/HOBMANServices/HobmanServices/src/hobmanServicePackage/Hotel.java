package hobmanServicePackage;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel", catalog = "hobman")
public class Hotel {
	
	private int hotelId;
	private String hotelName;
	private String hotelAddress;
	private int hotelStateId;
	private int hotelCityId;
	
	private int hotelPinCode;
	
	@Column(name = "hotelCityId", length = 4)
	public int getHotelCityId() {
		return hotelCityId;
	}
	
	public void setHotelCityId(int hotelCityId) {
		this.hotelCityId = hotelCityId;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	
	@Column(name = "hotelName", length = 25)
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	@Column( name = "hotelAddress", length = 90)
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	
	@Column(name = "hotelStateId", length = 4)
	public int getHotelStateId() {
		return hotelStateId;
	}
	public void setHotelStateId(int stateId) {
		this.hotelStateId = stateId;
	}
	
	@Column(name = "hotelPinCode", length = 7)
	public int getHotelPinCode() {
		return hotelPinCode;
	}
	public void setHotelPinCode(int hotelPinCode) {
		this.hotelPinCode = hotelPinCode;
	}
	
	

	
}
