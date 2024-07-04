package com.springlessons.securityform.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;


@RestController
@RequestMapping("/task")
public class TaskController {

    @Secured("ROLE_SUPER_USER")
    @PostMapping
    public String createTask(){
        return "Task created";
    }

    @Secured("ROLE_SUPER_USER")
    @PutMapping
    public String updateTask(){
        return "Task updated";
    }

    @Secured("ROLE_SUPER_USER")
    @GetMapping("/author") // автор задачи
    public String tasksByAuthorUser(){
        return "Task By Author User";
    }

    @Secured({"ROLE_SUPER_USER", "ROLE_USER"})
    @GetMapping("/responsible") // ответственный
    public String tasksByResponsibleUser(Principal principalController,
                                         Authentication authenticationController,
                                         @AuthenticationPrincipal UserDetails userDetailsController,
                                         HttpServletRequest requestController){
        Authentication authenticationService = SecurityContextHolder.getContext().getAuthentication();
        String username01 = authenticationService.getName();
        System.out.println(username01);

        UserDetails userDetailsService = (UserDetails) authenticationService.getPrincipal();
        System.out.println(userDetailsService.getAuthorities());

        System.out.println(principalController.getName());
        System.out.println(authenticationController.getName());
        System.out.println(userDetailsController.getUsername());
        Principal principalRequest = requestController.getUserPrincipal();
        System.out.println(principalRequest.getName());

        return "Task By Responsible User";
    }
}
