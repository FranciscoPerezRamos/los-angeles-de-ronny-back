package angeles_de_ronny.c4g.anglesDeRonny.services;

import angeles_de_ronny.c4g.anglesDeRonny.repositories.UserDAO;
import angeles_de_ronny.c4g.anglesDeRonny.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component("userService")
@Transactional
public class UserService {

    private final UserDAO userDao;

    @Autowired
    public UserService(@Qualifier("userDao") UserDAO userDao) {
        this.userDao = userDao;
    }

    public User create(User aUser) {
        return userDao.save(aUser);
    }
}
