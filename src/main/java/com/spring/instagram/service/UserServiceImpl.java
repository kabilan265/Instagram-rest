package com.spring.instagram.service;

import com.spring.instagram.entity.UserDetails;
import com.spring.instagram.exception.BadRequestExceptiion;
import com.spring.instagram.exception.NotFoundException;
import com.spring.instagram.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails getUserDetails(String userName) {
        UserDetails details = this.findUser(userName);
        if (details == null) {
            throw new NotFoundException(userName+" is not found");
        } else {
            return details;
        }
    }

    @Override
    public UserDetails getVerificationStatus(String userName) {
        UserDetails details = this.findUser(userName);
        if (details == null) {
            throw new NotFoundException("Sorry, your password was incorrect. Please double-check your password.");

        } else {
            return details;
        }

    }

    public UserDetails findUser(String userName) {
        List<UserDetails> users = (List<UserDetails>) userRepository.findAll();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
                return users.get(i);
            }
        }
        return null;
    }

    public void checkUserName(String userName) {
        UserDetails user = this.findUser(userName);
        if (user != null) {
             throw  new BadRequestExceptiion("UserName is available already");
        } }


    public void addUser(UserDetails user) {
        user.setProfilePic("https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/default%2FNoPic.jpg?alt=media&token=d5dc36e6-1f57-45d5-b44a-2cd9b5f4494d&_gl=1*1gdvine*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQxNzc5MS4xNi4xLjE2ODY0MTg1NzguMC4wLjA.");
        user.setPosts(0);
        user.setFollowers(0);
        user.setFollowing(0);
        user.setBio("");
        userRepository.save(user);
    }

    public void editUser(UserDetails user) {
        UserDetails editUser = userRepository.findById(user.getId()).get();
        editUser.setUserName(user.getUserName());
        editUser.setFullName(user.getFullName());
        editUser.setProfilePic(user.getProfilePic());
        editUser.setEmail(user.getEmail());
        editUser.setBio(user.getBio());
        userRepository.save(editUser);
    }

    @Override
    public void editDefaultPic(UserDetails user) {
        UserDetails editUser = userRepository.findById(user.getId()).get();
        editUser.setProfilePic("https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/default%2FNoPic.jpg?alt=media&token=d5dc36e6-1f57-45d5-b44a-2cd9b5f4494d&_gl=1*1gdvine*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQxNzc5MS4xNi4xLjE2ODY0MTg1NzguMC4wLjA.");
        userRepository.save(editUser);
    }
}
