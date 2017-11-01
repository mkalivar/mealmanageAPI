package com.mealManage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.mealManage.model.SchoolClasses;
import com.mealManage.model.Teachers;

@Configuration
public class SpringDataRestConfig {
	@Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {

        return new RepositoryRestConfigurerAdapter() {
            @Override
            public void configureRepositoryRestConfiguration(
                                 RepositoryRestConfiguration config) {
                config.exposeIdsFor(Teachers.class, SchoolClasses.class);
            }
        };
	}
}