package customerduplication;
import java.util.Objects;

public class Customer1 {

	private String name;
	private Address address;

	public Customer1() {
	}

	public Customer1(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

		Customer1 other = (Customer1) obj;
		return Objects.equals(name, other.name) && this.address.equals(other.getAddress());
	}

	@Override
	public String toString() {
		return "Name:" + name + "\nAddress:" + address.getStreet() + "," + address.getCity() + "-"
				+ address.getPincode();
	}

}
