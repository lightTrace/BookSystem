package cn.com.controller;

import cn.com.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * ${DESCRIPTION}
 *
 * @author lightTrace
 * @create 2017-10-28 11:23
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(User user, HttpServletRequest request) {
        String password =  user.getPassword();
        System.out.println(password);
        String result = null;
        if(password.equals("123")){
            result ="list";
        }else {
            result ="login";
        }
        return result;
    }
}
