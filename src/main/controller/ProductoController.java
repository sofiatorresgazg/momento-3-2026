package com.control.controller;

import com.control.dto.ProductoRequestDto;
import com.control.dto.ProductoResponseDto;
import com.control.service.ProductoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductoResponseDto crearProducto(
            @Valid @RequestBody ProductoRequestDto dto) {

        return productoService.crearProducto(dto);
    }

    @GetMapping
    public List<ProductoResponseDto> obtenerListaDeProductos() {

        return productoService.listarProductos();
    }

    @GetMapping("/{id}")
    public ProductoResponseDto obtenerProducto(
            @PathVariable Long id) {

        return productoService.getProducto(id);
    }

    @PutMapping("/{id}")
    public ProductoResponseDto updateProducto(
            @PathVariable Long id,
            @Valid @RequestBody ProductoRequestDto dto) {

        return productoService.updateProducto(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarProducto(
            @PathVariable Long id) {

        productoService.deleteProducto(id);
    }
}
