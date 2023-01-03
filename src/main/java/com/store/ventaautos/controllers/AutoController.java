package com.store.ventaautos.controllers;

import com.store.ventaautos.models.Auto;
import com.store.ventaautos.services.AutoService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author soled
 */
@RestController
public class AutoController {

    private final AutoService service;

    public AutoController(AutoService service) {
        this.service = service;
    }

    @GetMapping("/home")
    public String home(@RequestParam String title){
        return "Bienvenido a la Tienda de"+title;
    }

    @GetMapping("/api/car/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<Auto> byId(@PathVariable("id") int id) {
        return service.find(id);
    }

    @GetMapping("/api/cars")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Auto> getAutos() {
        return (List<Auto>) service.findAll();
    }

    @PostMapping("/api/car")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Auto create(@RequestBody Auto auto) {
        return service.create(auto);
    }

    @PutMapping("/api/car")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Auto update(@RequestBody Auto auto) {
        return service.update(auto);
    }

    @PatchMapping("/api/car")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Auto change(@RequestBody Auto auto) {
        return service.change(auto);
    }

    @DeleteMapping("/api/car/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Boolean delete(@PathVariable("id") Long id) {
        return service.remove(id);
    }

}
