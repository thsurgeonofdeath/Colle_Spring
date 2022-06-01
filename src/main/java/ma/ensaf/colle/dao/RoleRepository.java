package ma.ensaf.colle.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensaf.colle.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	

}
