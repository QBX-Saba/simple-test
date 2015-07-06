package controllers;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.twirl.api.Content;

public class Numbers implements Content {

	ArrayList<Double> numbers = new ArrayList<>();

	public ArrayList<Double> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Double> numbers) {
		this.numbers = numbers;
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
