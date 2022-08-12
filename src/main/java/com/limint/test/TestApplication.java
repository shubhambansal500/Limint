package com.limint.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import parsecsv.ParserFactory;

import java.io.FileNotFoundException;

@SpringBootApplication
public class TestApplication{

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(TestApplication.class, args);
		ParserFactory factory = new ParserFactory();
		String pwd = System.getProperty("user.dir");
		if(args[0].contains(".csv")){
			factory.getParser("CSV").parse(pwd+"\\"+args[0]);
		}
		if(args[1].contains(".json")){
			factory.getParser("JSON").parse(pwd+"\\"+args[1]);
		}else{
			throw new FileNotFoundException();
		}
	}
}
