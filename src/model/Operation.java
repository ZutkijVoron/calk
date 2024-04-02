package model;

import java.util.function.Function;

public class Operation<T extends Number> {
	private final Function<Double, T> converter;

	public Operation(Function<Double, T> converter) {
		this.converter = converter;
	}

	public T operation(T t1, T t2) {
		return null;
	}

	protected T convertResult(double result) {
		return converter.apply(result);
	}
}
