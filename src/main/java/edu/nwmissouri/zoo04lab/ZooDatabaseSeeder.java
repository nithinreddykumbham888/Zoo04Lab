package edu.nwmissouri.zoo04lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.*;

/**
 *
 * @author Denise Case
 */
@Component
public class ZooDatabaseSeeder {

    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ZooDatabaseSeeder.class.getPackage().getName());
    }

    @PostConstruct
    public void myRealMainMethod() throws SQLException {
        Statement stmt = dataSource.getConnection().createStatement();
        stmt.executeUpdate("CREATE SCHEMA IF NOT EXISTS userSchema");
        stmt.executeUpdate("DROP TABLE IF EXISTS userSchema.user");
        stmt.executeUpdate("""
                           CREATE TABLE userSchema.user ( 
                              userid integer not null,
                              email varchar(255) not null,
                              username varchar(255) not null,
                              primary key(userid))""");
        stmt.executeUpdate("INSERT INTO userSchema.user VALUES (10001,'dcase@nwmissouri.edu', 'Denise Case')");
        ResultSet rs = stmt.executeQuery("SELECT * FROM userSchema.user");
        while (rs.next()) {
            Integer id = rs.getInt("userid");
            String email = rs.getString("email");
            String name = rs.getString("username");
            String recordInfo = String.format("Read from DB (id, email, name): %d, %s, %s" ,id, email, name);
            System.out.println(recordInfo);
        }

    }
}
