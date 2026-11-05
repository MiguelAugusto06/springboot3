package com.example.escola.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;


    public Aluno save(Aluno aluno) {
        return this.alunoRepository.save(aluno);
    }

    public List<Aluno> listarAlunos() {
        return this.alunoRepository.findAll();
    }

    public Aluno getById(long id) {
        boolean hasAluno = this.alunoRepository.findById(id).isPresent();
        if (hasAluno) {
            return this.alunoRepository.findById(id).get();
        } else {
            System.out.println("Id : " + id + " não encontrado.");
            return null;
        }

    }

    public Aluno getById(int id) {

        boolean hasAluno = this.alunoRepository.findById(Integer.toUnsignedLong(id)).isPresent();
        if (hasAluno) {
            return this.alunoRepository.findById(Integer.toUnsignedLong(id)).get();
        } else {
            System.out.println("Id : " + id + " não encontrado.");
            return null;
        }

    }
}
