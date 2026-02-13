package no.usn.GraphQl_Test.graphql;

import no.usn.GraphQl_Test.model.Country;
import no.usn.GraphQl_Test.service.CountriesService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class CountryQueryResolver {

    private final CountriesService countriesService;

    public CountryQueryResolver(CountriesService countriesService) {
        this.countriesService = countriesService;
    }

    @QueryMapping
    public Mono<Country> country(@Argument String code) {
        return countriesService.getCountryByCode(code);
    }
}

