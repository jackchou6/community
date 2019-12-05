package com.jackchou666.community.controller;

import com.jackchou666.community.mapper.UserMapper;
import com.jackchou666.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 *Create by
 */
@Controller
public class IndexController {
    
    @Autowired
    private UserMapper userMapper;
    
    @GetMapping("/")
    public String index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies == null){
            return "index";
        }
        for (Cookie cookie : cookies) {
            if ("token".equals(cookie.getName())){
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);    
                if (user != null){
                    request.getSession().setAttribute("user", user);
                }
                break;
            }
        }
        return "index";
    }
}
