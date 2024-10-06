package models;

public class ExchangeRateService {
    private final HttpClientService httpClientService = new HttpClientService();

    public double getExchangeRate(String baseCurrency, String targetCurrency) {
        String url = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/" + baseCurrency;
        String jsonResponse = httpClientService.getRequest(url);

        ExchangeRateResponse exchangeRateResponse = JsonParser.parseExchangeRateResponse(jsonResponse);

        if (exchangeRateResponse.getConversionRates().containsKey(targetCurrency)) {
            return exchangeRateResponse.getConversionRates().get(targetCurrency);
        } else {
            throw new IllegalArgumentException("Moneda no encontrada: " + targetCurrency);
        }
    }
}