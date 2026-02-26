package com.kauabiscotto.SystemAcademy;

public class AppAcademy {
    public static void main(String[] args) {

        // Criar a academia
        Academy academy = new Academy("System Academy");

        // Criar instrutores
        Instructor instrutor1 = new Instructor("Carlos", 35, "111.222.333-44", "Musculação");
        Instructor instrutor2 = new Instructor("Ana", 29, "555.666.777-88", "Crossfit");

        // Adicionar instrutores à academia
        academy.adionarInstrutor(instrutor1);
        academy.adionarInstrutor(instrutor2);

        // Criar alunos
        Student aluno1 = new Student("Kauã", 20, "123.456.789-00", "Mensal");
        Student aluno2 = new Student("Maria", 25, "987.654.321-00", "Anual");

        // Adicionar alunos à academia
        academy.adicionarAluno(aluno1);
        academy.adicionarAluno(aluno2);

        // Vincular alunos ao instrutor Carlos
        instrutor1.adicionarAlunos(aluno1);
        instrutor1.adicionarAlunos(aluno2);

        // Criar treinos
        Training treinoPeito = instrutor1.criarTreino("Treino de Peito", 45, "Intermediário");
        Training treinoCostas = instrutor1.criarTreino("Treino de Costas", 50, "Avançado");

        // Atribuir treinos aos alunos
        instrutor1.atribuitTreino(aluno1, treinoPeito);
        instrutor1.atribuitTreino(aluno2, treinoCostas);

        // Gerar relatório geral da academia
        academy.gerarRelatorio();

        // Buscar aluno por CPF
        Student buscado = academy.buscarAlunoPorCpf("123.456.789-00");
        if (buscado != null) {
            System.out.println("Aluno encontrado:");
            buscado.exibirInfo();
        }
    }
}