package com.jcs.fr;

import com.jcs.fr.dao.AccountRepository;
import com.jcs.fr.entities.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class AccountRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AccountRepository repo;

    @Test
    public void testCreateUser() {
        Account user = new Account();
        user.setUserName("jcswan85");
        user.setEmail("jcswan@aol.com");
        user.setPassword("swan1148");

        Account savedUser = repo.save(user);

        Account existUser = entityManager.find(Account.class, savedUser.getUid());

       // assertThat(user.getEmail()).isEqualTo(existUser.getEmail());

    }
}