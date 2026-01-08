package com.prachipatil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.prachipatil.entity.Book;
import com.prachipatil.entity.Employee;
import com.prachipatil.repository.BookRepository;
import com.prachipatil.repository.EmployeeRepository;
import com.sun.net.httpserver.Filter;

@SpringBootApplication
public class Sbms2DatajpaApplication implements CommandLineRunner
{

	public static void main(String[] args) 
	{
	ConfigurableApplicationContext context=	
			SpringApplication.run(Sbms2DatajpaApplication.class, args);
		
	BookRepository bean = context.getBean(BookRepository.class);
	   System.out.println(  bean.getClass(). getName());    
	}
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	// proxy class of interface will be maade intenlly by spring
	
	
	
	
	@Override
	public void run(String... args) throws Exception
	{
		System.out.println("Run Method called");// called automatically when spring Ap strts
		
		//employeeRepository.findByName("Ram").forEach(i-> System.out.println(i));
		
		//employeeRepository.findByDept("IT").forEach(i-> System.out.println(i));
		
		// employeeRepository.findByNameOrDept("Prchi","IT").forEach(i-> System.out.println(i));
		
		// employeeRepository.findByNameAndDept("Ram","ML").forEach(i-> System.out.println(i));
		
		// employeeRepository.findBySalaryGreaterThan(67000).forEach(i-> System.out.println(i));
		
		 //employeeRepository.findByNameStartingWith("s").forEach(i-> System.out.println(i));
		
		//employeeRepository.findByNameEndingWith("m").forEach(i-> System.out.println(i));
		
		// employeeRepository.findByNameContains("a").forEach(i-> System.out.println(i));
		
		    // employeeRepository.findBydept("IT").forEach(i-> System.out.println(i));
		
		//employeeRepository.findBycity("Pune").forEach(i-> System.out.println(i));

		 // employeeRepository.findByCityAndDeptAndGender("Sangli","IT","Female").forEach(i-> System.out.println(i));
		
		
		
		
		
		
		
		
		
		
		
		
//		Sort sort = Sort.by("salary").ascending();
//		employeeRepository.findAll(sort).forEach(i-> System.out.println(i));


//		Employee emp = new Employee();
//		emp.setDept("IT");
//		emp.setCity("Pune");.
//
//		Example<Employee> of = Example.of(emp);
//		employeeRepository.findAll(of).forEach(i ->System.out.println(i));

		
		
//	     PageRequest of = PageRequest.of(0, 2); // paggeno, pagesize
//	     Page<Employee> page = employeeRepository.findAll(of);
//	     List<Employee> content = page.getContent();		
//		 content.forEach(i->System.out.println(i)    );
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Employee employee1 = new Employee();
//		employee1.setName("Prachi");
//		employee1.setDept("IT");
//		employee1.setSalary(85000);
//		employee1.setCity("Sangli");
//		employee1.setGender("female");
//		
//		Employee employee2 = new Employee();
//		employee2.setName("Disha");
//		employee2.setDept("CSIT");
//		employee2.setSalary(55000);
//		employee2.setCity("Pune");
//		employee2.setGender("female");
//		
//		Employee employee3 = new Employee();
//		employee3.setName("Shyam");
//		employee3.setDept("AI");
//		employee3.setSalary(90000);
//		employee3.setCity("Mumbai");
//		employee3.setGender("female");
//		
//		Employee employee4 = new Employee();
//		employee4.setName("Ram");
//		employee4.setDept("ML");
//		employee4.setSalary(67000);
//		employee4.setCity("Satara");
//		employee4.setGender("male");
//		
//		
//		Employee employee5 = new Employee();
//		employee5.setName("Siya");
//		employee5.setDept("IT");
//		employee5.setSalary(85000);
//		employee5.setCity("Sangli");
//		employee5.setGender("female");
//		
//		employeeRepository.saveAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5) );
//		
		
//		Optional<Book> byId = bookRepository.findById(1);
//		
//		if(byId.isPresent())
//		{
//			Book book = byId.get();
//			System.err.println(book);
//		}
//		else
//		{
//			System.out.println("cannot find !!!");
//		}
		
		
//		 bookRepository.findAllById(Arrays.asList(1,2,3)).forEach( System.out::println   );
		
		
		//boolean existsById = bookRepository.existsById(2);
		
		
		//bookRepository.deleteAllById(Arrays.asList(3,4));
		
//		 long count = bookRepository.count();
//		 System.out.println(count);
		
		//System.out.println(  "existsById   " + existsById  );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Book book = new Book();
//		book.setBookName("HOrizon");
//		//book.setBookId(1);
//		book.setBookPrice(800.89);
//		book.setBookAuthor("prachi");
//		book.setBookQuantity(8);
//		
//		Book book1 = new Book();
//		book1.setBookName("kaveri");
//		//book.setBookId(1);
//		book1.setBookPrice(400.89);
//		book1.setBookAuthor("Adiii");
//		book1.setBookQuantity(80);
//		
//		Book book2 = new Book();
//		book2.setBookName("historyi");
//		//book.setBookId(1);
//		book2.setBookPrice(670.89);
//		book2.setBookAuthor("John");
//		book2.setBookQuantity(20);
//		
//		Book book3 = new Book();
//		book3.setBookName("Sindhu");
//		//book.setBookId(1);
//		book3.setBookPrice(600.89);
//		book3.setBookAuthor( "Asmita");
//		book3.setBookQuantity(58);
//		
//		Book book4 = new Book();
//		book.setBookName("Ram");
//		//book.setBookId(1);
//		book4.setBookPrice(100.89);
//		book4.setBookAuthor("Adiia");
//		book4.setBookQuantity(28);
//		
//		Book book5 = new Book();
//		book.setBookName("Ganga");
//		//book.setBookId(1);
//		book5.setBookPrice(50.89);
//		book5.setBookAuthor("sanchi");
//		book5.setBookQuantity(85);
		
//		bookRepository.saveAll(Arrays.asList(book1,book2,book3,book4,book5));
		
		
		
	}

}
