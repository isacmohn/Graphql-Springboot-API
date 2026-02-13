This is a small prototype built to understand how a Spring Boot application can fetch data from a public API and expose it through a GraphQL resolver.
The project focuses on architecture and data flow — not production features.

All core logic is located in: src/main/java/no/usn/GraphQl_Test/

Application entry point: GraphQlTestApplication.java
GraphQL resolver: graphql/CountryQueryResolver.java
Service (calls external API): service/CountriesService.java

Models (mapped response objects) are in files
-  model/Country.java
-  model/CountriesApiResponse.java

Application flow: GraphQL Query → Resolver → Service → Public API → Mapping → Response


Tech stack:
  -  Java 17
  -  Spring Boot
  -  Spring GraphQL
  -  WebClient
  -  Maven
