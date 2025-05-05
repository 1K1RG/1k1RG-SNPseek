package org.irri.iric.portal.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class DBConnectionPropertyConfig {

	@Value("${user}")
	private String dbuser;

	@Value("${DB_PASSWORD}")
	private String dbpassword;

	@Value("${DB_URL}")
	private String dburl;

	@PostConstruct
    public void init() {
        System.out.println("Property value from db.properties: " + dbuser);
        System.out.println("Property value from db.properties: " + dbpassword);
        System.out.println("Property value from db.properties: " + dburl);
    }
	
}
