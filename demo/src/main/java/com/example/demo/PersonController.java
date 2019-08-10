package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.dto.Name;
@Controller
@SpringBootApplication
public class PersonController {
	@GetMapping("/smitha/V1")
	   @ResponseBody
	   Name homeV1() {
		  return new Name("Rimmy","Wasan");
	   }
	@GetMapping("/smitha/V2")
	   @ResponseBody
	   String homeV2() {
		  return new String("Rimmy Wasan");
	   }
	   public static void main(String[] args) {
	      SpringApplication.run(DemoApplication.class, args);
	   }
}
