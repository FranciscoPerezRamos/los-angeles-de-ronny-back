package angeles_de_ronny.c4g.anglesDeRonny.repositories;

import angeles_de_ronny.c4g.anglesDeRonny.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component("userDao")
public interface UserDAO extends JpaRepository<User, Long> { }
