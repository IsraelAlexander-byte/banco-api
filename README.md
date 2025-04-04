# Banco API

API REST para gerenciamento de contas bancárias, desenvolvida com Java 17, Spring Boot 3, Spring Data JPA, H2 Database e PostgreSQL Driver.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.4
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- PostgreSQL Driver (já incluso no projeto)
- Maven

---

## 📁 Estrutura do Projeto

```
banco-api/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/projetoapi/bancoapi/banco_api/
│       │       ├── controller/
│       │       │   └── ContaBancariaController.java
│       │       ├── model/
│       │       │   └── ContaBancaria.java
│       │       ├── repository/
│       │       │   └── ContaBancariaRepository.java
│       │       └── BancoApiApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
```

---

## 📌 Funcionalidades

- Criar conta bancária
- Listar todas as contas
- Buscar conta por ID
- Atualizar dados da conta
- Excluir conta

---

## 🔍 Explicação das Principais Classes

### BancoApiApplication.java
Classe principal responsável por inicializar a aplicação com `SpringApplication.run()`.

### ContaBancaria.java
Classe modelo anotada com `@Entity`, representa a entidade "conta bancária" no banco de dados.

Atributos:
- `id`: identificador único
- `titular`: nome do titular da conta
- `saldo`: saldo atual da conta

### ContaBancariaRepository.java
Interface que estende `JpaRepository`, fornecendo acesso direto às operações de CRUD no banco de dados.

### ContaBancariaController.java
Classe controladora com os seguintes endpoints:

- `GET /api/contas` → Listar todas as contas
- `POST /api/contas` → Criar nova conta
- `GET /api/contas/{id}` → Buscar conta por ID
- `PUT /api/contas/{id}` → Atualizar conta existente
- `DELETE /api/contas/{id}` → Excluir conta

### application.properties
Arquivo de configuração da aplicação com os parâmetros do banco H2 e console web ativado:

```
spring.datasource.url=jdbc:h2:mem:bankdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

## 📫 Acessos e Testes

### Acesso ao H2 Console:
```
URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:bankdb
User: sa
Password: (em branco)
```

### Exemplo de Requisição (via Postman)

#### Criar nova conta
`POST /api/contas`
```json
{
  "titular": "João Silva",
  "saldo": 1500.00
}
```

---

## 📝 Observações
- O projeto usa banco de dados em memória (H2), portanto os dados são apagados sempre que a aplicação reinicia.
- Já está preparado para futura integração com PostgreSQL (via driver incluído no `pom.xml`).

---

## 👨‍💻 Desenvolvido por
Israel Alexander

Em busca da primeira oportunidade na área de desenvolvimento! 🚀

