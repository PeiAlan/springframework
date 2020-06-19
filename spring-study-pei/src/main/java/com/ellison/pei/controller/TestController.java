package com.ellison.pei.controller;

import com.ellison.pei.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ellisonpei
 */
@Controller
@RequestMapping("/pei")
public class TestController {

	@RequestMapping("/root")
	@ResponseBody
	public String root(){
		Student student = new Student();
		String name = student.getName();
		String password = student.getPassword();
		return "////////--------------/pei/root,参数：name="+ name + ",password="+ password;
	}

}
