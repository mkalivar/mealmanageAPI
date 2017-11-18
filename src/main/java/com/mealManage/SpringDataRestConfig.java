package com.mealManage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.mealManage.model.ClassPupil;
import com.mealManage.model.ClassPupilView;
import com.mealManage.model.Holidays;
import com.mealManage.model.MealMaster;
import com.mealManage.model.MealSelect;
import com.mealManage.model.MealSelectView;
import com.mealManage.model.MealType;
import com.mealManage.model.School;
import com.mealManage.model.SchoolClasses;
import com.mealManage.model.SchoolDistricts;
import com.mealManage.model.TeacherClassMap;
import com.mealManage.model.Teachers;
import com.mealManage.model.Users;

@Configuration
public class SpringDataRestConfig {
	@Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {

        return new RepositoryRestConfigurerAdapter() {
            @Override
            public void configureRepositoryRestConfiguration(
                                 RepositoryRestConfiguration config) {
            		config.setDefaultPageSize(Integer.MAX_VALUE);
                config.exposeIdsFor(ClassPupil.class, ClassPupilView.class, 
                						Holidays.class, MealSelectView.class,
                						MealMaster.class, MealSelect.class,
                						MealType.class, School.class,
                						SchoolClasses.class,SchoolDistricts.class,
                						TeacherClassMap.class, Teachers.class,
                						Users.class
                						);
            }
        };
	}
}