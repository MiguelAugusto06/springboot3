package com.example.escola.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public Aluno postAluno(@RequestBody Aluno a){
        return this.alunoService.save(a);
    };

    @GetMapping
    public List<Aluno> listarTodos(){
        return this.alunoService.listarAlunos();
    }

    @GetMapping("/id")
    public Aluno getById(@PathVariable("id") Long id){
        return this.alunoService.getById(id);
    }
}
