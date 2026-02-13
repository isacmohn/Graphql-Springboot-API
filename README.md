# GraphQL Spring Boot API (Learning Prototype)

This is a small prototype built to understand how a Spring Boot application can fetch data from a public API and expose it through a GraphQL resolver.  
The project focuses on architecture and data flow — not production features.


## Where is the core code?

All important application code is located in:

src/main/java/no/usn/GraphQl_Test/


## Start reading here

**Application entry point**  
GraphQlTestApplication.java  
Starts the Spring Boot application.

**GraphQL Resolver**  
graphql/CountryQueryResolver.java  
Receives the `country(code)` query and forwards it to the service layer.

**Service layer**  
service/CountriesService.java  
Calls the external public API using WebClient and maps the response.

**Model classes**  
model/Country.java  
model/CountriesApiResponse.java  
Represents structured response objects returned to the client.


## Data flow

GraphQL query → Resolver → Service → External API → Mapping → Response


## Tech stack
- Java 17
- Spring Boot
- Spring GraphQL
- WebClient
- Maven
