package com.mayikt.conntroller;

import com.mayikt.entity.UserEntity;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class MythymeleafConntroller {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(HttpServletRequest request, Map<String,Object> result){
//        request.setAttribute("user", new UserEntity("大哥",18));
        result.put("user",new UserEntity("dage",15));
        ArrayList<UserEntity>userList= new ArrayList<>();
        userList.add(new UserEntity("dage",15));
        userList.add(new UserEntity("dage2",22));
        userList.add(new UserEntity("dage3",21));
        result.put("userList",userList);
        return "thymeleaf";
    }

}
