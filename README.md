# Calculadora de Obra - Spring Boot

## 📌 Descrição
Projeto desenvolvido para calcular materiais de uma obra com base na planta baixa representada como um grafo.

## 🧠 Conceitos Utilizados
- Grafo (Vértices e Arestas)
- API REST
- Spring Boot
- JPA / Hibernate
- Banco H2

## 🏗 Estrutura
- **Vértice**: ponto de encontro das paredes
- **Aresta**: parede da construção
- **Cômodo**: conjunto de paredes

## ⚙️ Funcionalidades

### ✔ Cadastro de cômodos
POST `/comodos`

### ✔ Listagem de cômodos
GET `/comodos`

### ✔ Cálculo de tijolos por cômodo
GET `/comodos/{id}/tijolos`

### ✔ Cálculo de concreto
POST `/concreto/calcular`

### ✔ Resumo da obra
POST `/obra/resumo`

## 🧪 Como executar
## Como acessar

Após executar o projeto, acesse:

http://localhost:8080/

A rota inicial retorna uma mensagem indicando que a API está funcionando.

Principais endpoints:

- GET `/comodos`
- POST `/comodos`
- POST `/concreto/calcular`
- POST `/tijolos/calcular`
- POST `/obra/resumo`
- GET `/comodos/{id}/tijolos`
 
3. Testar endpoints com Postman

## 📊 Exemplo de cálculo

Entrada:
- Paredes com dimensões
- Portas e janelas

Saída:
- Quantidade de tijolos
- Volume de concreto

---

## 👨‍💻 Autor
Rikelme Da Silva Santos
