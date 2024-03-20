package io.datajek.spring.basics.movierecommendersystem.lesson12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import javax.inject.Named;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Named
public class RecommenderImplementation {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Filter filter;
    @Inject
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    public Filter getFilter() {
        return this.filter;
    }

    @PostConstruct
    public void postConstruct() {
        //initialization code goes here
        logger.info("In RecommenderImplementation postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }
}
