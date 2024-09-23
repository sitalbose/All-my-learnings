import java.util.HashMap;
import java.util.Map;

public class IntentRecognitionService {
    private Map<String, String> intents;

    public IntentRecognitionService() {
        intents = new HashMap<>();
        intents.put("hello", "GREETING");
        intents.put("goodbye", "GOODBYE");
    }

    public String recognizeIntent(String userInput) {
        for (Map.Entry<String, String> entry : intents.entrySet()) {
            if (userInput.toLowerCase().contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "UNKNOWN";
    }
}