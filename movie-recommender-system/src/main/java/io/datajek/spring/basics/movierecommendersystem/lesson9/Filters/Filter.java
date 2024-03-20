package io.datajek.spring.basics.movierecommendersystem.lesson9.Filters;

public interface Filter {
    public String[] getRecommendations(String movie);
}
