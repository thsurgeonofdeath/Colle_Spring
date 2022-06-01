package ma.ensaf.colle.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensaf.colle.model.Category;
import ma.ensaf.colle.model.Product;

public interface CategoryRepository extends JpaRepository<Category, Long>{

List<Category> findByName(String name);
	
	Category findById(long id);
	
	void deleteByName(String name);
}
