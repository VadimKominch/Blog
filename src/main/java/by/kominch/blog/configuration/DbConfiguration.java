package by.kominch.blog.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DbConfiguration {

    @Bean
    @Profile("dev")
    @Primary
    public DriverManagerDataSource getDevDatabase() {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/blog_dev_base");
        datasource.setUsername("root");
        datasource.setPassword("root");
        return datasource;
    }

    @Bean
    @Profile("prod")
    public DataSource getProdDatabase() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.driverClassName("com.mysql.cj.jdbc.Driver");
        builder.url("jdbc:mysql://localhost:3306/blog_prod_base");
        builder.username("root");
        builder.password("root");
        return builder.build();
    }
}

