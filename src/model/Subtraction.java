package model;

import java.util.function.Function;

public class Subtraction<T extends Number> extends Operation<T> {

	public Subtraction(Function<Double, T> converter) {
		super(converter);
	}

	@Override
	public T operation(T t1, T t2) {
		double result = t1.doubleValue() - t2.doubleValue();
		return convertResult(result);
	}
}
