## 📘 SystemAcademy

## 📌 Descrição
O SystemAcademy é um sistema em Java para gerenciamento de academias.
Ele permite cadastrar instrutores, alunos e treinos, além de gerar relatórios detalhados e realizar buscas por CPF.
O objetivo é simular a lógica de uma academia real, aplicando conceitos de programação orientada a objetos (POO).

## 🚀 Funcionalidades
- Cadastro de instrutores e alunos.
- Associação de alunos a instrutores.
- Criação e atribuição de treinos.
- Relatórios detalhados da academia, instrutores e alunos.
- Busca de alunos e instrutores por CPF.
- Saída organizada no terminal com separadores e blocos de informação.

## 🛠️ Estrutura do Projeto
- Academy → centraliza instrutores e alunos, gera relatórios gerais.
- Instructor → gerencia seus alunos e treinos.
- Student → guarda informações pessoais, plano e treinos.
- Training → representa um treino com nome, duração e nível.
- Main → ponto de entrada para testar o sistema.

## 📂 Exemplo de Saída

Academia: System Academy

=================================

Instrutores:

Instrutor: Carlos

Idade: 35

CPF: 111.222.333-44

Especialidade: Musculação


Alunos do instrutor Carlos:

Aluno: Kauã

Idade: 20

CPF: 123.456.789-00

Plano: Mensal

-------------------

Aluno: Maria

Idade: 25

CPF: 987.654.321-00

Plano: Anual


-------------------

---------------------------------

Instrutor: Ana

Idade: 29

CPF: 555.666.777-88

Especialidade: Crossfit


Alunos do instrutor Ana:

---------------------------------

=================================

Alunos cadastrados na academia:

Aluno: Kauã

Idade: 20

CPF: 123.456.789-00

Plano: Mensal


---------------------------------

Aluno: Maria

Idade: 25

CPF: 987.654.321-00

Plano: Anual


---------------------------------

Aluno encontrado:

Aluno: Kauã

Idade: 20

CPF: 123.456.789-00

Plano: Mensal



## 📖 Como executar
- Clone o repositório ou copie os arquivos.
- Compile os arquivos .java com:
javac com/kauabiscotto/SystemAcademy/*.java
- Execute o programa principal:
java com.kauabiscotto.SystemAcademy.Main



## 🎯 Objetivo de estudo
Esse projeto foi desenvolvido para praticar:
- POO em Java (classes, objetos, atributos e métodos).
- Relacionamentos entre classes (Academy → Instructor → Student → Training).
- Boas práticas de organização e saída no terminal.
