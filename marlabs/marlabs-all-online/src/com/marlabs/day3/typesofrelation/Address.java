package com.marlabs.day3.typesofrelation;

public class Address {
	private int streetNumber;
	private String streetName;
	private int houseNumber;
	private long pinCode;
	private String cityName;

	/**
	 * @param streetNumber
	 * @param streetName
	 * @param houseNumber
	 * @param pinCode
	 * @param cityName
	 */
	public Address(int streetNumber, String streetName, int houseNumber, long pinCode, String cityName) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.pinCode = pinCode;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", "
				+ (streetName != null ? "streetName=" + streetName + ", " : "") + "houseNumber=" + houseNumber
				+ ", pinCode=" + pinCode + ", " + (cityName != null ? "cityName=" + cityName : "") + "]";
	}

}
