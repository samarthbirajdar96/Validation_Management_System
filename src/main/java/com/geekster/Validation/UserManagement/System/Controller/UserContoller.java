package com.geekster.Validation.UserManagement.System.Controller;

import com.geekster.Validation.UserManagement.System.Intity.User;
import com.geekster.Validation.UserManagement.System.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserContoller {

    @Autowired
    UserService userService;

   @GetMapping("users")
    public List<User> getalluser(){
       return userService.getalluser();
   }

   @PostMapping("users")
    public String adduser(@RequestBody @Valid List<User> user){
       return userService.adduser(user);
   }

   @GetMapping ("user/{id}")
    public User getuserbyid(@PathVariable @Valid Integer id){
       return userService.getuserbyid(id);
   }
   @PutMapping("user/id/{id}")
    public String updatenamebyid(@PathVariable @Valid Integer id,@RequestParam @Valid String name){
       return userService.updatenamebyid(id,name);
   }

    @DeleteMapping ("user/id/{id}")
    public String deleteuser(@PathVariable @Valid Integer id){
        return userService.deleteuser(id);
    }


}
