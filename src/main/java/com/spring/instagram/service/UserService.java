package com.spring.instagram.service;

import com.spring.instagram.entity.UserDetails;
import org.apache.catalina.User;

public interface UserService {
    UserDetails getUserDetails(String userName);
    UserDetails getVerificationStatus(String userName);

    void checkUserName(String userName);
    void addUser(UserDetails user);

    void editUser(UserDetails user);
    void editDefaultPic(UserDetails user);
}
