package ma.ensaf.colle.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import ma.ensaf.colle.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findByNameAndPrix(String name, String prix);

	List<Product> findByName(String name);
	
	Product findById(long id);
	
	void deleteByName(String name);


}
