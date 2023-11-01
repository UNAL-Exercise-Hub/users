package com.project.unworkout_users_ms.controllers;

import com.project.unworkout_users_ms.model.dtos.UserRequest;
import com.project.unworkout_users_ms.model.dtos.UserResponse;
import com.project.unworkout_users_ms.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> addUser(@RequestBody UserRequest userRequest) {
        Map<String, String> response = new HashMap<>();
        try {
            userService.addUser(userRequest);
            response.put("message", "Usuario agregado satisfactoriamente");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            response.put("message", "Error de servidor al agregar usuario");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getAllUsers() {
        List<UserResponse> users = userService.getAllUsers();
        Map<String, List<UserResponse>> response = new HashMap<>();
        response.put("users", users);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/byEmail")
    public ResponseEntity<Object> getUserIdByEmail(@RequestParam("email") String email) {
        Long userId = userService.getUserIdByEmail(email);
        Map <String, String> response = new HashMap<>();
        if (userId != null) {
            response.put("message", "Usuario encontrado");
            response.put("id_usuario", userId.toString());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("message", "Usuario inexistente");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND); 
        }
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> updateUser(@PathVariable("userId") Long userId, @RequestBody UserRequest userRequest) {
        Map <String, String> response = new HashMap<>();
        try {
            Boolean result = userService.updateUser(userId, userRequest);
            if (result){ 
                response.put("message", "Usuario actualizado");
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response.put("message", "Usuario inexistente");
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            response.put("message", "Error de servidor al actualizar usuario");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> deleteUser(@PathVariable("userId") Long userId) {
        Map<String, String> response = new HashMap<>();
        try {
            boolean result = userService.deleteUser(userId);
            if (result) {
                response.put("message", "Usuario eliminado exitosamente");
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response.put("message", "Usuario no encontrado");
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
