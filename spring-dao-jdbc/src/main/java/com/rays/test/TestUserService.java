package com.rays.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserService;

@Component("testUserService")
public class TestUserService {

	@Autowired
	public UserService service = null;

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TestUserService test = (TestUserService) context.getBean("testUserService");

//		test.testAdd();
//		System.out.println("---------------");
//		test.testDelete();
//		System.out.println("---------------");
//		test.testUpdate();
		System.out.println("---------------");
		test.testAuthenticate();
		System.out.println("---------------");
		test.testFindBylogin();
		System.out.println("---------------");
		test.testFindByPk();
		System.out.println("---------------");
		test.testSearch();
		System.out.println("---------------");
	}

	public void testAdd() {
		UserDTO dto = new UserDTO();
		dto.setFirstName("abc");
		dto.setLastName("abc");
		dto.setLogin("abc@gmail.com");
		dto.setPassword("abc123");
		long pk = service.add(dto);
		System.out.println("Data Inserted... pk = " + pk);
	}

	public void testDelete() {
		service.delete(2);
		System.out.println("Data deleted...");
	}

	public void testUpdate() {
		UserDTO dto = new UserDTO();
		dto.setId(2);
		dto.setFirstName("xyz");
		dto.setLastName("xyz");
		dto.setLogin("xyz@gmail.com");
		dto.setPassword("xyz123");
		service.update(dto);
		System.out.println("Data Updated...");
	}

	public void testFindByPk() {
		UserDTO dto = service.findByPk(1);
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());
	}

	public void testFindBylogin() {
		UserDTO dto = new UserDTO();
		dto.setLogin("xyz@gmail.com");
		dto = service.findByLogin(dto);
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());
	}

	public void testSearch() {
		UserDTO dto = new UserDTO();
		List<UserDTO> list = service.search(dto, 1, 5);

		Iterator<UserDTO> it = list.iterator();
		while (it.hasNext()) {
			dto = it.next();
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		}
	}

	public void testAuthenticate() {
		UserDTO dto = new UserDTO();
		dto.setLogin("abc@gmail.com");
		dto.setPassword("abc123");
		dto = service.authenticate(dto);
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());
	}

}