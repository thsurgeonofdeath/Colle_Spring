package ma.ensaf.colle.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ma.ensaf.colle.dao.UserRepository;
import ma.ensaf.colle.model.User;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
	if(null == user) {
		throw new UsernameNotFoundException("No user named" + username);
	} 
	else {
		return new UserDetailsImpl(user);
		}
	}

	

}
