package dev.danvega.jpasecurity.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

//    @GetMapping("/home)")
//    public String home() {
//        return "home";
//    }

//    @PreAuthorize("hasRole('USER')")
//    @GetMapping("/user")
//    public String user() {
//        return "user";
//    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return "admin/admin";
    }

}
