package com.example.escola.turmas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaControler {
    @Autowired
    TurmaService turmaService;

    @PostMapping
    public Turma postTurma(@RequestBody TurmaDTO t){
        return this.turmaService.criarTurma(t);
    }

    @GetMapping
    public List<Turma> listarTodas(){
        return this.turmaService.listarTodas();
    }

    @PutMapping("/{idTurma}")
    public Turma updateAlunoTurma(@PathVariable("idTurma") Long idTurma, @RequestBody Long idAluno){
        return this.turmaService.adicionarAlunoTurma(idTurma, idAluno);
    }

    @DeleteMapping("/{idTurma}")
    public void deleteAlunoTurma(@PathVariable("idTurma") Long idTurma, @RequestBody Long idAluno){
        this.turmaService.deletarAlunoTurma(idTurma, idAluno);
    }
}
