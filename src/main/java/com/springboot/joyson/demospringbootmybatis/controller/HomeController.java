package com.springboot.joyson.demospringbootmybatis.controller;

//import com.springboot.joyson.demospringbootmybatis.dao.UserDao;

import com.springboot.joyson.demospringbootmybatis.dao.UserMapperDao;
import com.springboot.joyson.demospringbootmybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    /*@Autowired
    UserDao userDao;*/

    @Autowired
    UserMapperDao userDao;


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","world");
        return "home";
    }

    /*@GetMapping("/{id}")
    public String findById(Model model, @PathVariable(value = "id") int id){
        User u = userDao.findById(id);
        model.addAttribute("name",u);
        return "home";
    }*/


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User findById(Model model, @PathVariable(value = "id") int id){
        User u = userDao.findById(id);

        return u;
    }


    /*@RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void add()
    {
        userDao.insertUser(3,"haha","yuyu");
    }*/

}
