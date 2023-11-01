package com.project.unworkout_users_ms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.unworkout_users_ms.model.dtos.UserRequest;
import com.project.unworkout_users_ms.model.dtos.UserResponse;
import com.project.unworkout_users_ms.model.entities.User;
import com.project.unworkout_users_ms.repositories.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j

public class UserService {

    private final UserRepository userRepository;

    public void addUser(UserRequest userRequest) {
        var user = User.builder()
                .nombres(userRequest.getNombres())
                .apellidos(userRequest.getApellidos())
                .fecha_nacimiento(userRequest.getFecha_nacimiento())
                .sexo(userRequest.getSexo())
                .cel(userRequest.getCel())
                .email(userRequest.getEmail())
                .build();

        userRepository.save(user);

        log.info("User added: {}", user);
    }

    public Boolean updateUser(Long userId, UserRequest userRequest) {
        // Buscar el usuario existente por ID
        try {
            User existingUser = userRepository.findById(userId).get();

            existingUser.setNombres(userRequest.getNombres());
            existingUser.setApellidos(userRequest.getApellidos());
            existingUser.setFecha_nacimiento(userRequest.getFecha_nacimiento());
            existingUser.setSexo(userRequest.getSexo());
            existingUser.setCel(userRequest.getCel());

            userRepository.save(existingUser);
            return true;
        } catch (java.util.NoSuchElementException e) {
            return false;
        }
    }

    public List<UserResponse> getAllUsers() {
        var users = userRepository.findAll();
        return users.stream().map(this::mapToUserResponse).toList();
    }

    private UserResponse mapToUserResponse(User user) {
        return UserResponse.builder()
                .id_usuario(user.getId_usuario())
                .nombres(user.getNombres())
                .apellidos(user.getApellidos())
                .fecha_nacimiento(user.getFecha_nacimiento())
                .sexo(user.getSexo())
                .cel(user.getCel())
                .email(user.getEmail())
                .build();
    }

    public Long getUserIdByEmail(String email) {
        User user = userRepository.findByEmail(email);
        if (user != null) {
            return user.getId_usuario();
        } else {
            return null;
        }
    }

    public boolean deleteUser(Long userId) {
        try {
            User user = userRepository.findById(userId).get();
            userRepository.delete(user);
            return true;
        } catch (java.util.NoSuchElementException e) {
            return false;
        }
    }
}
