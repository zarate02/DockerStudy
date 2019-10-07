package com.example.demo;

import org.apache.camel.component.mybatis.MyBatisComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultiMybatis {
	@Bean
	public MyBatisComponent dgdb() {
		MyBatisComponent t = new MyBatisComponent();
		t.setConfigurationUri("file://D:/SqlMapConfig1.xml");
		return t;
	}
	

	@Bean
	public MyBatisComponent ggdb() {
		MyBatisComponent t = new MyBatisComponent();
		t.setConfigurationUri("file://D:/SqlMapConfig2.xml");
		return t;
	}

}
