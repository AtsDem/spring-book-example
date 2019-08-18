package com.sda.tutorial.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Book book = context.getBean("book", Book.class);
		Libary libary = context.getBean("libary", Libary.class);

		libary.setAdress("Tallinn");
		libary.setName("Test");

		book.setId(1);
		book.setName("Foundation");
		book.setPublishYear(1950);
		List<Book> books = new ArrayList<>();
		books.add(book);
		libary.setBookList(books);

		System.out.println(libary.toString());
		//Coach theCoach2 = context.getBean("myCoach", Coach.class);

		//Coach mybaseballCoach = context.getBean("myBaseballCoach", Coach.class);
		// call methods on the bean
		//System.out.println("Are equal?:" + (theCoach==theCoach2));
		//System.out.println(theCoach.getDailyWorkout());
		//System.out.println(mybaseballCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}
