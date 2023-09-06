package sunbasedata.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sunbasedata.demo.model.user;

public interface UserRepository extends JpaRepository<user, Long> {
    public user findByUserName(String userName);

}