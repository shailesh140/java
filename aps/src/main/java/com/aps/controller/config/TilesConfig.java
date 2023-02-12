package com.aps.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class TilesConfig {
	
	@Bean
	public UrlBasedViewResolver tilesResolver() {
		UrlBasedViewResolver resolver=new UrlBasedViewResolver();
		resolver.setViewClass(TilesView.class);
		return resolver;
	}
	
	@Bean
	public TilesConfigurer tilesConfiguration() {
		
		TilesConfigurer tileConfig=new TilesConfigurer();
		String[] defs = { "WEB-INF/tiles.xml" };

		tileConfig.setDefinitions(defs);

		return tileConfig;
		
	}

}
