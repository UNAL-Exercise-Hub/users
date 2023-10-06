package com.project.unworkout_users_ms.services;

import com.project.unworkout_users_ms.model.dtos.UserRequest;
import com.project.unworkout_users_ms.model.dtos.UserResponse;
import com.project.unworkout_users_ms.model.entities.User;
import com.project.unworkout_users_ms.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
