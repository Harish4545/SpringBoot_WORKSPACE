package in.nareshit.raghu.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.nareshit.raghu.collection.Employee;

public interface EmployeeRepository 
	extends MongoRepository<Employee, String> {

}
