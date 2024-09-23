import java.util.HashMap;
import java.util.Map;

public class ResponseGenerationService {
    private Map<String, String> responses;

    public ResponseGenerationService() {
        responses = new HashMap<>();
        responses.put("GREETING", "Hello! How can I help you today?");
        responses.put("GOODBYE", "Goodbye! Have a great day!");
    }

    public String generateResponse(String intent) {
        return responses.get(intent);
    }
}