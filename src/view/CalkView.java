package view;

import java.math.BigDecimal;
import java.util.Scanner;

import model.BigDecimalAndLen;

public class CalkView {
	Scanner scanner = new Scanner(System.in);

	public String start() {
		System.out.println(
				"\t\tМеню\t\t\n\n\n\r1 Сложение\t\t2 Вычитание\n\r3 Умножение\t\t4 Деление\n\r5 Выход\n\r\t\tВведите число\t\t\n\r");
		String res = scanner.next();
		return res;
	}

	public void selection(String s) {
		System.out.printf("Вы выбрали %s. Просим вас ввести значения по одному\n\r", s);
	}

	public BigDecimalAndLen enterNumber() {
		System.out.println("Введите число\n\r");
		String s = scanner.next();
		BigDecimal num = new BigDecimal(s);
		return new BigDecimalAndLen(s.length(), num);
	}

	public void response(BigDecimal bigDecimal) {
		System.out.println("\nОтвет: " + bigDecimal + "\n");
	}

	public void end() {
		scanner.close();
	}
}
