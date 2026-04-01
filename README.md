# 🎮 Game Manager - Padrão Singleton

## 📌 Descrição

Este projeto demonstra a aplicação do padrão de projeto Singleton utilizando um gerenciador de estado de jogo.

O `GameManager` é responsável por controlar todas as informações globais do jogo, garantindo que exista apenas uma única instância durante toda a execução.

---

## 🎯 Objetivo

Aplicar o padrão Singleton para centralizar o controle do estado do jogo, evitando inconsistências como múltiplas instâncias com dados divergentes.

---

## 🧠 Padrão de Projeto Utilizado

* Singleton

---

## ⚙️ Funcionalidades

* Iniciar jogo
* Pausar jogo
* Retomar jogo
* Finalizar jogo
* Resetar jogo
* Controle de pontuação
* Sistema de progressão de nível

---

## 🏗️ Estrutura do Projeto

```
src/
├── main/
│   └── com/game/
│       ├── GameManager.java
│       ├── GameState.java
│       └── GameSimulator.java
│
└── test/
    └── com/game/
        └── GameManagerTest.java

docs/
└── uml-diagram.puml
```

---

## 🧪 Testes

O projeto utiliza testes unitários com JUnit 5 para validar:

* Instância única do Singleton
* Regras de negócio
* Controle de estados do jogo
* Sistema de pontuação e progressão de nível

---

## 📊 Diagrama UML

O diagrama UML do projeto está disponível na pasta:

```
docs/
```

---

## 🚀 Como executar

### ✔ Opção 1 — Pela IDE (Padrão)

* Clique com o botão direito na pasta `test`
* Selecione **Run Tests**

---

### ✔ Opção 2 — Via Maven (Opcional)

Caso o Maven esteja instalado:

```bash
mvn test
```

---

### ✔ Executar simulação

Execute a classe:

```
GameSimulator
```

---

## 🧠 Justificativa do uso do Singleton

O padrão Singleton foi utilizado para garantir que exista apenas uma instância do `GameManager`, evitando inconsistências no estado global do jogo, como múltiplas pontuações ou estados conflitantes.

---

## 🧑‍💻 Autor

Alceu Botelho
