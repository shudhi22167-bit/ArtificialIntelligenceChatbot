#Artificial Intelligence Chatbot

##Project Overview:

Artificial Intelligence Chatbot is a Java-based chatbot application designed for interactive communication with users. The chatbot uses basic Natural Language Processing (NLP) techniques to process user input and a rule-based response system to provide answers to frequently asked questions.The application provides a graphical user interface using Java Swing,allowing users to communicate with the chatbot in real time.

## Features:

- Interactive chatbot conversation.
- Basic Natural Language Processing (NLP).
- Text pre-processing and normalization.
- Rule-based response generation.
- Frequently asked question handling.
- Unknown question handling. 
- Java Swing graphical user interface. 
- Real-time user interaction. 
- Send messages using button or Enter key.
- Predefined Knowledge base 
- User-friendly chat interface.

## Technologies Used:

- Java
- Java Swing 
- Object-Oriented Programming(OOP)
- HashMap
- Natural Language Processing(NLP)
- Eclipse IDE
-Java Module System

## Project Structure:
<p align="center">
<img src="C:\Users\shudh\OneDrive\Pictures\Screenshots\project_str.png"width="600"height="500">
</p>

## How to Run:

1. Open the project in Eclipse IDE.
2. Make sure Java is installed and configured.
3. Open the 'ChatbotGUI.java' file from the 'chatbot' package.
4. Run the file as **Java Application**.
5. The Chatbot window will open.
6. Enter a message in the input field.
7. Click the **Send** button or press **Enter**.
8. The chatbot will process the message and display a response.

##Usage: 

### 1. Greeting:
 
 The chatbot can answer questions related to:
 
 - Java 
 - Object-Oriented Programming
 - Artificial Intelligence
 - Natural Language Processing 
 - Internship
 
### 3. General Conversation 

The chatbot can respond to common messages such as:

- How are you?
- Thanks
- Thank you
-Bye 

### 4. Unknown Questions:

If the chatbot does not recognize a question,it displays an appropriate fallback message.

## NLP Processing:

The chatbot uses basic NLP pre-processing techniques before generating a response.

The NLP processor:
- Converts text into lowercase.
- Removes unnecessary punctuation.
- Removes extra spaces
- Normalizes user input

The processed input is then compared with predefined keywords in the knowledge base.

## Rule-Based Response System:

The chatbot uses a rule-based approach instead of a machine learning model.

A'HashMap' stores predefined keywords and their corresponding responses.When  the user enters a message, the chatbot searches for matching keywords and returns the appropriate responses.

## OOP Concepts Used:

- **classes and objects** - Used to organize chatbot components.
- **Encapsulation** - Data and functionality are organized within classes.
- **Abstraction** - Complex chatbot processing is separated into different classes.
- **Composition** - 'Chatbot' uses 'KnowledgeBase' and 'NLPProcessor' objects.

## Class Description:

### Chatbot.java:
Handles the main chatbot logic and connects the NLP processor with knowledge base.

### ChatbotGUI.java:
Provides the graphical user interface using Java Swing and manages real-time interaction with the user.

### KnowledgeBase.java:
Stores predefined questions,keywords and chatbot responses using 'HashMap'.

### NLPProcessor.java:
Processes and cleans user input using basic NLP techniques.

### module-info.java:
Defines the java module and includes the 'java.desktop' module required for the Swing GUI.

## Error Handling:
- Handles unknown questions using a default response.
- Prevents empty messages from being processed.
- Provides appropriate responses for unsupported queries.

## Author: 
**Diksha**<br>
Java Programming Internship - CodeAlpha
 