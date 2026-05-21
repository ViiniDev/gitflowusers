# Git Flow Users

API REST em Java com Spring Boot para gerenciamento de usuários. O projeto foi criado para praticar operações CRUD, persistência com PostgreSQL e organização de fluxo de desenvolvimento com Git/GitFlow.

## Funcionalidades

- Cadastro de usuários.
- Listagem de usuários.
- Atualização de nome e CPF.
- Remoção de usuário por ID.
- IDs gerados em formato UUID.
- Persistência em banco PostgreSQL.

## Tecnologias

- Java 17
- Spring Boot 3.2.3
- Spring Web
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## Estrutura do Projeto

```text
src/main/java/com/users/gitflow
├── controllers
│   └── UsersController.java
├── entities
│   └── Users.java
├── repositories
│   ├── RequestUsers.java
│   └── UserRepository.java
└── UsersApplication.java
```

## Configuração do Banco

Crie um banco PostgreSQL chamado `users`:

```sql
CREATE DATABASE users;
```

As configurações podem ser informadas por variáveis de ambiente:

```bash
DB_URL=jdbc:postgresql://localhost:5432/users
DB_USER=postgres
DB_PASSWORD=sua_senha
```

## Como Executar

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A aplicação ficará disponível em:

```text
http://localhost:8080
```

## Endpoints

### Listar usuários

```http
GET /user/get
```

### Cadastrar usuário

```http
POST /user/register
```

```json
{
  "name": "Vinicius Arruda",
  "cpf": 12345678900
}
```

### Atualizar usuário

```http
PUT /user/update
```

```json
{
  "id": "uuid-do-usuario",
  "name": "Vinicius Dev",
  "cpf": 12345678900
}
```

### Remover usuário

```http
DELETE /user/delete/{id}
```

## Melhorias Futuras

- Padronizar rotas REST para `/users`.
- Adicionar validações para CPF e nome.
- Criar DTOs separados para criação, atualização e resposta.
- Adicionar testes automatizados.
