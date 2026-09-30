package chatbot;

public class Chatbot {
	private KnowledgeBase KnowledgeBase;
	private NLPProcessor nlpProcessor;
	
	public Chatbot() {
		KnowledgeBase=new KnowledgeBase();
		nlpProcessor=new NLPProcessor();
	}
	public String getResponse(String userInput) {
		String processedInput=nlpProcessor.processText(userInput);
		return KnowledgeBase.getResponses(processedInput);
	}
	

}
