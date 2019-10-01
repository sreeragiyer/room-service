package com.example.roomServices.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.roomServices.model.roomServiceModel;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class RoomServiceController {

	@GetMapping("addroomService")
    public String sendForm(roomServiceModel user) {

        return "addroomService";
    }

    @PostMapping("/addroomService")
    public ModelAndView processForm(@RequestParam(value = "roomService", required = false) String [] checkboxValue) {
    	int i=0;
    	String[] params = new String[checkboxValue.length]; 
    	while(checkboxValue!=null) {
    		if(i==2) break;
    		System.out.println(checkboxValue[i].toString());
    		params[i]=checkboxValue[i].toString();
    		i++;
    	}
    	roomServiceModel rsm=new roomServiceModel(30, params);
    	ModelAndView model=new ModelAndView("showMessage");
    	model.addObject("demo","hello world");
    	model.addObject("rsm",rsm);
    	//totalcost calculation and return in a web page
        //return "showMessage";
    	return model;
    }
}
