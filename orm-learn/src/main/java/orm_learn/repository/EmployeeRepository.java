package orm_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import orm_learn.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}