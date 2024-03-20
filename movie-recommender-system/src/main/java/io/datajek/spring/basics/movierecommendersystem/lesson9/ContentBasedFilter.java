package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Primary
public class ContentBasedFilter implements Filter {
    //for keeping track of instances created
    private static int instances = 0;

    private Movie movie;
    public ContentBasedFilter() {
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }
    @Lookup
    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
