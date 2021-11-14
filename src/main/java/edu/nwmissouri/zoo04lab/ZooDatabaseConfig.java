package edu.nwmissouri.zoo04lab;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Denise Case
 */
@Configuration
public class ZooDatabaseConfig {

    @Bean
    public BasicDataSource dataSource() throws URISyntaxException {
        // read and display system environment variable
        String jdkLocalSystem = System.getenv("JAVA_HOME");
        System.out.println("JDK_HOME: " + jdkLocalSystem);
        
        // read and use a system environment variable for the datasource
        String dbURL = System.getenv("DATABASE_URL");
        System.out.println("DATABASE_URL: " + dbURL);
        
        // split URL by colons into String[]
        String[] arr = dbURL.split(":");
        System.out.println("Num parts: " + arr.length);

        String username = arr[1].replaceAll("//","");
        System.out.println("DB_USERNAME: " + username);
        
        String address = arr[2];
        System.out.println("DB_ADDRESS: " + address);
        
        String password = address.split("@")[0];
        System.out.println("DB_PASSWORD: " + password);
        
        URI dbUri = new URI(dbURL);
        System.out.println("DB_URI: " + dbUri);
        
        String host = dbUri.getHost();
        System.out.println("DB_HOST: " + host);

        int port = dbUri.getPort();
        System.out.println("DB_PORT: " + port);
        
        String dbPath = dbUri.getPath();
        System.out.println("DB_PATH: " + dbPath);
        
        String dbUrl = "jdbc:postgresql://" + host + ':' + port + dbUri.getPath() + "?sslmode=require";
        System.out.println("VERIFY_JDBC_CONNECTION_URI: " + dbUri);

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dbUrl);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        return basicDataSource;
    }
}
