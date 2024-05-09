package com.user.service;
import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake userlist
    List<User> list = List.of(
            new User(1511L,"Vinod","748293749"),
            new User(1512L,"Kumar","748293759"),
            new User(1513L,"Amit","748293768"),
            new User(1514L,"Manish","748293777"),
            new User(1515L,"Jain","748293793")
    );



    @Override
    public User getUser(Long id){
        return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }



}
