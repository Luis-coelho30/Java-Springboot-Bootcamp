package web.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.api.model.Usuario;
import web.api.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping
    public List<Usuario> getUsers() {
        return repository.listAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
    @PostMapping
    public void postUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
    @PutMapping
    public void putUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}
