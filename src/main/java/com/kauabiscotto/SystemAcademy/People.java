package com.kauabiscotto.SystemAcademy;

public abstract class People {

    private String name;
    private int age;
    private String cpf;


    public People(String name, int age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public abstract void exibirInfo();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
