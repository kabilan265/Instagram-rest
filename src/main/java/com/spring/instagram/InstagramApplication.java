package com.spring.instagram;

import com.spring.instagram.entity.Photos;
import com.spring.instagram.entity.UserDetails;
import com.spring.instagram.repository.PhotosRepository;
import com.spring.instagram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstagramApplication implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PhotosRepository photosRepository;

    public static void main(String[] args) {
        SpringApplication.run(InstagramApplication.class, args);
    }

    @Override
    public void run(String... args) {
        UserDetails[] users = new UserDetails[]
                {
                        new UserDetails("basically_babu", "Naresh babu","naresh9g19@gmail.com","Dhoni777", 4, 264,
                                594, "Break the rulez for friends❤\\n➖✖➖✖➖✖➖✖➖✖➖✖➖✖",
                                "https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/naresh%2Fprofilepicture%2FMy%20project%20(1).jpg?alt=media&token=2f471e15-131f-4ef4-90bd-86ac08ad4609"
                        ),
                        new UserDetails("kabichandran", "kabi😉😉","kabichandran777@gmail.com","Dhoni777", 4, 218,
                                340, "Dhoni fan😎\n#break_the _rules_for_friends 😉😉",
                                "https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/kabichandran%2Fprofilepicture%2FDinesh%20Dk%2020190312_155043.jpg?alt=media&token=d12d8510-6212-42d5-a86f-4d85dfb5ae4e&_gl=1*263jxb*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQ4NTUyNi4xNy4xLjE2ODY0ODc4NTQuMC4wLjA.")
                };

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getFullName() + "++++++++++++++++++++++++++++");
            userRepository.save(users[i]);
        }

       Photos[] p = new Photos[]
                {
                        new Photos(1L,"https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/kabilan%2FIMG-20181116-WA0006.jpg?alt=media&token=ef77c453-1c92-41db-8a55-51682f78e09d",new UserDetails(1L,"basically_babu", "Naresh babu","naresh9g19@gmail.com","Dhoni777", 4, 264,
                                594, "Break the rulez for friends❤\\n➖✖➖✖➖✖➖✖➖✖➖✖➖✖",
                                "https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/naresh%2Fprofilepicture%2FMy%20project%20(1).jpg?alt=media&token=2f471e15-131f-4ef4-90bd-86ac08ad4609"
                        )),
                        new Photos(2L,"https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/naresh%2FIMG_4985.JPG?alt=media&token=3c08a470-0ad0-4745-bbdd-da1d664dd0d4",new UserDetails(1L,"basically_babu", "Naresh babu","naresh9g19@gmail.com","Dhoni777", 4, 264,
                                594, "Break the rulez for friends❤\\n➖✖➖✖➖✖➖✖➖✖➖✖➖✖",
                                "https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/naresh%2Fprofilepicture%2FMy%20project%20(1).jpg?alt=media&token=2f471e15-131f-4ef4-90bd-86ac08ad4609"
                        )),
                        new Photos(3L,"https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/naresh%2FIMG-20221110-WA0011.jpg?alt=media&token=b5c94884-ab80-49f3-aa4c-0b2bc0bda796",new UserDetails(1L,"basically_babu", "Naresh babu", "naresh9g19@gmail.com","Dhoni777",4, 264,
                                594, "Break the rulez for friends❤\\n➖✖➖✖➖✖➖✖➖✖➖✖➖✖",
                                "https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/naresh%2Fprofilepicture%2FMy%20project%20(1).jpg?alt=media&token=2f471e15-131f-4ef4-90bd-86ac08ad4609"
                        )),
                        new Photos(4L,"https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/naresh%2FIMG_20190406_165159.jpg?alt=media&token=988a4732-fdf3-41b8-b290-6746c69e6c9d",new UserDetails(1L,"basically_babu", "Naresh babu","naresh9g19@gmail.com","Dhoni777", 4, 264,
                                594, "Break the rulez for friends❤\\n➖✖➖✖➖✖➖✖➖✖➖✖➖✖",
                                "https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/naresh%2Fprofilepicture%2FMy%20project%20(1).jpg?alt=media&token=2f471e15-131f-4ef4-90bd-86ac08ad4609"
                        )),
                        new Photos(5L,"https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/kabichandran%2Fphotos%2F2019-02-02-10-59-00-033.jpg?alt=media&token=55bff8b3-c1a6-4160-b688-95d88ece5d43&_gl=1*16p330q*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQ4NTUyNi4xNy4xLjE2ODY0ODYyMTcuMC4wLjA.", new UserDetails(2L,"kabichandran", "kabi😉😉","kabichandran777@gmail.com","Dhoni777",  4, 218,
                                340, "Dhoni fan😎\n#break_the _rules_for_friends 😉😉",
                                "https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/kabichandran%2Fphotos%2F2019-02-02-10-59-00-033.jpg?alt=media&token=55bff8b3-c1a6-4160-b688-95d88ece5d43&_gl=1*158748d*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQxNzc5MS4xNi4xLjE2ODY0MTg5NTkuMC4wLjA.")),
                        new Photos(6L,"https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/kabichandran%2Fphotos%2F2019-06-18-18-16-25-335.jpg?alt=media&token=32e138e4-e8e6-454a-a695-a228e0288e98&_gl=1*1pe56r0*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQ4NTUyNi4xNy4xLjE2ODY0ODYyNzcuMC4wLjA.", new UserDetails(2L,"kabichandran", "kabi😉😉", "kabichandran777@gmail.com","Dhoni777", 4, 218,
                                340, "Dhoni fan😎\n#break_the _rules_for_friends 😉😉",
                                "https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/kabichandran%2Fphotos%2F2019-06-18-18-16-25-335.jpg?alt=media&token=32e138e4-e8e6-454a-a695-a228e0288e98&_gl=1*133zpff*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQxNzc5MS4xNi4xLjE2ODY0MTkxMTAuMC4wLjA.")),
                        new Photos(7L,"https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/kabichandran%2Fphotos%2FIMG-20181116-WA0006.jpg?alt=media&token=622cd5b0-7781-4365-909f-a2ec22eeea0c&_gl=1*1tlofck*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQ4NTUyNi4xNy4xLjE2ODY0ODYzMTAuMC4wLjA.", new UserDetails(2L,"kabichandran", "kabi😉😉","kabichandran777@gmail.com","Dhoni777",  4, 218,
                                340, "Dhoni fan😎\n#break_the _rules_for_friends 😉😉",
                                "https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/kabichandran%2Fphotos%2FIMG-20181116-WA0006.jpg?alt=media&token=622cd5b0-7781-4365-909f-a2ec22eeea0c&_gl=1*1qivi85*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQxNzc5MS4xNi4xLjE2ODY0MTkxNTMuMC4wLjA.")),
                        new Photos(8L,"https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/kabichandran%2Fphotos%2FIMG-20181116-WA0009.jpg?alt=media&token=d5b3b9af-4c7c-4482-ba82-a2eab7438081&_gl=1*9mupyj*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQ4NTUyNi4xNy4xLjE2ODY0ODYzMzMuMC4wLjA.", new UserDetails(2L,"kabichandran", "kabi😉😉", "kabichandran777@gmail.com","Dhoni777", 4, 218,
                                340, "Dhoni fan😎\n#break_the _rules_for_friends 😉😉",
                                "https://firebasestorage.googleapis.com/v0/b/instagram-clone-9f45e.appspot.com/o/kabichandran%2Fphotos%2FIMG-20181116-WA0009.jpg?alt=media&token=d5b3b9af-4c7c-4482-ba82-a2eab7438081&_gl=1*tux8hn*_ga*NTExNzQyMzQxLjE2NjYwMDA1Njc.*_ga_CW55HF8NVT*MTY4NjQxNzc5MS4xNi4xLjE2ODY0MTkxODEuMC4wLjA."))

                };
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].getPhotoUrl() + "++++++++++++++++++++++++++++");
            photosRepository.save(p[i]);
        }
    }
}
