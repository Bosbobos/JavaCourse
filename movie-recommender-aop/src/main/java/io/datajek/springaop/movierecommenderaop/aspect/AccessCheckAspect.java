package io.datajek.springaop.movierecommenderaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AccessCheckAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //@Before("execution(* io.datajek.springaop.movierecommenderaop.business.*.*(..))")
    //@Before("execution(* io.datajek.springaop.movierecommenderaop..*.*(..))")
    //@Before("execution(String io.datajek.springaop.movierecommenderaop..*.*(..))")
    //@Before("execution(String io.datajek.springaop.movierecommenderaop..*.*Filtering(..))")
    //@Before("execution(* io.datajek.springaop.movierecommenderaop..*.*(String,..))")
    //@Before("execution(* io.datajek.springaop.movierecommenderaop..*.*Filtering(..)) || " +
    //        "execution(String io.datajek.springaop.movierecommenderaop..*.*(..))")
    @Before("io.datajek.springaop.movierecommenderaop.aspect.JoinPointConfig.businessLayerPointcut()")
    public void userAccess(JoinPoint joinPoint) {
        logger.info("Intercepted call before execution: {}", joinPoint);
    }
}
