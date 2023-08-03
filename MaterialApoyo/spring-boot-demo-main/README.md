# spring-boot-demo

Spring Boot Demo application with a bunch of services as course exercises.

## Endpoints

The project provides the following service endpoints:

- `GET` `/`: Responds with a `Hello World!` message.
- `GET` `/salute`: Responds with a `Kaixo!` message.
- `GET` `/firewell`: Responds with a `Goodbye!` message in japanese.
- Calculator Service:
  - `GET` `/calculator/add?num1=[num1]&num2=[num2]` Summatory of two numbers.
  - `GET` `/calculator/substract?num1=[num1]&num2=[num2]`: Subtracts two numbers.
  - `GET` `/calculator/multiply?num1=[num1]&num2=[num2]`: Multiplies two numbers.
  - `GET` `/calculator/divide?dividend=[num1]&divisor=[num2]`: Divides two numbers.
- People Directory:
  - `GET` `/people`: Emits a JSON with all registered people.
  - `GET` `/people/search?initial=[letter]&age=[number]`: Emits a JSON response with the people list matching the given optional parameters.
  - `POST` `/people`: Creates a new person. Attributes are specified as a JSON request body.

## Getting Started

#### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.13/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.13/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.13/reference/htmlsingle/#web)

#### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

