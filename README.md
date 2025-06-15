<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body>
  <header>
    <h1> 📍 Buscador de CEP com Java</h1>
  </header>
  <main>
    <div>
      <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white">
      <img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white">
      <img src="https://img.shields.io/badge/Alura-13294B?style=for-the-badge&logo=data:image/svg+xml;base64,...">
    </div>
</main>
</body>
</html>


## 📌 Descrição
Este projeto foi desenvolvido como parte do desafio de criação de uma **Aplicação Buscador de CEP**. O objetivo é consumir a API pública **ViaCEP** para buscar informações de endereço a partir de um CEP informado pelo usuário, exibindo os dados e armazenando-os em um arquivo **JSON**.

## 🚀 Objetivo do Projeto
A aplicação permite ao usuário:
- **Consultar um CEP** e obter detalhes do endereço.
- **Validar a entrada** do CEP para garantir um formato correto.
- **Buscar informações na API ViaCEP** e exibi-las de forma organizada.
- **Salvar os dados em um arquivo JSON** para referência futura.

## 📚 Tecnologias Utilizadas
- **Java**: Linguagem de programação utilizada na aplicação.
- **API ViaCEP**: Serviço utilizado para obter os dados de endereço.
- **Bibliotecas**:
  - `HttpURLConnection`: Para requisições HTTP.
  - `Gson` ou `Jackson`: Para manipulação de JSON.
- **IDE**: IntelliJ IDEA, Visual Studio Code (ou sua IDE de preferência).

## 🔧 Funcionalidades
- 🏠 **Entrada do CEP**: Usuário informa o CEP para consulta.
- 🔎 **Consumo da API**: Requisição à API ViaCEP para obter os dados.
- 📋 **Exibição das Informações**:
  - Logradouro
  - Complemento
  - Bairro
  - Localidade
  - UF (Unidade Federativa)
- 💾 **Gravação em JSON**:
  - Criação de um arquivo JSON com os dados do endereço consultado.
  - Nome do arquivo no formato `endereco_{cep}.json`, por exemplo: `endereco_01001-000.json`.

## 🛠️ Estrutura do Projeto
- **Inicialização** da interface com opção de entrada do CEP.
- **Requisição à API ViaCEP** para obtenção de dados.
- **Métodos organizados** para funcionalidades como:
  - `validarCep()`
  - `buscarCep()`
  - `exibirDados()`
  - `salvarJson()`
- **Tratamento de erros** para garantir consultas seguras.

## 📂 Como Executar
1. Clone o repositório do projeto:
   ```bash
   git clone https://github.com/seu-repositorio/buscador-cep-java

## 👨‍🏫 Instrutores
- Jacqueline Oliveira
- Paulo Silveira


## 🚀 Projeto do Curso Java One
Este projeto faz parte do desafio proposto no curso <strong>Java One</strong>, com o objetivo de consolidar os aprendizados iniciais em Java através da criação de um sistema prático e funcional.
