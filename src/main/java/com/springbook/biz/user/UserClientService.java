package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserClientService {

	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

		UserService userService = (UserService) container.getBean("userService");

		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");

		UserVO user = userService.getUser(vo);
		if (user == null) {
			System.out.print("로그인 실패");
		} else {
			System.out.println(user.getName()+"님 환영합니다");
		}
	}

}
