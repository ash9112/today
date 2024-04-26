package z.z;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;

public interface TeacherService {
	
	void save(Teacher teacher);
	void modify(Teacher teacher);
	void deleteById(int id);
	Teacher  selectById(int id);
	List<Teacher>SelectAllTeacher();
	List<Teacher> getAllPaginatedSorted(int pageNo,int sizeSize ,String field);
	List<Teacher> findById(PageRequest p);
	Iterable<Teacher> findAll();
	Optional<Teacher> findById(int id);
	
}
