package io.datajek.spring.basics.movierecommendersystem.lesson14;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

public class RecommenderImplementation {
    private Filter filter;
    public Filter getFilter() {
        return filter;
    }
    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    /* public void setFilter(Filter filter)
    {
        this.filter = filter;
    }
    */
    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}