# Workshop-System-API

## Visão Geral do Sistema

Projeto web services com Spring Boot e JPA / Hibernate desenvolvido para gerenciar pedidos/solicitaçãoes dos usuários.


## Objetivo
Desenvolver uma API REST  estruturada em camadas lógicas: resource, service, repository, aprimorando meus conhecimentos em mapeamento objeto-relacional com JPA/Hibernete, CRUD, integração com PostgreSQL, utilizar o H2-
DATABASE e Postman para testes.


## Passos 

- Criar projeto Spring Boot Java 
- Implementar modelo de domínio 
- Estruturar camadas lógicas: resource, service, repository 
- Configurar banco de dados de teste (H2) 
- Povoar o banco de dados 
- CRUD - Create, Retrieve, Update, Delete 
- Tratamento de exceções 
- Criar Database no PostgreSQL

## Modelo de Domínio
![image](https://user-images.githubusercontent.com/100285143/236644496-1c3db5ac-0d66-441c-953e-76df0593853c.png)
![image](https://user-images.githubusercontent.com/100285143/236644512-827ae648-ed26-4b2c-8f26-0dab8485934b.png)


## Como Executar o Sistema

Para executar o projeto em seu ambiente de desenvolvimento, Certifique-se de ter o **Git**, **JDK17**, **Maven** e siga as instruções:

- realizar o git clone git@github.com:MedeirosGiana/workshop-system-api.git
- subir o projeto na sua IDE de preferência
- executar o projeto e acessar  um navegador da Web em **http://localhost:8080**  ou **http://localhost:8080/h2-console** para visualizar no banco de teste **H2-DATABASE** as tabelas salvas
- para **inserir, deletar, atualizar, listar** -> utilizar o **Postman**. Para isso, é necessário abrir o Postman utilizando o método **Get,Put, Delite** para realizar as operações desejadas
utilizando o formato de arquivo **Json**, conforme exemplo abaixo para inserir usuário, o arquivo pode também ser usad para deletar usuário:

![image](https://user-images.githubusercontent.com/100285143/236644956-1ec43f4e-313b-4115-b836-a492c37ec2a3.png)

## Tecnologias e Ferramentas Utilizadas

   - [Java](https://docs.oracle.com/en/java/javase/17/)
   - [Maven](https://maven.apache.org/guides/)
   - [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
   - [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
   - [H2 Database](https://www.h2database.com/html/main.html)
   - [PostgreSQL](https://www.postgresql.org/download/)
   - [Postman](https://www.postman.com/api-documentation-tool/)
   
   ![image](https://user-images.githubusercontent.com/100285143/236644808-152ba8a3-0da6-4361-ac7e-0c23dcb8ae84.png)
   ![image](https://user-images.githubusercontent.com/100285143/236644831-56c2b1c1-0a11-4cac-a1a1-c40288171610.png)


## Contribuindo

Se você quiser contribuir, sinta-se à vontade para enviar um pull request ou abrir uma issue.

<a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> 

## Autora
**Giana Medeiros**

https://www.linkedin.com/in/gianamedeiros/
