package no.usn.GraphQl_Test.model;

public record CountriesApiResponse(Data data) {
    public record Data(Country country) {}
}

