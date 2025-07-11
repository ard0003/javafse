package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {
        // Load Spring configuration from country.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        // Get the bean with ID 'in' from the XML
        Country country = (Country) context.getBean("in");

        // Return the bean (Spring Boot auto-converts to JSON)
        return country;
    }
}
