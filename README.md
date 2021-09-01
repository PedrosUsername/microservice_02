# Microservice based app piece - microservice 02

#### Index

* [Gateway](https://github.com/PedrosUsername/gateway)
* [Service Discovery](https://github.com/PedrosUsername/service_discovery)
* [Config Server](https://github.com/PedrosUsername/config_server)
* [Microservice 02](https://github.com/PedrosUsername/microservice_02) <--(voce esta aqui)
* [Microservice 01](https://github.com/PedrosUsername/microservice_01)

## microservice 02

O microservice 02, é a implementação de um CR_D do sistema de um carrinho de compras, criado
aqui para fins didáticos.

## Esse projeto foi feito com Spring Boot:

Com o { [Config Server](https://github.com/PedrosUsername/config_server), [Service Discovery](https://github.com/PedrosUsername/service_discovery), [Gateway](https://github.com/PedrosUsername/gateway) } e o Elasticsearch funcionando, inicie o projeto no seu sistema com o comando:

```shell script
$ ./gradlew bootRun
```

Recupere um registro (ou null) com:

```shell script
$ curl -X GET localhost:8082/cart/1
```

## O projeto foi desenvolvido e testado sob as seguintes condições:

* Java 8;
* Gradle 7.1.1;
* Elasticsearch 7.14.0;
* Docker 20.10.8
* Linux 5.4.0-81-generic amd64
* Intellj IDEA Community Edition;
* Controle de versão GIT;
* GitHub;
