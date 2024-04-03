package model;

import java.math.BigDecimal;

public class BigDecimalAndLen {
	private int len;
	private BigDecimal bigDecimal;

	public BigDecimalAndLen(int len, BigDecimal bigDecimal) {
		this.len = len;
		this.bigDecimal = bigDecimal;
	}

	public int getLen() {
		return len;
	}

	public BigDecimal getBigDecimal() {
		return bigDecimal;
	}
}
