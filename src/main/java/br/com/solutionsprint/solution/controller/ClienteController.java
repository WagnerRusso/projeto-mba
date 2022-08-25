package br.com.solutionsprint.solution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.solutionsprint.solution.model.Cadastro;
import br.com.solutionsprint.solution.service.IClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @RequestMapping("teste")
    public String teste() {
        return "Teste OK!";
    }

    @GetMapping("clientes")
    public ResponseEntity<List<Cadastro>> getAllCliente() {
        List<Cadastro> listaClientes = clienteService.getAllClientes();
        return new ResponseEntity<List<Cadastro>>(listaClientes, HttpStatus.OK);
    }

    @GetMapping("cliente/{id}")
    public ResponseEntity<Cadastro> getClienteById(@PathVariable("id") Long id) {
        Cadastro cliente = clienteService.getClienteById(id);
        return new ResponseEntity<Cadastro>(cliente, HttpStatus.OK);
    }

    @PostMapping("addCliente")
    public ResponseEntity<Void> addCliente(@RequestBody Cadastro cliente, UriComponentsBuilder builder) {
        Cadastro savedCliente = clienteService.addCliente(cliente);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/cliente/{id}").buildAndExpand(savedCliente.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Cadastro> updateCliente(@PathVariable Long id, @RequestBody Cadastro cliente) {
        clienteService.updateCliente(id, cliente);

        return new ResponseEntity<Cadastro>(cliente, HttpStatus.OK);
    }

    @DeleteMapping("cliente/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable("id") Long id) {
        clienteService.deleteCliente(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
