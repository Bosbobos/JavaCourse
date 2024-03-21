package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommender = appContext.getBean(
				RecommenderImplementation.class);

		String favoriteMovie = recommender.getFavoriteMovie();
		System.out.println(favoriteMovie);

		String[] result = recommender.recommendMovies(favoriteMovie);

		System.out.println(Arrays.toString(result));
	}
}
