package com.cenfotec.universidad.repositories;

import org.springframework.data.repository.CrudRepository;
import com.cenfotec.springdata.ejb.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer>{
	
	Player findByFirstname(String pFirstName);
	Player findByLastname(String pLastName);
	
}
