package com.guluev.superkassatask;

import com.guluev.superkassatask.model.Request;
import com.guluev.superkassatask.model.UserCurrentNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SuperKassaTaskApplicationTests {
	@LocalServerPort
	private String servicePort;

	private String url;
	@Autowired
	private TestRestTemplate testRestTemplate;


	@Test
	void modify() {
		url = String.format("http://localhost:%s/modify", servicePort);

		var requestBody = new HttpEntity<>(Request.builder().id(1).add(21).build());

		Assertions.assertEquals(200, testRestTemplate.postForEntity(url, requestBody, UserCurrentNumber.class).getStatusCode().value());

	}

	@Test
	void exception() {
		url = String.format("http://localhost:%s/modify", servicePort);


		var requestBody = new HttpEntity<>(Request.builder().id(3).add(21).build());

		Assertions.assertEquals(418, testRestTemplate.postForEntity(url, requestBody, String.class).getStatusCode().value());
	}

}

