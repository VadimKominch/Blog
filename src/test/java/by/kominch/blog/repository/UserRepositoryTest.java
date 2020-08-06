package by.kominch.blog.repository;


import by.kominch.blog.configuration.DbConfiguration;
import by.kominch.blog.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("dev")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(DbConfiguration.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void checkForUserSaved() {
        User user = new User();
        user.setUserName("Vadim");
        user.setPassword("Kominch");
        user.setLogin("Vadimko");
        userRepository.save(user);
        List<User> usersFromDb = userRepository.getUserByUserName("Vadim");
        Assert.assertEquals(1,usersFromDb.size());
    }
}
