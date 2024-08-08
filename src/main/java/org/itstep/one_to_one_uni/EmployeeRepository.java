package org.itstep.one_to_one_uni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //Выборка по возрасту
    List<Employee> findByAgeLessThan(Integer age);
    List<Employee> findByAgeLessThanEqual(Integer age);
    List<Employee> findByAgeGreaterThan(Integer age);
    List<Employee> findByAgeGreaterThanEqual(Integer age);
    List<Employee> findByAgeBetween(Integer startAge, Integer endAge);
    List<Employee> findByAgeIn(Collection<Integer> ages);
    List<Employee>findByCity(String city);
    List<Employee>findByCity2(String city);

    //Custom query
    @Query(value = "select e from Employee e inner join Address a on e.address.id=a.id where a.city=:city")
            public List<Employee> findByCity3(@Param("city") String city);

    //Native query
    @Query(value = "SELECT * FROM Employee e inner join Address a on e.address_id= a.id where a.city =:city", nativeQuery = true)
            public List<Employee> findByCity4(@Param("city") String city);
}
