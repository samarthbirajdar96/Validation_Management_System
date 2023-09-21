package com.geekster.Validation.UserManagement.System.Intity;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class User {

     @NotNull
    private Integer userId;

    @NotBlank
    private String userName;

    private LocalDate userDOB;

    @Email
    private String userEmail;

    @Size(min = 12, max = 12)
    @Pattern(regexp = "^[0-9]+$")

    private String userNumber;

    private LocalTime userTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(LocalDate userDOB) {
        this.userDOB = userDOB;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public LocalTime getUserTime() {
        return userTime;
    }

    public void setUserTime(LocalTime userTime) {
        this.userTime = userTime;
    }
}

