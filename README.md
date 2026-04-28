 Calculadora de Obra - Spring Boot

Descrição

Este projeto tem como objetivo calcular materiais de construção a partir da modelagem de uma planta baixa como um grafo G(V, A).

- V (Vértices): representam os encontros das paredes (pilares)
- A (Arestas): representam as paredes da construção

O sistema permite calcular:
- Volume de concreto (viga baldrame)
- Quantidade de tijolos
- Resumo geral da obra

---

 Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- JPA / Hibernate
- Banco H2 (em memória)
- Git e GitHub
- Postman (testes)

---

Modelagem do Sistema

A aplicação representa a planta como um grafo:

- **Vertice** → encontros das paredes
- **Aresta** → paredes com dimensões e informações de portas/janelas
- **Comodo** → conjunto de arestas

---

 Como executar o projeto

1. Clonar o repositório:
```bash
git clone https://github.com/Rikesantos/calculadora-obra.git

Abrir no IntelliJ
Rodar a aplicação
Acessar:
http://localhost:8080/

🔗 Principais Endpoints
✔ Listar cômodos
GET /comodos

✔ Cadastrar cômodo
POST /comodos

✔ Calcular tijolos por cômodo
GET /comodos/{id}/tijolos

✔ Calcular concreto
POST /concreto/calcular?altura=0.3

✔ Calcular tijolos (lista de paredes)
POST /tijolos/calcular

✔ Resumo da obra
POST /obra/resumo?alturaBaldrame=0.3

Exemplos de Testes
🔹 Concreto

Entrada:

[
  { "comprimento": 5, "largura": 0.2 },
  { "comprimento": 4, "largura": 0.2 }
]

Resultado:

0.54
🔹 Tijolos

Resultado:

224
🔹 Por Cômodo

Resultado:

528.0
🔹 Resumo da Obra

Resultado:

{
  "quantidadeTijolos": 528.0,
  "volumeConcreto": 0.6
}
 Observações
O valor 528.0 representa 528 tijolos, sendo exibido como decimal por conta do tipo double utilizado no Java.
O sistema foi desenvolvido com foco em organização, clareza e funcionamento dos cálculos.

 Autor
Rikelme Da Silva Santos
