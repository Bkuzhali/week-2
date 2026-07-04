package orm_learn;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import orm_learn.model.Country;
import orm_learn.service.CountryService;

import orm_learn.model.Employee;
import orm_learn.service.EmployeeService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;
    private static EmployeeService employeeService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);
        employeeService = context.getBean(EmployeeService.class);

        LOGGER.info("Inside Main");

        testGetAllCountries();
        testAddEmployee();
    }

    private static void testGetAllCountries() {

        LOGGER.info("Start");

        List<Country> countries = countryService.getAllCountries();

        LOGGER.info("Countries = {}", countries);

        LOGGER.info("End");
    }

    private static void testAddEmployee() {

    LOGGER.info("Start Add Employee");

    Employee employee = new Employee();
    employee.setId(3);
    employee.setName("David");

    employeeService.addEmployee(employee);

    LOGGER.info("Employee Added Successfully");

    LOGGER.info("End Add Employee");
}
}
