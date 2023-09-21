package com.geekster.Validation.UserManagement.System.Service;

import com.geekster.Validation.UserManagement.System.Intity.User;
import com.geekster.Validation.UserManagement.System.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;


    public List<User> getalluser() {
       return userRepo.getUserList() ;
    }

    public String adduser(List<User> user) {
        getalluser().addAll(user);
        return user.size()+  "user were added";
    }

    public User getuserbyid(Integer id) {
        for(User user:getalluser()){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public String updatenamebyid(Integer id, String name) {
        for(User user:getalluser()){
            if(user.getUserId().equals(id)){
                user.setUserName(name);
                return "name updated";
            }
        }
        return "user :" +id +"not found";
    }

    public String  deleteuser(Integer id) {
          for(User user :getalluser()){
              if(user.getUserId().equals(id)){
                  getalluser().remove(user);
                  return "deleted";
              }
          }
          return "user :" +id+ "not found";
    }
}
