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

1. Rodar o projeto no IntelliJ
2. Acessar: http://localhost:8080/
 
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
