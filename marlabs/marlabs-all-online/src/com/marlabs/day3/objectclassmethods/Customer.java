package com.marlabs.day3.objectclassmethods;

import java.util.Objects;

public class Customer implements Cloneable {
	private int id;
	private String name;
	private String password;
	private String cityName;

	/**
	 * @param id
	 * @param name
	 * @param password
	 * @param cityName
	 */
	public Customer(int id, String name, String password, String cityName) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
				+ (password != null ? "password=" + password + ", " : "")
				+ (cityName != null ? "cityName=" + cityName : "") + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cityName, id, name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		return Objects.equals(cityName, other.cityName) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() {
		System.out.println("from finalize method");
	}

}
