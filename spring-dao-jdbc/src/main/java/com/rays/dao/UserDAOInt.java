package com.rays.dao;

import java.util.List;

import com.rays.dto.UserDTO;

public interface UserDAOInt {

	public long nextPk();

	public long add(UserDTO dto);

	public void delete(int id);

	public void update(UserDTO dto);

	public UserDTO findByPk(long id);

	public UserDTO findByLogin(String login);

	public List search(UserDTO dto, int pageNo, int pageSize);
	
	public UserDTO authenticate(String login, String password);

}
