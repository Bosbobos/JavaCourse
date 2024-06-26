package io.datajek.springaop.movierecommenderaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class JoinPointConfig {
    @Pointcut("execution(* io.datajek.springaop.movierecommenderaop.data.*.*(..))")
    public void dataLayerPointcut() {}

    @Pointcut("execution(* io.datajek.springaop.movierecommenderaop.business.*.*(..))")
    public void businessLayerPointcut() {}

    @Pointcut("io.datajek.springaop.movierecommenderaop.aspect.JoinPointConfig.dataLayerPointcut() || "
            + "io.datajek.springaop.movierecommenderaop.aspect.JoinPointConfig.businessLayerPointcut()")
    public void allLayersPointcut() {}

    @Pointcut("bean(movie*)")
    public void movieBeanPointcut() {}

    @Pointcut("@annotation(io.datajek.springaop.movierecommenderaop.aspect.MeasureTime)")
    public void measureTimeAnnotation() {}
}
