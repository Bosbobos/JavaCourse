package io.datajek.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServletInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { PlayerConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // TODO[NotImpl]
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/springmvc/*" };
    }

}
