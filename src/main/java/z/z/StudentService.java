package z.z;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;

public interface StudentService {
	
	void save(Student student);
	void modify(Student student);
	void deleteById(int id);
	Student selectById(int id);
	List<Student>SelectAllStudent();
	Optional<Student> getAllPaginatedSorted(int pageNo,int sizeSize ,String field);

	Iterable<Student> findAll();
	Optional<Student> findById(int id);
	Optional<Student> findById(PageRequest p);

}
