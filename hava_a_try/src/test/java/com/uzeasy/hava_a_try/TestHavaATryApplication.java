package com.uzeasy.hava_a_try;

import org.springframework.boot.SpringApplication;

public class TestHavaATryApplication {

	public static void main(String[] args) {
		SpringApplication.from(HavaATryApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
