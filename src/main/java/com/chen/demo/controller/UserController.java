package com.chen.demo.controller;
import com.chen.demo.pojo.User;
import com.chen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/findall")
      public String userList(Model model) {
        List<User> userList = userService.selectList();
        userList.forEach(System.out::println);
        model.addAttribute("list", userList);
        return "/index";
    }

}
