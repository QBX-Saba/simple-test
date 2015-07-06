package controllers;

import play.twirl.api.Content;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Number implements Content {
	Double number;
	
	

	public Double getNumber() {
		return number;
	}

	public void setNumber(Double number) {
		this.number = number;
	}

	@Override
	public String body() {
		String json = "{}";
		try {
			json = (new ObjectMapper().writeValueAsString(this));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}

	@Override
	public String contentType() {

		return "application/json";
	}

}
