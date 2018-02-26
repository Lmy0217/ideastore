package com.agekt.ideastore.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.agekt.ideastore.ApplicationStarter;
import com.agekt.ideastore.dao.UserDAO;
import com.agekt.ideastore.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationStarter.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class UserDAOTest {

    @Autowired
    private UserDAO userDAO;
    
    @Autowired
    private User user;
    
    public void save() {
        user.setId(1L);
        user.setUsername("Alice");
        user.setNickname("Ashon");
        user.setEmail("alice@gmail.com");
        user.setPhone("+8618076589124");
        user.setPassword("q4frc8hg4sy");
        userDAO.save(user);
    }
    
    public void findById() {
        user = userDAO.findById(user, 1L);
        System.out.println(user);
    }
    
    @Test
    public void test() {
        save();
        findById();
    }
}
