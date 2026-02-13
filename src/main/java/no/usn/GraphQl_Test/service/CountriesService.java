package no.usn.GraphQl_Test.service;

import no.usn.GraphQl_Test.model.CountriesApiResponse;
import no.usn.GraphQl_Test.model.Country;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
public class CountriesService {

    private final WebClient webClient = WebClient.builder()
            .baseUrl("https://countries.trevorblades.com/graphql")
            .build();

    public Mono<Country> getCountryByCode(String code) {
        String query = """
            query ($code: ID!) {
              country(code: $code) {
                code
                name
                capital
                currency
              }
            }
            """;

        Map<String, Object> body = Map.of(
                "query", query,
                "variables", Map.of("code", code)
        );

        return webClient.post()
                .header("Content-Type", "application/json")
                .bodyValue(body)
                .retrieve()
                .bodyToMono(CountriesApiResponse.class)
                .map(resp -> resp.data() != null ? resp.data().country() : null);
    }
}

