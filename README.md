# Desafio 1 
## Quiz 

### Descrição do Projeto
Este projeto é um Quiz de perguntas e respostas desenvolvido em Java. Ele permite aos usuários responderem a uma série de perguntas e verifica suas respostas. As funcionalidades incluem adicionar novas perguntas ao banco de questões e verificar os acertos e erros do usuário.

### Funcionalidades Implementadas
- **Classes Principais:**
    - `Usuario`: Representa um usuário que responde ao Quiz, mantendo o registro de acertos e erros.
    - `Questao`: Define uma pergunta e sua resposta correspondente para o Quiz.
    - `Quiz`: Gerencia as questões e interações do usuário.

- **Funcionalidades:**
    - Responder ao Quiz.
    - Adicionar novas perguntas ao Quiz.
    - Verificar acertos e erros do usuário.

### Requisitos do Projeto
- **Java:** O projeto é desenvolvido em Java e requer um ambiente de execução Java para funcionar.
- **Console:** A interação com o Quiz é feita através do console/terminal.

### Uso do Sistema
1. **Execução:**
    - O código pode ser executado em um ambiente Java com suporte a console/terminal.
    - Inicialmente, o usuário informa seu nome para começar o Quiz.

2. **Funcionalidades:**
    - **Responder Quiz:** O usuário responde a uma série de perguntas fornecidas.
    - **Adicionar Perguntas:** É possível adicionar novas perguntas ao banco de questões.

3. **Encerramento:**
    - O usuário pode optar por sair do Quiz a qualquer momento.

### Como Utilizar
- Execute o programa e siga as instruções no console para começar o Quiz.
- Escolha a opção desejada (responder o Quiz, adicionar perguntas ou sair).

### Observações
- O sistema valida a entrada de perguntas e respostas para garantir que não estejam vazias.
- O usuário pode adicionar novas perguntas ao Quiz durante a execução.

---

## Login 


### Descrição do Projeto
Este sistema em Java tem como objetivo validar se um usuário e senha existem no sistema. Quando as credenciais são corretas, o usuário recebe uma mensagem de acordo com o horário do login. Além disso, foi implementado um menu simples que permite ao usuário escolher entre fazer login ou cadastrar uma nova conta.

### Funcionalidades Implementadas
- **Classes Principais:**
    - `Conta`: Representa um usuário com nome de usuário e senha.
    - `Sistema`: Gerencia as contas e valida o login dos usuários.

- **Funcionalidades Adicionais:**
    - **Menu Interativo:**
        - Opção para fazer login.
        - Opção para cadastrar uma nova conta.
        - Opção para sair do sistema.

### Requisitos do Projeto
- **Java:** O projeto é desenvolvido em Java e requer um ambiente de execução Java para funcionar.
- **Console:** A interação com o sistema é feita através do console/terminal.

### Uso do Sistema
1. **Execução:**
    - O código pode ser executado em um ambiente Java com suporte a console/terminal.

2. **Funcionalidades:**
    - **Login:**
        - O usuário pode fazer login no sistema fornecendo nome de usuário e senha.
        - Recebe uma saudação de acordo com o horário do login.

    - **Cadastro de Conta:**
        - É possível cadastrar uma nova conta no sistema.
    
    - **Encerramento:**
        - O usuário pode sair do sistema a qualquer momento.

### Observações
- A parte do menu foi implementada como um adicional aos requisitos, oferecendo maior usabilidade ao sistema.
- O sistema valida a entrada de dados para garantir que nome de usuário e senha não estejam vazios.

---

## Bónus

### Descrição do Projeto
Este programa em Java tem como objetivo validar se um funcionário tem direito a bonificação ou a um desconto. Baseado em critérios específicos, o funcionário receberá uma determinada quantidade de bonificação ou um desconto em seu salário.

### Funcionalidades Implementadas
- **Classe Principal:**
    - `Funcionario`: Representa um funcionário com nome e salário.
    
- **Funcionalidades Adicionais:**
    - **Validação de Bonificação:**
        - O programa valida o direito à bonificação ou desconto com base no salário do funcionário.

### Requisitos do Projeto
- **Java:** O projeto é desenvolvido em Java e requer um ambiente de execução Java para funcionar.
- **Console:** A interação com o programa é feita através do console/terminal.

### Uso do Programa
1. **Execução:**
    - O código pode ser executado em um ambiente Java com suporte a console/terminal.

2. **Funcionamento:**
    - O programa solicita a quantidade de funcionários a serem cadastrados.
    - Em seguida, solicita o nome e o salário de cada funcionário.
    - Com base nos critérios estabelecidos, calcula a bonificação ou desconto para cada funcionário.
    - Apresenta o nome, salário, bonificação ou desconto e o salário líquido de cada funcionário cadastrado.

### Observações
- O programa valida as entradas para garantir que os dados do funcionário sejam válidos (nome não vazio e salário maior que zero).
- A bonificação ou desconto é determinada de acordo com faixas salariais específicas.

---
## Emoticons

### Descrição do Projeto
Este programa, desenvolvido em Java, tem como objetivo determinar o sentimento expresso em uma linha de mensagem. Com base em emoticons específicos presentes na mensagem, o programa identifica se o sentimento é "divertido", "chateado" ou "neutro".

### Funcionalidades Implementadas
- **Classe Principal:**
    - `Mensagem`: Representa uma mensagem com um texto e identifica o sentimento expresso nesse texto.
    
- **Funcionalidades Adicionais:**
    - **Identificação de Emoticons:**
        - O programa verifica a presença de emoticons específicos na mensagem para determinar o sentimento.
    
### Requisitos do Projeto
- **Java:** O projeto é desenvolvido em Java e requer um ambiente de execução Java para funcionar.
- **Console:** A interação com o programa é feita através do console/terminal.

### Uso do Programa
1. **Execução:**
    - O código pode ser executado em um ambiente Java com suporte a console/terminal.

2. **Funcionamento:**
    - O programa solicita ao usuário que digite uma mensagem.
    - Com base nos emoticons presentes na mensagem, determina se o sentimento é "divertido", "chateado" ou "neutro".
    - Exibe o sentimento identificado para a mensagem digitada.

### Observações
- O programa utiliza expressões regulares para identificar emoticons específicos na mensagem.
- A identificação do sentimento é realizada comparando a ocorrência de diferentes emoticons na mensagem.

---

## Palíndromo

### Descrição do Projeto
Este programa, desenvolvido em Java, verifica se uma string fornecida pelo usuário é um palíndromo. Ele desconsidera espaços, pontuações e diferenças entre letras maiúsculas e minúsculas durante a verificação.

### Funcionalidades Implementadas
- **Classe Principal:**
    - `Main`: Realiza a verificação se a string fornecida é um palíndromo ou não.
    
- **Funcionalidades Adicionais:**
    - **Processamento da String:**
        - A string é processada para remoção de espaços, pontuações e diferenciação entre letras maiúsculas e minúsculas antes da verificação de palíndromo.

### Requisitos do Projeto
- **Java:** O projeto é desenvolvido em Java e requer um ambiente de execução Java para funcionar.
- **Console:** A interação com o programa é feita através do console/terminal.

### Uso do Programa
1. **Execução:**
    - O código pode ser executado em um ambiente Java com suporte a console/terminal.

2. **Funcionamento:**
    - O programa solicita ao usuário que digite uma palavra ou frase.
    - Remove espaços, pontuações e diferenciação entre letras maiúsculas e minúsculas da string fornecida.
    - Verifica se a string modificada é um palíndromo (uma palavra que se lê da mesma forma de trás para frente).
    - Exibe o resultado da verificação, informando se a string é ou não um palíndromo.

### Observações
- O programa desconsidera espaços, pontuações e diferenciação entre letras maiúsculas e minúsculas durante a verificação de palíndromo.
- A verificação é feita comparando os caracteres da string original modificada.

---
## Gerenciador de Estoque de Produtos

### Descrição do Projeto
Este programa, desenvolvido em Java, gerencia o estoque de produtos. Ele permite a compra e venda de produtos, atualizando automaticamente a quantidade disponível em estoque e garantindo que haja estoque suficiente antes de uma venda.

### Funcionalidades Implementadas
- **Classe Produto:**
    - `Produto`: Define os atributos e métodos para gerenciar um produto no estoque.
    
- **Exceção Personalizada:**
    - `EstoqueInsuficienteException`: Exceção lançada quando a quantidade de produtos disponíveis no estoque é insuficiente para uma venda.

- **Funcionalidades Adicionais:**
    - Compra e venda de produtos.
    - Atualização automática da quantidade em estoque após compra ou venda.
    - Verificação de disponibilidade de estoque antes de uma venda.

### Requisitos do Projeto
- **Java:** O projeto é desenvolvido em Java e requer um ambiente de execução Java para funcionar.
- **Console:** A interação com o programa é feita através do console/terminal.

### Uso do Programa
1. **Execução:**
    - O código pode ser executado em um ambiente Java com suporte a console/terminal.

2. **Funcionamento:**
    - Cada produto é definido com nome, código, preço e quantidade em estoque.
    - Ações possíveis: compra e venda de produtos.
    - Após uma compra, a quantidade em estoque é atualizada e adicionada ao estoque existente.
    - Antes de uma venda, o programa verifica se há estoque suficiente.
    - Após uma venda, a quantidade em estoque é atualizada e subtraída do estoque existente.

### Observações
- O programa lida com exceções personalizadas para lidar com situações específicas, como estoque insuficiente para venda.
- Os testes no arquivo `Main` demonstram a compra e venda de produtos, assim como a verificação de exceções para situações inválidas.

---















