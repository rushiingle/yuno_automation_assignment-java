package utils;

import config.Config;
import org.json.JSONObject;

public class PayloadBuilder {

    public static String minimalPurchase() {

        JSONObject payload = new JSONObject();
        payload.put("account_id", Config.ACCOUNT_ID);
        payload.put("workflow", "DIRECT");
        payload.put("amount", 1000);
        payload.put("currency", "USD");

        JSONObject card = new JSONObject();
        card.put("number", "4111111111111111");
        card.put("expiration_month", "12");
        card.put("expiration_year", "2030");
        card.put("cvv", "123");

        JSONObject paymentMethod = new JSONObject();
        paymentMethod.put("type", "CARD");
        paymentMethod.put("card", card);

        payload.put("payment_method", paymentMethod);

        return payload.toString();
    }

    public static String invalidCardPurchase() {
        JSONObject payload = new JSONObject(minimalPurchase());
        payload.getJSONObject("payment_method")
               .getJSONObject("card")
               .put("number", "4000000000000002");
        return payload.toString();
    }
}
