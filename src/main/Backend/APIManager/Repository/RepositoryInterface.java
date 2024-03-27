package APIManager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import APIManager.Entity.UserEntity;

@Repository
public interface RepositoryInterface extends JpaRepository<UserEntity, Long> {
    // 다른 메서드 추가 가능
	  
}