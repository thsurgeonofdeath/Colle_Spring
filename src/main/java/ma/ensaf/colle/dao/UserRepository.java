package ma.ensaf.colle.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensaf.colle.model.Product;
import ma.ensaf.colle.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUsername(String username);
	
	User findById(long id);
	
	void deleteByUsername(String username);
}
