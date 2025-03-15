package com.gestionapp.app.service;

import com.gestionapp.app.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {
    List<ClienteDTO> getAllClientes();
    ClienteDTO getClienteById(Long id);
    ClienteDTO createCliente(ClienteDTO clienteDTO);
    ClienteDTO updateCliente(Long id, ClienteDTO clienteDTO);
    void deleteCliente(Long id);
    List<ClienteDTO> searchClientes(String query);
}