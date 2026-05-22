package com.control.controller;

import com.control.dto.VentaRequestDto;
import com.control.dto.VentaResponseDto;
import com.control.service.VentaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ventas")
@RequiredArgsConstructor
public class VentaController {

    private final VentaService ventaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VentaResponseDto crearVenta(
            @Valid @RequestBody VentaRequestDto dto) {

        return ventaService.crearVenta(dto);
    }

    @GetMapping
    public List<VentaResponseDto> obtenerListaDeVentas() {

        return ventaService.listarVentas();
    }

    @GetMapping("/{id}")
    public VentaResponseDto obtenerVenta(
            @PathVariable Long id) {

        return ventaService.getVenta(id);
    }

    @PutMapping("/{id}")
    public VentaResponseDto updateVenta(
            @PathVariable Long id,
            @Valid @RequestBody VentaRequestDto dto) {

        return ventaService.updateVenta(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarVenta(
            @PathVariable Long id) {

        ventaService.deleteVenta(id);
    }
}