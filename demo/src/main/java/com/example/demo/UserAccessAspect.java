package com.example.demo;

import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Aspect
@Configuration
public class UserAccessAspect {
	private Logger logger = LogManager.getLogger(this.getClass());
    //What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..))
    //Weaving & Weaver
	@Before("execution(* com.example.demo.*.*(..))")
    public void before(JoinPoint joinPoint) {
        //Advice
        logger.info(" Check for user access ");
        logger.info(" Allowed execution for {}", joinPoint);
    }
}
