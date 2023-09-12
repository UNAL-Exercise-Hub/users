package com.unworkout_users.servicio;

import org.springframework.stereotype.Service;

import com.unworkout_users.dto.UsuarioRegistroDTO;
import com.unworkout_users.modelo.Usuario;
import com.unworkout_users.respositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    private UsuarioRepositorio UsuarioRepositorio;

    public UsuarioServicioImpl(com.unworkout_users.respositorio.UsuarioRepositorio usuarioRepositorio) {
        super();
        UsuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario guardarUsuario(UsuarioRegistroDTO resgistroDTO) {
        Usuario usuario = new Usuario(
                resgistroDTO.getNombres(),
                resgistroDTO.getApellidos(),
                resgistroDTO.getFecha_nacimiento(),
                resgistroDTO.getSexo(),
                resgistroDTO.getCel(),
                resgistroDTO.getEmail());
        return UsuarioRepositorio.save(usuario);
    }

}
