package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        LOGGER.info("Inside main");

        countryService = context.getBean(CountryService.class);

        testGetAllCountries();
        testAddCountry();
        testFindCountryByCode();
        testUpdateCountry();
        testSearchCountriesByPartialName();
        testDeleteCountry();
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start - testGetAllCountries");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End - testGetAllCountries");
    }

    private static void testAddCountry() {
        LOGGER.info("Start - testAddCountry");
        Country newCountry = new Country("ZZ", "Zetaland");
        countryService.addCountry(newCountry);
        LOGGER.debug("Added country: {}", newCountry);
        LOGGER.info("End - testAddCountry");
    }

    private static void testFindCountryByCode() {
        LOGGER.info("Start - testFindCountryByCode");
        Country country = countryService.findCountryByCode("ZZ");
        LOGGER.debug("Found country: {}", country);
        LOGGER.info("End - testFindCountryByCode");
    }

    private static void testUpdateCountry() {
        LOGGER.info("Start - testUpdateCountry");
        countryService.updateCountry("ZZ", "Zeta Republic");
        Country updatedCountry = countryService.findCountryByCode("ZZ");
        LOGGER.debug("Updated country: {}", updatedCountry);
        LOGGER.info("End - testUpdateCountry");
    }

    private static void testSearchCountriesByPartialName() {
        LOGGER.info("Start - testSearchCountriesByPartialName");
        List<Country> matchingCountries = countryService.findCountriesByPartialName("Uni");
        LOGGER.debug("Matching countries: {}", matchingCountries);
        LOGGER.info("End - testSearchCountriesByPartialName");
    }

    private static void testDeleteCountry() {
        LOGGER.info("Start - testDeleteCountry");
        countryService.deleteCountry("ZZ");
        Country deletedCountry = countryService.findCountryByCode("ZZ");
        LOGGER.debug("Country after deletion (should be null): {}", deletedCountry);
        LOGGER.info("End - testDeleteCountry");
    }
}
