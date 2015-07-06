package controllers;

import java.io.IOException;

import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Application extends Controller {

	ObjectMapper jsonUtil = new ObjectMapper();
	Service service = new Service();

	public Result min() {
		String numbersStr = request().body().asJson().toString();
		Numbers numbers = null;
		Number number = null;
		try {
			numbers = jsonUtil.readValue(numbersStr, Numbers.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		number = service.min(numbers);
		return ok(number);
	}

	public Result max() {
		String numbersStr = request().body().asJson().toString();
		Numbers numbers = null;
		Number number = null;
		try {
			numbers = jsonUtil.readValue(numbersStr, Numbers.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		number = service.max(numbers);
		return ok(number);
	}

	public Result ceil() {
		String numbersStr = request().body().asJson().toString();

		Number number = null;
		try {
			number = jsonUtil.readValue(numbersStr, Number.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		number = service.ceil(number);
		return ok(number);
	}

	public Result round() {
		String numbersStr = request().body().asJson().toString();

		Number number = null;
		try {
			number = jsonUtil.readValue(numbersStr, Number.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		number = service.round(number);
		return ok(number);
	}
	
	
}
