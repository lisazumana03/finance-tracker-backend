package za.co.lzinc.domain.authentication;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Document(collection = "user")
public class User implements Serializable {
    @Id
    private int userId;
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
    private LocalDateTime creationDate;
    private String currency;

    public User(){}

    private User(Builder builder){
        this.userId = builder.userId;
        this.fullName = builder.fullName;
        this.email = builder.email;
        this.password = builder.password;
        this.phoneNumber = builder.phoneNumber;
        this.creationDate = builder.creationDate;
        this.currency = builder.currency;
    }

    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", creationDate=" + creationDate +
                ", currency='" + currency + '\'' +
                '}';
    }

    public static class Builder{
        private int userId;
        private String fullName;
        private String email;
        private String password;
        private String phoneNumber;
        private LocalDateTime creationDate;
        private String currency;

        public Builder setUserId(int userId){
            this.userId = userId;
            return this;
        }

        public Builder setFullName(String fullName){
            this.fullName = fullName;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setPassword(String password){
            this.password = password;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setCreationDate(LocalDateTime creationDate){
            this.creationDate = creationDate;
            return this;
        }

        public Builder setCurrency(String currency){
            this.currency = currency;
            return this;
        }

        public Builder copy(User user) {
            this.userId = user.userId;
            this.fullName = user.fullName;
            this.email = user.email;
            this.password = user.password;
            this.phoneNumber = user.phoneNumber;
            this.creationDate = user.creationDate;
            this.currency = user.currency;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
