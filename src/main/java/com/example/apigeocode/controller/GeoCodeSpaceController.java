package com.example.apigeocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apigeocode.service.LocalizacaoStationSpaceSrvice;

@RestController
@RequestMapping("/geocodespace")
public class GeoCodeSpaceController {
	@Autowired
	LocalizacaoStationSpaceSrvice localizacaoStationSpaceService;
	
	@GetMapping("")
	public Object index() throws Exception {
		try{
		Object dataSpace =localizacaoStationSpaceService.ObterLocalizacao();
		return dataSpace;
		}catch(NullPointerException e){
			throw new  Exception("Não há contato com o sistema de busca!");
		}
	}

		
}
