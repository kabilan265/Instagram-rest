package com.spring.instagram.service;

import com.spring.instagram.entity.Photos;
import com.spring.instagram.entity.UserDetails;

import java.util.List;

public interface PhotosService {
    List<String> getPhotos(String userName);

    List<String> addPhoto(Photos photos);
}
