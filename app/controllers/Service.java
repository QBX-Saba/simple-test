package controllers;

public class Service {

	public Number min(Numbers numbers) {
		Number result = new Number();
		if (numbers != null && numbers.getNumbers() != null
				&& numbers.getNumbers().size() > 0) {
			Double min = numbers.getNumbers().get(0);
			for (Double num : numbers.getNumbers()) {
				if (num < min) {
					min = num;
				}
			}
			result.setNumber(min);
		}

		return result;
	}

	public Number max(Numbers numbers) {
		Number result = new Number();
		if (numbers != null && numbers.getNumbers() != null
				&& numbers.getNumbers().size() > 0) {
			Double max = numbers.getNumbers().get(0);
			for (Double num : numbers.getNumbers()) {
				if (num > max) {
					max = num;
				}
			}
			result.setNumber(max);
		}

		return result;
	}

	public Number ceil(Number number) {
		Number result = new Number();
		if (number != null) {
			result.setNumber(Math.ceil(number.getNumber()));
		}
		return result;
	}
	
	public Number round(Number number) {
		Number result = new Number();
		if (number != null) {
			result.setNumber((double) Math.round(number.getNumber()));
		}
		return result;
	}

}
