package com.spring.instagram.service;

import com.spring.instagram.entity.Photos;
import com.spring.instagram.entity.UserDetails;
import com.spring.instagram.exception.NotFoundException;
import com.spring.instagram.repository.PhotosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PhotosServiceImpl implements  PhotosService {

    @Autowired
    UserServiceImpl  userServiceImpl;
    @Autowired
    PhotosRepository photosRepository;
    public List<String> getPhotos(String userName)
    {
        UserDetails user = userServiceImpl.findUser(userName);
        if(user == null)
        {
            throw new NotFoundException("Photos not found");
        }
        Long id = user.getId();

        System.out.println(id+ "HEHRHEHHRHRHRHRHRHRHHHHHE");
        return this.findAllPhotos(id);
    }
    public List<String> findAllPhotos(Long id)
    {
        List<Photos> p =  (List<Photos>)photosRepository.findAll();
        List<String> newP =  new ArrayList<>();
        for(int i=0;i<p.size();i++)
        {
            if(p.get(i).getUserDetails().getId() == id)
            {
                  newP.add(p.get(i).getPhotoUrl());
            }
        }

        return newP;
    }

    public List<String> addPhoto(Photos photos)
    {  System.out.println("add....");
        System.out.println(photos.getPhotoUrl());
        photosRepository.save(photos);
        return  getPhotos(photos.getUserDetails().getUserName());
    }
}
