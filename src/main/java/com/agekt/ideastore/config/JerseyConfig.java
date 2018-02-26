package com.agekt.ideastore.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.agekt.ideastore.endpoint.ArticleEndpoint;

@Component
@ApplicationPath("/spring-app")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(ArticleEndpoint.class);
	}
}
