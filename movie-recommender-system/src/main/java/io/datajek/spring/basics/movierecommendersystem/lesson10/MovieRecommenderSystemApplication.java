package io.datajek.spring.basics.movierecommendersystem.lesson10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
		basePackages = {"io.datajek.spring.basics.movierecommendersystem.lesson9.Filters",
				"io.datajek.spring.basics.movierecommendersystem.lesson10"}
)
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		System.out.println("ContentBasedFilter bean found = " + appContext.containsBean("contentBasedFilter"));
		System.out.println("CollaborativeFilter bean found = " + appContext.containsBean("collaborativeFilter"));
	}
}
