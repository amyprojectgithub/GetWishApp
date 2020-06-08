package com.nt.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishMessageService;

@Controller
public class WishMessageController {
	@Autowired
	private WishMessageService service;

	@RequestMapping("/home.htm")
	//Best signature to bring the effect of ParameterizableViewController class
	public String getHome() {
		return "welcome";
	}
	/*	@RequestMapping("/wish.htm")
		public ModelAndView getWishMessage() {
			String msg=null;
			//use service
			msg=service.getWishMsg();
			return new ModelAndView("result", "wishMsg", msg);
		}*/

	/*@RequestMapping("/wish.htm")
	public String getWishMessage(Model model) {
		String msg=null;
		//use service
		msg=service.getWishMsg();
		model.addAttribute("wishMsg", msg);
	    //return Logical view name
		return "result";
	}*/

	/*	@RequestMapping("/wish.htm")
		public String getWishMessage(ModelMap model) {
			String msg=null;
			//use service
			msg=service.getWishMsg();
			model.addAttribute("wishMsg", msg);
		    //return Logical view name
			return "result";
		}*/

	@RequestMapping("/wish.htm")
	//Best Signature to bring the effect of AbstractController class
	public String getWishMessage(Map<String,Object> map) {
		String msg=null;
		//use service
		msg=service.getWishMsg();
		map.put("wishMsg", msg);
	    //return Logical view name
		return "result";
	}

	/*
	 * If there is no provision to give logical view name,
	 * then the virtual path of incoming request uri ll'
	 * become the logical view name implicitly.In the
	 *  below cae "wish" ll' become logical view name..
	 */

	/*@RequestMapping("/wish.htm")
	public void getWishMessage(Map<String,Object> map) {
		//System.out.println(map.getClass().getName());
		String msg=null;
		//use service
		msg=service.getWishMsg();
		map.put("wishMsg", msg);
		}*/

	/*@RequestMapping("/wish.htm")
	public Model getWishMessage() {
		String msg=null;
		Model model=null;
		//use service
		msg=service.getWishMsg();
		//creating Model implemented class object
	     model=new ExtendedModelMap();
	     model.addAttribute("wishMsg", msg);
		//return Model
		return model;
	}*/
	
	/*@RequestMapping("/wish.htm")
	public ModelMap getWishMessage() {
		String msg=null;
		ModelMap model=null;
		//use service
		msg=service.getWishMsg();
		//creating Model implemented class object
	     model=new ModelMap();
	     model.addAttribute("wishMsg", msg);
		//return Model
		return model;
	}*/
	
	/*@RequestMapping("/wish.htm")
	public Map getWishMessage() {
		String msg=null;
		Map<String, Object> map=null;
		//use service
		msg=service.getWishMsg();
		//creating Model implemented class object
	     map=new LinkedHashMap<String, Object>();
	     map.put("wishMsg", msg);
		//return Model
		return map;
	}
	*/

}
