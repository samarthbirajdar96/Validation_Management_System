package com.geekster.Validation.UserManagement.System.Repo;

import com.geekster.Validation.UserManagement.System.Intity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class UserFactory {

@Bean
    List<User> getuserlist()
    {
        return new ArrayList<>();
    }
}
