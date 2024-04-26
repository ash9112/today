package z.z;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class TeacherSerImp implements TeacherService{
	
	
	@Autowired
	private TeacherService t;


	@Override
	public void save(Teacher teacher) {
		// TODO Auto-generated method stub
		
		t.save(teacher);
		
	}

	@Override
	public void modify(Teacher teacher) {
		// TODO Auto-generated method stub
		t.save(teacher);
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		t.deleteById(id);
	}

	@Override
	public Teacher selectById(int id) {
		// TODO Auto-generated method stub
		{Optional<Teacher> opt = t.findById(id);
		if (opt.isPresent()) {
			
			return opt.get();
		}
		
		
		}
		return null;
	}

	@Override
	public List<Teacher> SelectAllTeacher() {
		Iterable<Teacher> itr = t.findAll();
		List<Teacher> lst = new ArrayList<Teacher>();
		 itr.forEach(ele -> lst.add(ele));
		
		return lst;
	}

	@Override
	public List<Teacher> getAllPaginatedSorted(int pageNo, int sizeSize, String field) {
		// TODO Auto-generated method stub

		PageRequest p = PageRequest.of(pageNo, sizeSize);
		return t.findById(p);
	}

	@Override
	public Optional<Teacher> findById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Iterable<Teacher> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> findById(PageRequest p) {
		// TODO Auto-generated method stub
		return null;
	}


}
