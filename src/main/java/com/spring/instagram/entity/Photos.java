package com.spring.instagram.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "photos")
public class Photos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NonNull
    @Column(name = "photo_url", nullable = false)
    @Lob
    private String photoUrl;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserDetails userDetails;

    public Photos(String photoUrl, UserDetails userDetails)
    {   System.out.println(photoUrl);
        this.photoUrl=photoUrl;
        this.userDetails=userDetails;
    }
}
