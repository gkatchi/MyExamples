package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer{
	private static final Logger LOGGER = LogManager.getLogger(DemoApplication.class);
	   
	@RequestMapping("/Hai")
	   @ResponseBody
	   String home(@RequestParam String name) {
		LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
		  String s=null;
	      return s.toUpperCase()+name;
	   }

	   public static void main(String[] args) {
	      SpringApplication.run(DemoApplication.class, args);
	   }
}
