package com.techelevator.services;

import org.springframework.stereotype.Component;

import com.techelevator.model.CatFact;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCatFactService implements CatFactService {


	private static String API_BASE_URL = "https://cat-data.netlify.app/api/facts/random";
	private RestTemplate restTemplate= new RestTemplate();
	@Override
	public CatFact getFact() {
		// TODO Auto-generated method stub
		return restTemplate.getForObject(API_BASE_URL, CatFact.class);
	}

}
