package com.example.demo;

import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication extends RouteBuilder{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void configure() throws Exception {

		from("mqtt:d3d?host=tcp://192.168.1.69:1883&subscribeTopicName=/smr/gg")
		.transform(body().convertToString())	
		.unmarshal(new JacksonDataFormat(Map.class))
		.to("ggdb:testcamel?statementType=Insert");
		;
	}

}
