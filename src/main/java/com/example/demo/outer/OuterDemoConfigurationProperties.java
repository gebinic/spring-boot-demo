package com.example.demo.outer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import lombok.Data;

@Data
@ConfigurationProperties("demo2")
public class OuterDemoConfigurationProperties {

	private String first;

	@NestedConfigurationProperty
	private MyOuterClass outer;
}
