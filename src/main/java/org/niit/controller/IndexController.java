package org.niit.controller;

import org.niit.mapping.UserMapping;
import org.niit.services.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	@Autowired
	InfoService infoProxy;
	@Autowired
	UserMapping userMapping;
	
	@ResponseBody
	@RequestMapping("/index")  
	public String index() {
		infoProxy.showMsg();
		return "SUCCESS";
	}
	@ResponseBody
	@RequestMapping("/testdb")
	public String testDb(@RequestParam("id") String id) {
		
		return userMapping.selectById(Integer.parseInt(id)).toString();
	}
}
