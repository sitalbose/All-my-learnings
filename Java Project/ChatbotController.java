import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatbotController {
    @Autowired
    private IntentRecognitionService intentRecognitionService;

    @Autowired
    private ResponseGenerationService responseGenerationService;

    @PostMapping("/chat")
    public ChatbotModel chat(@RequestBody String userInput) {
        String intent = intentRecognitionService.recognizeIntent(userInput);
        String response = responseGenerationService.generateResponse(intent);
        return new ChatbotModel(intent, response);
    }
}