package com.uzeasy.hava_a_try;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class HavaATryApplicationTests {

	@Test
	void contextLoads() {
	}

}
