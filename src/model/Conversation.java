package model;

import java.util.ArrayList;
import java.util.UUID;

public class Conversation {

	private UUID conversationId;
	
	private String category;
	
	private String product;
	
	private String subject;
	
	private String userName;
	
	private Operator operator;
	
	private boolean pending;
	
	private ArrayList<Message> orderedMessages;

	
	public Conversation(long id) {
		// TODO Auto-generated constructor stub
	}
	
	public Conversation(UUID userId, String category, String product, String subject, String userName) {
		super();
		this.conversationId = userId;
		this.category = category;
		this.product = product;
		this.subject = subject;
		this.userName = userName;
		this.pending = false;
		
		this.orderedMessages = new ArrayList<Message>();
	}

	public UUID getConversationId() {
		return conversationId;
	}

	public String getProduct() {
		return product;
	}

	public String getUserName() {
		return userName;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public boolean isPending() {
		return pending;
	}

	public void setPending(boolean pending) {
		this.pending = pending;
	}

	public void addMessage(Message message) {
		orderedMessages.add(message);
	}
	
	public String toString() {
		String result = "";
		for(Message message : orderedMessages) {
			result += "<p>" + message.getName() + ":" + message.getMessage() + "</p>"; 
		}
		return result;
	}
	
}
