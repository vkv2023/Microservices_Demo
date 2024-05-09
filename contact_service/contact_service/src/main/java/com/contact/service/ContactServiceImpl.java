package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements  ContactService{

    List<Contact> list = List.of(
        new Contact(1L, "Vkv@gmail.com","Amit",1512L),
        new Contact(2L, "Vkv@gmail.com","Anil",1513L),
        new Contact(3L, "Vkv@gmail.com","Anal",1514L),
        new Contact(4L, "Vkv@gmail.com","Akhil",1512L),
        new Contact(5L, "Vkv@gmail.com","Jatin",1511L)
    );

    @Override
    public List<Contact> getContactOfUser(Long userId){
           return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
