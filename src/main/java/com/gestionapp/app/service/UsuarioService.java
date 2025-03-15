package com.gestionapp.app.service;

import com.gestionapp.app.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioService {
    List<UsuarioDTO> getAllUsuarios();
    UsuarioDTO getUsuarioById(Long id);
    UsuarioDTO createUsuario(UsuarioDTO usuarioDTO);
    UsuarioDTO updateUsuario(Long id, UsuarioDTO usuarioDTO);
    void deleteUsuario(Long id);
    List<UsuarioDTO> findByLastname(String query);
}
