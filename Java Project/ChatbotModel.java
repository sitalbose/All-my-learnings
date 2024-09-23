public class ChatbotModel {
    private String intent;
    private String response;

    public ChatbotModel(String intent, String response) {
        this.intent = intent;
        this.response = response;
    }

    public String getIntent() {
        return intent;
    }

    public String getResponse() {
        return response;
    }
}