package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.MedidasService;
import com.example.demo.util.MedidasJson;

@RestController()
@RequestMapping("/api")
public class MedidasController {

	@Autowired
	private MedidasService medidasService;
	
	@RequestMapping(value="registrarMedidas", method=RequestMethod.POST)
	public boolean registrarMedidas(@RequestBody MedidasJson medidasJson){
		return medidasService.registrarMedidas(medidasJson);
	}
	
	@RequestMapping(value="consultarMedidas", method=RequestMethod.GET)
	public MedidasJson consultarMedidas (){
		return medidasService.consultarMedidas();
	}
}
