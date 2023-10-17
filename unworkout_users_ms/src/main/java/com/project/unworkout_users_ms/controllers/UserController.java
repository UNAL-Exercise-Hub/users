package com.project.unworkout_users_ms.controllers;

import com.project.unworkout_users_ms.model.dtos.UserRequest;
import com.project.unworkout_users_ms.model.dtos.UserResponse;
import com.project.unworkout_users_ms.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody UserRequest userRequest) {
        this.userService.addUser(userRequest);
        //return "Usuario agragado satisfacoriamete";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponse> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/byEmail")
    public Long getUserIdByEmail(@RequestParam("email") String email) {
        Long userId = userService.getUserIdByEmail(email);
        if (userId != -1) {
            return userId;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado");
        }
    }
}
