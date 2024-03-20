package io.datajek.spring.basics.movierecommendersystem.lesson12;

import io.datajek.spring.basics.movierecommendersystem.lesson7.Filter;
import javax.inject.Named;

@Named
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] { };
    }
}
