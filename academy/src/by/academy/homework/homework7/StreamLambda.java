package by.academy.homework.homework7;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class StreamLambda {

	public static void main(String[] args) {

		final double Pi = 3.1415926536;

		List<Long> list = new Random().longs(100, 1, 100).map(x -> (long) (x * Pi - 20)).filter(x -> x < 100).sorted()
				.skip(3).distinct().boxed().peek(x -> System.out.println(x)).collect(Collectors.toList());

		Map<Long, String> map = list.stream().collect(Collectors.toMap(x -> x, x -> "Number: " + x));

		System.out.println(map);
	}

}
