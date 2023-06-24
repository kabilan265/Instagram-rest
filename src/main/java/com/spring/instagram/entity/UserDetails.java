package com.spring.instagram.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user_details")
public class UserDetails {
    public UserDetails(long id, @NonNull String userName, @NonNull String fullName, @NonNull String email, @NonNull String password,  Integer posts,  Integer followers, Integer following,  String bio,  String profilePic) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
        this.posts = posts;
        this.followers = followers;
        this.following = following;
        this.bio = bio;
        this.profilePic = profilePic;
        this.email =email;
        this.password=password;
    }
    public UserDetails( @NonNull String userName, @NonNull String fullName, @NonNull String email, @NonNull String password,  Integer posts,  Integer followers, Integer following,  String bio,  String profilePic) {

        this.userName = userName;
        this.fullName = fullName;
        this.posts = posts;
        this.followers = followers;
        this.following = following;
        this.bio = bio;
        this.profilePic = profilePic;
        this.email =email;
        this.password=password;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  long id;
    @NonNull
    @Column(name = "user_name", nullable = false)
    private String userName;

    @NonNull
    @Column(name = "fullName", nullable = false)
    private  String fullName;

    @NonNull
    @Column(name="email", nullable = false)
    private  String email;

    @NonNull
    @Column(name="password", nullable = false)
    private  String password;

    @Column(name = "posts", columnDefinition = "INT DEFAULT 0")
    private  Integer posts;

    @Column(name = "followers")
    private  Integer followers;

    @Column(name = "following")
    private  Integer following;

    @Column(name = "bio")
    private  String bio;

    @Column(name = "profile_pic")
    @Lob
    private String profilePic;

    @JsonIgnore
    @OneToMany(mappedBy = "userDetails", cascade = CascadeType.ALL)
    private List<Photos> photos;
}
