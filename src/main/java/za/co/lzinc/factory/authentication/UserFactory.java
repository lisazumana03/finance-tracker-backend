package za.co.lzinc.factory.authentication;

import za.co.lzinc.domain.authentication.User;

import java.time.LocalDateTime;

public class UserFactory {
    public static User createUser(int userId, String fullName,
                                  String email, String password,
                                  String phoneNumber, LocalDateTime creationDate,
                                  String currency){
        return new User.Builder()
                .setUserId(userId)
                .setFullName(fullName)
                .setEmail(email)
                .setPassword(password)
                .setPhoneNumber(phoneNumber)
                .setCreationDate(creationDate)
                .setCurrency(currency)
                .build();
    }
}
