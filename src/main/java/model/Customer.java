package model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Customer implements Externalizable {
	private String firstname;
	private String lastname;
	private String street;
	private Double sales;
	private int couponWorth = 0;
	
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public void setSales(Double sales) {
		this.sales = sales;
	}
	
	public Double getSales() {
		return this.sales;
	}
	
	public void setCouponWorth(int couponWorth) {
		this.couponWorth = couponWorth;
	}
	
	public Integer getCouponWorth() {
		return this.couponWorth;
	}
	
	public String toString() {
		return 
				"Firstname: " + getFirstname()+ 
				" Lastname: " + getLastname() + 
				" Jahresumsatz: " + getSales() + "€" + 
				" CouponWert " + getCouponWorth() + "€" + 
				" Adresse: " + getStreet();
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setFirstname((String) in.readObject());
        setLastname((String) in.readObject());
        setStreet((String) in.readObject());
        setSales(in.readDouble());
        setCouponWorth(in.readInt());
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getFirstname());
        out.writeObject(getLastname());
        out.writeObject(getStreet());
        out.writeDouble(getSales());
        out.writeInt(getCouponWorth());
	}
	

}
