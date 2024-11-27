import java.util.Map;

public record Monedas(
        String result,
        String documentation,
        String terms_of_use,
        int time_last_update_unix,
        String time_last_update_utc,
        int time_next_update_unix,
        String time_next_update_utc,
        String base_code,
        Map<String, Double> conversion_rates) {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Result: ").append(result).append("\n")
                .append("Documentation: ").append(documentation).append("\n")
                .append("Terms of Use: ").append(terms_of_use).append("\n")
                .append("Last Update (Unix): ").append(time_last_update_unix).append("\n")
                .append("Last Update (UTC): ").append(time_last_update_utc).append("\n")
                .append("Next Update (Unix): ").append(time_next_update_unix).append("\n")
                .append("Next Update (UTC): ").append(time_next_update_utc).append("\n")
                .append("Base Code: ").append(base_code).append("\n")
                .append("Conversion Rates:\n");

        // Agregar las tasas de conversión en líneas separadas
        conversion_rates.forEach((currency, rate) ->
                sb.append("  ").append(currency).append(": ").append(rate).append("\n"));

        return sb.toString();
    }
}
