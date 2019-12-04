package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;
import service.UserDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserDao userDao;
    @Autowired
    HttpServletRequest request;
    @RequestMapping("/login.action")
    public String login(User user, Model model){
        HttpSession session=request.getSession();
        User loginuser=userDao.Login(user);
        if (loginuser !=null){
            session.setAttribute("user",loginuser);
            return "index";
        }else {
            return "login.action";
        }
    }
}
