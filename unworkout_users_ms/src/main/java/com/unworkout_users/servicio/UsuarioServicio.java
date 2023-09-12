package com.unworkout_users.servicio;

import com.unworkout_users.dto.UsuarioRegistroDTO;
import com.unworkout_users.modelo.Usuario;

public interface UsuarioServicio {
    public Usuario guardarUsuario(UsuarioRegistroDTO resgistroDTO);
}
