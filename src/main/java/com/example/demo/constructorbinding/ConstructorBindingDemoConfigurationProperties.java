package com.example.demo.constructorbinding;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Value;

@Value
@ConfigurationProperties("demo3")
public class ConstructorBindingDemoConfigurationProperties {

	private String first;

	private Inner inner;

	@Value
	public static class Inner {

		private String second;
	}
}
