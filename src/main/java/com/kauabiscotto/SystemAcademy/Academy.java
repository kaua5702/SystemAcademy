package com.kauabiscotto.SystemAcademy;

import java.util.ArrayList;
import java.util.List;

public class Academy {

    private String academyName;
    private List<Instructor> instructors;
    private List<Student> students;

    public Academy (String academyName) {
        this.academyName = academyName;
        this.instructors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void adionarInstrutor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void removeInstrutor(Instructor instructor) {
        instructors.remove(instructor);
    }

    public void adicionarAluno(Student student) {
        students.add(student);
    }

    public void removerAluno(Student student) {
        students.remove(student);
    }

    public void listarInstrutores() {
        for (Instructor instructor : instructors) {
            instructor.exibirInfo();
        }
    }

    public void listarAlunos() {
        for (Student student : students) {
            student.exibirInfo();
        }
    }

    public Student buscarAlunoPorCpf(String cpf) {
        for (Student student : students) {
            if (student.getCpf().equals(cpf)) {
                return student;
            }
        }
        System.out.println("Nenhum aluno encontrado com o CPF: " + cpf);
        return null;
    }

    public Instructor buscarInstrutorPorCpf(String cpf) {
        for (Instructor instructor : instructors) {
            if (instructor.getCpf().equals(cpf)) {
                return instructor;
            }
        }
        System.out.println("Nenhum instrutor encontrado com o CPF: " + cpf);
        return null;
    }

    public void gerarRelatorio() {
        System.out.println("Academia: " + academyName);
        System.out.println("=================================");
        System.out.println("Instrutores:");
        for (Instructor instructor : instructors) {
            instructor.exibirInfo();
            instructor.listarAlunos();
            System.out.println("---------------------------------");
        }
        System.out.println("=================================");
        System.out.println("Alunos cadastrados na academia:");
        for (Student student : students) {
            student.exibirInfo();
            System.out.println("---------------------------------");
        }
    }

}
