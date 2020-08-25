## O negocio

A Big Flower S.A e uma loja virtual que prove a venda / entrega de flores e afins em todo território nacional. Devido está abrangência todo o preparo e entrega do pedido é feito por um [Fornecedor](https://github.com/renatooa/spring-boot-microservice-fornecedor) mais próximo ao destinatário.

### Microservice Fornecedor

Responsável pelos serviços de fornecedores, produtos e pedido por estado. Atualmente utilizado pela [Loja](https://github.com/renatooa/spring-boot-microservice-loja)

### Pilha tecnológica
Projeto elaborado utilizando Spring Boot versão 2.3.3, utilizando a pilha tecnológica apresentada a baixo:
- __Spring Data__ – Persistência de dados
-  __Mysql__ – Especificações do SGBD
- __Eureka Cliente__ – Registro do Microservice ao [servidor de descobriment](https://github.com/renatooa/spring-boot-microservice-eureka-server)
- __Config__ - Cliente para obtenção da configuração do Microservice disponibilizada pelo [servidor de configuração](https://github.com/renatooa/spring-boot-microservice-config-server) 
- __Sleuth__ - Prove mecanismos de rastreabilidade de Log Trace Distribuído. (Papertrail)