package com.moeaj.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("mahmoud");
        boolean isValidPassword = password.equalsIgnoreCase("1247");

        return isValidUserName && isValidPassword;
    }
}
