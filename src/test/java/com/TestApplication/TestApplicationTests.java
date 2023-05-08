package com.TestApplication;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.TestApplication.TestApplication;

@SpringBootTest
class TestApplicationTests {
	
	public static final Logger logger= LoggerFactory.getLogger(TestApplication.class);


	@Test
	void contextLoads() {
		logger.info("testing for jenkins");
		assertEquals(true, true);
	
	}

}
