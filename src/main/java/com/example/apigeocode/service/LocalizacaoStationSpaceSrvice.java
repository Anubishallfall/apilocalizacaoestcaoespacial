package com.example.apigeocode.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocalizacaoStationSpaceSrvice {

	public Object ObterLocalizacao() {
		String uri = "http://api.open-notify.org/iss-now.json";
		RestTemplate restTemplate = new RestTemplate();
		Object result = restTemplate.getForObject(uri, Object.class);
		return result;
	
	}
	
	
}
