package hei.tp03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Properties;

/**
 * Created by N0stress on 17/01/2017.
 */

@Configuration
@ComponentScan(basePackages = "hei.tp03.service")
public class AppConfig {

    @Bean
    public Properties dbProperties(){
      Properties proprietes = new Properties();
        proprietes.setProperty("driverClass","com.mysql.jdbc.Driver");
        proprietes.setProperty("jdbcUrl","jdbc:mysql://localhost:3306/hei_tp03");
        proprietes.setProperty("username","root");
        proprietes.setProperty("password","");

        return proprietes;
    }
}
