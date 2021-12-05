package customerduplication;
import java.util.Objects;

public class Address {

	private String street;
	private String city;
	private Integer pincode;
	
	
	public Address() {
	}

	public Address(String street, String city, Integer pincode) {
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(pincode, other.pincode)
				&& Objects.equals(street, other.street);
	}


	
	
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
