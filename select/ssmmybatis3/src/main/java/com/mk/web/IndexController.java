package com.mk.web;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mk.bean.Params;
import com.mk.mapper.IContentMapper;
import com.mk.service.IUserService;

@Controller
public class IndexController {

//	@Autowired
//	private IContentMapper contentmapper;
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/index")
	public String index(Model model,Params params){
		model.addAttribute("users",userService.findUsers(params));
		return "index";
	}
	
//	@RequestMapping("/list")
//	public ModelAndView list(){
//		//创建ModelAndView对象
//		ModelAndView andView = new ModelAndView();
//		//查询全部
//		List<HashMap<String, Object>> content = contentmapper.query();
//		System.out.println(content);
//		//放入域当中
//		andView.addObject("content", content);
//		//放回视图
//		andView.setViewName("content");	
//		return andView;
//	}	
}
