# 🚗 Sistema de Locadora de Veículos (POO & MVC)

Projeto Final desenvolvido para a disciplina de Desenvolvimento de Software do curso de Análise e Desenvolvimento de Sistemas (3º Semestre) da Universidade Positivo.

## 👥 Equipe
- Mateus Zichack
- Marcos Paulo

## 🎯 Objetivo do Projeto
Desenvolver uma aplicação em Java para gerenciar uma Locadora de Veículos, consolidando os conceitos fundamentais de **Programação Orientada a Objetos (POO)** e a separação de responsabilidades através da arquitetura **MVC (Model-View-Controller)**.

## 🚀 Funcionalidades
- **Autenticação Segura:** Sistema de login com bloqueio de conta após 3 tentativas falhas e validação de histórico para não repetir as últimas 3 senhas.
- **Gestão de Veículos (CRUD):** Cadastro, consulta, edição e exclusão de Carros e Motos. Veículos alugados possuem trava de segurança contra exclusão.
- **Gestão de Locações:** Registro de contratos de aluguel vinculando clientes, funcionários e a frota disponível.
- **Cálculo Polimórfico:** Preço das diárias calculado dinamicamente com base no tipo de veículo (ex: acréscimo de 20% para carros com ar-condicionado e 10% para motos acima de 400cc).
- **Persistência de Dados:** Uso de Serialização (`ObjectOutputStream` / `ObjectInputStream`) para salvar o estado dos objetos em arquivos binários (`.dat`).

## 🏗️ Estrutura e Padrões Aplicados
O sistema foi projetado estritamente dentro dos critérios de avaliação de POO:
- **Herança & Classes Abstratas:** `Usuario` (abstrata) -> `Cliente` e `Funcionario`. `Veiculo` (abstrata) -> `Carro` e `Moto`.
- **Polimorfismo:** Sobrescrita do método `calcularDiaria()` da interface e dos métodos `toString()`.
- **Interfaces:** Implementação da interface `Calculavel`.
- **Composição:** A classe `Locacao` agrega objetos de `Cliente`, `Funcionario` e `Veiculo` (Relacionamento entre múltiplas classes).
- **Encapsulamento:** Modificadores de acesso `private` em todos os atributos e manipulação via Getters/Setters.
- **Injeção de Dependência:** Compartilhamento da instância do Controller de veículos na memória para sincronizar o status entre as Views.

## 💻 Como Executar
1. Certifique-se de ter o Java (JDK) instalado na sua máquina.
2. Clone o repositório ou baixe a pasta do projeto.
3. Garanta que todas as classes estão compiladas dentro do diretório `src/`.
4. Execute o arquivo principal `Main.java`.

### 🔑 Credenciais de Teste (Padrão)
Para acessar o sistema e testar as funcionalidades, utilize o usuário administrador já instanciado:
- **Login:** `admin`
- **Senha:** `1234`

## 📂 Árvore de Diretórios
```text
src/
├── arquivos/          # Diretório gerado automaticamente para os arquivos .dat
├── controller/        # Camada de controle (regras de negócio e serialização)
├── model/             # Camada de dados (entidades, abstrações e interfaces)
├── view/              # Camada de interação visual (Menus e inputs via Scanner)
└── Main.java          # Ponto de entrada do sistema
