package clean.code.houseutils.repository;

import clean.code.houseutils.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}