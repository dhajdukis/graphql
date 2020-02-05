# graphql
GraphQL back-end example with Spring Boot and Gradle

## 1. Install&Run

### Used technologies

Java 11

Gradle 6.1.1

Spring Boot 2.2.4

H2 database 1.4.200

### Run as a JAR file

Build:

`gradlew clean build`

Run the application:

`java -jar build/libs/graphql-0.0.1-SNAPSHOT.jar`

## 3. Details
With the application you can list, add products and check the documentation with its in-browser IDE (GraphiQL): http://localhost:8080/graphiql

Examples:

Adding new product:
```
mutation {
  createProduct(name: "Pendrive", price: 2999, isAvailable: "true") {
    id
    name
  }
}
```

Get one product:
```
{
  getProductById(id: 1) {
    name
    isAvailable
  }
}
```

List all products:
```
{
  getAllProducts(count: 10) {
    name
    isAvailable
    id
  }
}
```

### Authors
Daniel Hajdu-Kis - dhajdukis

