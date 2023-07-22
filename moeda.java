package programa1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ExchangeRatesAPI {
    private static final String API_KEY = "YOUR_API_KEY_HERE";
    private static final String BASE_URL = "http://api.exchangeratesapi.io/v1/latest?access_key=" + API_KEY;

    public static Map<String, Double> getExchangeRates() {
        Map<String, Double> exchangeRates = new HashMap<>();

        try {
            URL url = new URL(BASE_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            // Parse JSON response
            // ...

        } catch (Exception e) {
            e.printStackTrace();
        }

        return exchangeRates;
    }
}
