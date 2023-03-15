package com.example.demo.inner;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties("demo1")
public class InnerDemoConfigurationProperties {

	private String first;

	private Inner inner;
	
	private String news;

	@Data
	public static class Inner {

		private String second;
	}
}
