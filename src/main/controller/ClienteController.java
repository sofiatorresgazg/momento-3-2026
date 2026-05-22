package com.control.controller;

import com.control.dto.ClienteRequestDto;
import com.control.dto.ClienteResponseDto;
import com.control.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteResponseDto crearCliente(
            @Valid @RequestBody ClienteRequestDto dto) {

        return clienteService.crearCliente(dto);
    }

    @GetMapping
    public List<ClienteResponseDto> obtenerListaDeClientes() {

        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public ClienteResponseDto obtenerCliente(
            @PathVariable Long id) {

        return clienteService.getCliente(id);
    }

    @PutMapping("/{id}")
    public ClienteResponseDto updateCliente(
            @PathVariable Long id,
            @Valid @RequestBody ClienteRequestDto dto) {

        return clienteService.updateCliente(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarCliente(
            @PathVariable Long id) {

        clienteService.deleteCliente(id);
    }
}