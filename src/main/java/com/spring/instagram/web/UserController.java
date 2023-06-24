package com.spring.instagram.web;

import com.spring.instagram.entity.UserDetails;
import com.spring.instagram.repository.UserRepository;
import com.spring.instagram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{userName}")
    public ResponseEntity<UserDetails> getUserDetails(@PathVariable String userName) {
        UserDetails details = userService.getUserDetails(userName);
        return new ResponseEntity<>(details, HttpStatus.OK);
    }

    @GetMapping("login/{userName}")
    public ResponseEntity<Object> getVerification(@PathVariable String userName) {
        return new ResponseEntity<>(userService.getVerificationStatus(userName), HttpStatus.OK);
    }

    @GetMapping("signup/{userName}")
    public ResponseEntity<HttpStatus> checkUserName(@PathVariable String userName) {
        System.out.println("ssssssssssssss");
        userService.checkUserName(userName);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<Object> addNewUser(@RequestBody UserDetails user) {
        System.out.println(user.getEmail());
        userService.addUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("edit")
    public ResponseEntity<Object> editUser(@RequestBody UserDetails user) {
        System.out.println("editttt");
      userService.editUser(user);
      return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PutMapping("edit/default")
    public  ResponseEntity<Object> editDefultPic(@RequestBody UserDetails user)
    {
     userService.editDefaultPic(user);
     return  new ResponseEntity<>(HttpStatus.OK);
    }
}
