# Calculadora de Materiais para Obra Residencial

## Descrição

Projeto desenvolvido para a disciplina de Desenvolvimento de Sistemas.

O sistema permite realizar o cálculo de um orçamento de obra residencial com base na área da casa informada pelo usuário. Os orçamentos são armazenados em banco de dados e podem ser consultados posteriormente pelo nome do cliente.

---

## Tecnologias utilizadas

- Java 22
- Spring Boot
- Jakarta Faces (JSF)
- Spring Data JPA
- Banco de dados H2
- Maven
- IntelliJ IDEA

---

## Funcionalidades

- Cadastro de orçamento
- Cálculo automático do valor da obra
- Armazenamento dos orçamentos no banco de dados
- Consulta de orçamentos pelo nome do cliente

---

## Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/Rikesantos/calculadora-obra
```

2. Abra o projeto no IntelliJ IDEA.

3. Execute a classe:

```
CalculadoraObraApplication.java
```

4. Após iniciar a aplicação, acesse:

### Tela principal (Para realizar o cadastro)

```
http://localhost:8080/index.xhtml
```

### Consulta de orçamentos (Para realizar as consultas)

```
http://localhost:8080/consulta.xhtml
```

---

## Estrutura do projeto

```
controller/
entity/
repository/
META-INF/resources/
```

---

## Banco de dados

O projeto utiliza o banco H2 em memória.

Caso deseje acessar o banco:

```
http://localhost:8080/h2-console
```

---

## Autor

Rikelme da Silva Santos

Projeto desenvolvido para fins acadêmicos.
