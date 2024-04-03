package controller;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

import model.BigDecimalAndLen;
import service.CalkService;
import view.CalkView;

public class CalkController {
	private final CalkService calkService = new CalkService();
	private final CalkView calkView = new CalkView();
	Scanner scanner = new Scanner(System.in);

	public void start() {
		while (true) {
			String res = calkView.start();
			switch (res) {
				case "1":
					calkView.response(getResponse("сумму", calkService::summa));
					break;
				case "2":
					calkView.response(getResponse("вычитание", calkService::subtraction));
					break;
				case "3":
					calkView.response(getResponse("умножение", calkService::multiply));
					break;
				case "4":
					calkView.response(getResponse("деление", calkService::divide));
					break;
				case "5":
					calkView.end();
					return;
				default:
					System.out.println("Вы ввели не корректное значение");
					break;
			}
		}
	}

	private BigDecimal getResponse(String s, TriFunction<BigDecimal, BigDecimal, MathContext, BigDecimal> function) {
		calkView.selection(s);
		BigDecimalAndLen bigDecimalAndLen1 = calkView.enterNumber();
		BigDecimalAndLen bigDecimalAndLen2 = calkView.enterNumber();
		return function.apply(bigDecimalAndLen1.getBigDecimal(), bigDecimalAndLen2.getBigDecimal(),
				bigDecimalAndLen1.getLen() > bigDecimalAndLen2.getLen() ? new MathContext(bigDecimalAndLen1.getLen())
						: new MathContext(bigDecimalAndLen2.getLen()));
	}

}
