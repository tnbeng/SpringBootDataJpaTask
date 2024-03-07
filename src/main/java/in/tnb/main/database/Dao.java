package in.tnb.main.database;



import org.springframework.data.jpa.repository.JpaRepository;

import in.tnb.service.User;

public interface Dao extends JpaRepository<User, Integer>{
  
}
