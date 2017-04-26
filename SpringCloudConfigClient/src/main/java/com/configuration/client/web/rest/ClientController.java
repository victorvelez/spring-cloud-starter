package com.configuration.client.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ClientController {

	@Value("${properties.message: value default}")
	private String message;

	@RequestMapping("/")
	public String index() {
		return message;
	}

}
