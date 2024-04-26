package z.z;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tearepo extends JpaRepository <Teacher , Long> {

}
