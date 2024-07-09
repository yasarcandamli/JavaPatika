package dev.patika.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/tr")
public class TestController {
    @GetMapping("/")
    public String home() {
        return "Anasayfa";
    }

    @GetMapping("/about")
    public String about() {
        return "Hakkımızda Sayfası";
    }

    @GetMapping("/user/{userId}")
    public String getUserOnlyId(@PathVariable("userId") int user_id) {
        return "User Id: " + user_id;
    }

    @GetMapping("/user/{userId}/{userName}")
    public String getUser(@PathVariable("userId") int user_id, @PathVariable("userName") String user_name) {
        return "User Id: " + user_id + " -- User Name: " + user_name;
    }
}
