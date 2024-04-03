package service;

import java.math.BigDecimal;
import java.math.MathContext;

public class CalkService {
	public BigDecimal summa(BigDecimal number1, BigDecimal number2, MathContext context) {
		return number1.add(number2, context);
	}

	public BigDecimal summa(BigDecimal number1, BigDecimal number2) {
		return summa(number1, number2, new MathContext(16));
	}

	public BigDecimal subtraction(BigDecimal number1, BigDecimal number2, MathContext context) {
		return number1.subtract(number2, context);
	}

	public BigDecimal subtraction(BigDecimal number1, BigDecimal number2) {
		return subtraction(number1, number2, new MathContext(16));
	}

	public BigDecimal multiply(BigDecimal number1, BigDecimal number2, MathContext context) {
		return number1.multiply(number2, context);
	}

	public BigDecimal multiply(BigDecimal number1, BigDecimal number2) {
		return multiply(number1, number2, new MathContext(16));
	}

	public BigDecimal divide(BigDecimal number1, BigDecimal number2, MathContext context) {
		return number1.divide(number2, context);
	}

	public BigDecimal divide(BigDecimal number1, BigDecimal number2) {
		return divide(number1, number2, new MathContext(16));
	}

}
