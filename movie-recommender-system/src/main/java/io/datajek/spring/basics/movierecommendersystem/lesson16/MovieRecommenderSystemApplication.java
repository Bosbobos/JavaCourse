package io.datajek.spring.basics.movierecommendersystem.lesson16;

import io.datajek.spring.basics.movierecommendersystem.lesson14.RecommenderImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext appContext =
				new ClassPathXmlApplicationContext("appContext.xml");

		//check the beans which have been loaded
		System.out.println("\nBeans loaded:");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

		//retrieve bean from the application context
		io.datajek.spring.basics.movierecommendersystem.lesson14.RecommenderImplementation recommender =
				appContext.getBean("recommenderImpl", RecommenderImplementation.class);

		//print dependency
		System.out.println("\nDependency: " + recommender.getFilter());
		System.out.println();

		appContext.close();
	}
}
