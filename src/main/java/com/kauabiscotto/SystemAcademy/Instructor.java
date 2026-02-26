package com.kauabiscotto.SystemAcademy;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends People {

    private String specialty;
    private List<Student> students;

    public Instructor(String name, int age, String cpf, String specialty) {
        super(name, age, cpf);
        this.specialty = specialty;
        this.students = new ArrayList<>();
    }

    @Override
    public void exibirInfo() {
        System.out.println("Instrutor: " + getName());
        System.out.println("Idade: " + getAge());
        System.out.println("CPF: " + getCpf());
        System.out.println("Especialidade: " + specialty);
        System.out.println();
    }

    public void listarAlunos() {
        if (students.isEmpty()) {
            System.out.println("Nenhum aluno vinculado ao instrutor " + getName() + ".");
        } else if (students.size() == 1) {
            System.out.println("Aluno do instrutor " + getName() + ":");
        } else {
            System.out.println("Alunos do instrutor " + getName() + ":");
        }

        for (Student student : students) {
            student.exibirInfo();
            System.out.println("-------------------");
        }
    }

    public void adicionarAlunos(Student student) {
        if (students.contains(student)) {
            System.out.println("Esse aluno já foi cadastrado!");
        } else {
            students.add(student);
        }
    }
    public Training criarTreino(String descripition, int duration, String level) {
        return new Training(descripition, duration, level);
    }

    public void atribuitTreino(Student student, Training training) {
        if (students.contains(student)) {
            student.adicionarTreino(training);
        } else {
            System.out.println("Esse aluno não está vinculado ao instrutor!");
        }
    }

    public void listarTreinosDosAlunos() {
        for (Student student : students) {
            System.out.println("Treino do aluno " + student.getName() + ":");
            student.listarTreinos();
            System.out.println("-------------------");
        }
    }

    public void removerAluno(Student student) {
        students.remove(student);
    }



    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Relatório do Intrutor\n");
        sb.append("Nome: ").append(getName()).append("\n");
        sb.append("Idade: ").append(getAge()).append("\n");
        sb.append("CPF: ").append(getCpf()).append("\n");
        sb.append("Especialidade: ").append(specialty).append("\n");
        sb.append("Alunos:\n");

        for (Student student : students) {
            sb.append(" - ").append(student.getName())
                    .append("CPF: ").append(student.getCpf()).append(")\n");
        }

        return sb.toString();
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
}
