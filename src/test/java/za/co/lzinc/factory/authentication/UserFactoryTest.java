package za.co.lzinc.factory.authentication;

import org.junit.jupiter.api.Test;
import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    @Test
    void createUser() {
        int userId = 5;
        String fullName = "Lisa Zumana";
        String email = "zumanalisa@gmail.com";
        String password = "P@ssword123";
        String phoneNumber = "021 312 2311";
        LocalDateTime creationDate = LocalDateTime.now();
        String currency = "ZAR";

        User user = UserFactory.createUser(userId, fullName, email, password, phoneNumber, creationDate, currency);
        System.out.println(user);
        assertNotNull(user);
    }
}