package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    private Filter filter;

    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }
    public String[] recommendMovies (String movie) {
        System.out.println("Name of the filter in use: " + filter);
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
