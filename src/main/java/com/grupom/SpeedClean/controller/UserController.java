package com.grupom.SpeedClean.controller;

import com.grupom.SpeedClean.model.User;
import com.grupom.SpeedClean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/usuario")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @GetMapping()
    public ResponseEntity<List<User>> buscarTodosUser() {
        return ResponseEntity.ok(userService.buscarTodosUser());
    }

    @GetMapping("/{Id}")
    public ResponseEntity<User> buscarUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.buscarUser(id));
    }
/*
    @PutMapping("/{Id}")
    public ResponseEntity<User> editarUser(@PathVariable Long id, @RequestBody User userAtualizado) {
        User userEditado = userService.editarUser(id, userAtualizado);
        return ResponseEntity.ok(userEditado);
    }
 */

    @DeleteMapping(path= {"/{Id}"})
    public ResponseEntity<User> deletar(@PathVariable Long id) {
        userService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
