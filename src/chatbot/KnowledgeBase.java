package chatbot;
import java.util.HashMap;
public class KnowledgeBase {
	private HashMap<String, String> responses;
	public KnowledgeBase() {
		responses =new HashMap<>();
		responses.put("hello","Hello! How can I help you?");
		responses.put("hi","Hi! Nice to meet you.");
		responses.put("how are you","I'm doing great! Thanks for asking.");
		responses.put("your name","I am an AI Chatbot");
		responses.put("what is java","Java is an object-oriented programming language.");
		responses.put("what is oop","OOP stands for object-oriented programming.");
		responses.put("what is ai","AI stands for Artificial Intelligence.");
		responses.put("what is nlp","NLP stands for Natural Language Processing.");
		responses.put("internship","This chatbot is developed as part of the CodeAlpha Java Programming Internship");
		responses.put("thankyou","You're welcome!");
		responses.put("thanks","You're welcome!");
		responses.put("bye","Goodbye! Have a nice day.");
	}
	
	public String getResponses(String question) {
		question=question.toLowerCase();
		for(String key: responses.keySet()) {
			if(question.contains(key)) {
				return responses.get(key);
			}
		}
		return "Sorry, I don't understand that question";
	}

}
