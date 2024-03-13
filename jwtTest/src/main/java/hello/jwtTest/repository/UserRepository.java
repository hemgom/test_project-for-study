package hello.jwtTest.repository;

import hello.jwtTest.domain.user.UserTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserTest, Long> {
    Optional<UserTest> findByUsername(String username);
}
