package com.kauabiscotto.SystemAcademy;

import java.util.ArrayList;
import java.util.List;

public class Student extends People {

    private String plan;
    private List<Training> trainings;

    public Student (String name, int age, String cpf, String plan) {
        super(name, age, cpf);
        this.plan = plan;
        this.trainings = new ArrayList<>();
    }

    @Override
    public void exibirInfo() {
        System.out.println("Aluno: " + getName());
        System.out.println("Idade: " + getAge());
        System.out.println("CPF: " + getCpf());
        System.out.println("Plano: " + plan);
        System.out.println();
    }

    public void adicionarTreino(Training training) {
        trainings.add(training);
    }

    public void listarTreinos() {
        System.out.println("Treino do aluno " + getName() + ":");
        for (Training training : trainings) {
            System.out.println(training);
        }
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public List<Training> getTrainings() {
        return trainings;
    }
}
