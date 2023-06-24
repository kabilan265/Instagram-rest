package com.spring.instagram.web;

import com.spring.instagram.entity.Photos;
import com.spring.instagram.entity.UserDetails;
import com.spring.instagram.service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RestController
@RequestMapping("/photos")
public class PhotoController {

    @Autowired
    PhotosService photosService;

    @GetMapping("/{userName}")
    public ResponseEntity<List<String>> getPhotos(@PathVariable String userName)
    {

        return  new ResponseEntity<>(photosService.getPhotos(userName), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<List<String>> editPhotos(@RequestBody Photos photos)
    {
        return new ResponseEntity<>(photosService.addPhoto(photos), HttpStatus.OK);
    }
}
