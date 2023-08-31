﻿# designs_patterns


## Design Patterns Utilizados

### Observer Pattern (Comportamental)

- **Onde:** Implementado nas classes `Task`, `TaskObserver` e `User`.
- **Descrição:** O Observer Pattern é usado para permitir que as tarefas notifiquem automaticamente os observadores (usuários) quando seu status muda.

### Strategy Pattern (Comportamental)

- **Onde:** Implementado nas classes `PriorityStrategy`, `LowPriorityStrategy`, `MediumPriorityStrategy` e `HighPriorityStrategy`, e na classe `Task`.
- **Descrição:** O Strategy Pattern é utilizado para permitir diferentes estratégias de priorização de tarefas. As diferentes estratégias são representadas pelas classes `LowPriorityStrategy`, `MediumPriorityStrategy` e `HighPriorityStrategy`, enquanto a classe `Task` possui um atributo `PriorityStrategy` para permitir a troca dinâmica da estratégia de priorização.

### Singleton Pattern (Criacional)

- **Onde:** Implementado na classe `TaskManager`.
- **Descrição:** O Singleton Pattern é aplicado à classe `TaskManager` para garantir que haja apenas uma instância do gerenciador de tarefas em todo o sistema.

### Composite Pattern (Estrutural)

- **Onde:** Implementado nas classes `TaskComponent`, `SingleTask` e `CompositeTask`.
- **Descrição:** O Composite Pattern é utilizado para permitir que as tarefas sejam compostas em uma estrutura de árvore, onde uma tarefa pode conter outras tarefas.

## Executando o Projeto

1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Clone este repositório em sua máquina local.
3. Compile as classes executando `javac librarymanagement/*.java` no diretório raiz do projeto.
4. Execute a classe `MainApp` executando `java librarymanagement.MainApp`.

## Exemplos de Uso

O método `main` na classe `MainApp` fornece exemplos de como as classes e design patterns podem ser usados para gerenciar tarefas em uma biblioteca.
