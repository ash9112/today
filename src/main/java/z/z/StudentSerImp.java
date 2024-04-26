package z.z;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.stereotype.Service;

@Service
public class StudentSerImp implements StudentService {
	
	@Autowired
	private StudentService s;

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		s.save(student);
	}

	@Override
	public void modify(Student student) {
		// TODO Auto-generated method stub
		s.save(student);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		s.deleteById(id);
	}

	@Override
	public Student selectById(int id) {
	  
		{Optional<Student> opt = s.findById(id);
		if (opt.isPresent()) {
			
			return opt.get();
		}
		
		
		}
		return null;
	}

	@Override
	public List<Student> SelectAllStudent() {
		Iterable<Student> itr = s.findAll();
		List<Student> lst = new ArrayList<Student>();
		 itr.forEach(ele -> lst.add(ele));
		
		return lst;
	}

	@Override
	public Optional<Student> getAllPaginatedSorted(int pageNo, int sizeSize, String field) {
		// TODO Auto-generated method stub
		
		PageRequest p = PageRequest.of(pageNo, sizeSize);
		return s.findById(p);
	}

	@Override
	public Optional<Student> findById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Iterable<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Student> findById(PageRequest p) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
