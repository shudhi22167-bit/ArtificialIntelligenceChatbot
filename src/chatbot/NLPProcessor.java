package chatbot;

public class NLPProcessor {
	public String processText(String text) {
		
		text=text.toLowerCase();
		text = text.replaceAll("[^a-zA-Z0-9\\s]", "");
		text = text.trim().replaceAll("\\s+", " ");
		return text;
	}

}
