package org.itstep;

import org.itstep.many_to_many_uni.AuthorRepository;
import org.itstep.many_to_many_uni.BookRepository;
import org.itstep.one_to_many_uni.PhoneRepository;
import org.itstep.one_to_many_uni.SubscriberRepository;
import org.itstep.one_to_one_bi.PassportRepository;
import org.itstep.one_to_one_bi.PersonRepository;
import org.itstep.one_to_one_uni.AddressRepository;
import org.itstep.one_to_one_uni.EmployeeRepository;
import org.itstep.one_to_one_uni.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    PassportRepository passportRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    EmployeeService employeeService;

    @Autowired
    AddressRepository addressRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    SubscriberRepository subscriberRepository;
    @Autowired
    PhoneRepository phoneRepository;
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
     /*  //One-to-one unidirection
        employeeService.getEmployees().forEach(System.out::println);

        employeeService.deleteEmployeeById(1L);
        employeeService.getAddresses().forEach(System.out::println);
        addressRepository.findByCityAndStreet("Minsk", "Pobediteley st.").forEach(System.out::println);
        employeeRepository.findByCity3("Vitebsk").forEach(System.out::println);
*/
/*
        personRepository.findAll().forEach(System.out::println);
    */
        //subscriberRepository.findAll().forEach(System.out::println);
        bookRepository.findAll().forEach(System.out::println);
    }
}
