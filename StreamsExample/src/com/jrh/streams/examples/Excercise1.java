package com.jrh.streams.examples;

import com.jrh.streams.*;

public class Excercise1 {

	public static void main(String[] arg) {

		// print all numbers
		// opt1
		StreamSources.intNumberStream().forEach(i -> System.out.println(i));
		System.out.println("-------------");
		// opt2
		StreamSources.intNumberStream().forEach(System.out::println);
		System.out.println("=========");
		// print all numbers < 5
		StreamSources.intNumberStream().filter(i -> i < 5).forEach(System.out::println);

		System.out.println("=========");
		// print all numbers > 5 , skip 1
		StreamSources.intNumberStream().filter(i -> i > 5).skip(1).limit(2).forEach(System.out::println);

		System.out.println("=========");
		// print all numbers > 5 , skip 1
		Integer val = StreamSources.intNumberStream()
			.filter(i -> i > 5)
			.findFirst()
			.orElse(-1);
		System.out.println(val);
		
		
		System.out.println("=========");
		
		StreamSources.userStream().forEach(user -> System.out.println(user.getFirstName()));
		System.out.println("-------------");
		StreamSources.userStream().map(user -> user.getFirstName()).forEach(System.out::println);
		
		System.out.println("=========");
		
		StreamSources.intNumberStream()
			.flatMap(id -> StreamSources.userStream().filter(user -> user.getNum() == id))
			.map(user -> user.getFirstName())
			.forEach(System.out::println);
		
		System.out.println("-------------");
		
		StreamSources.userStream()
			.filter(user -> StreamSources.intNumberStream()
					.anyMatch(id -> user.getNum() == id))
					.forEach(user -> System.out.println(user.getFirstName()));
			
	}

}
