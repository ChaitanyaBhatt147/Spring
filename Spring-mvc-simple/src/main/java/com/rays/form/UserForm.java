package com.rays.form;

import org.hibernate.validator.constraints.NotEmpty;

public class UserForm {

	protected Long id = null;
	private long ids[] = null;
	private int pageNo = 1;
	@NotEmpty(message = "FirstName is required")
	private String firstName = null;
	@NotEmpty(message = "LastName is required")
	private String lastName = null;
	@NotEmpty(message = "Login is required")
	private String login = null;
	@NotEmpty(message = "Password is required")
	private String password = null;
	@NotEmpty(message = "DOB is required")
	private String dob;
	@NotEmpty(message = "Address is required")
	private String address = null;

	public long[] getIds() {
		return ids;
	}

	public void setIds(long[] ids) {
		this.ids = ids;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
