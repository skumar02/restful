package com.java.jersey.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.java.jersey.messenger.data.MessengerData;
import com.java.jersey.messenger.model.Message;

public class MessengerService {
	
	MessengerData messengerData = new MessengerData();
	//Map<Long, Message> data = MessengerData.messageMap;
		
	public MessengerService() {
		
	}
		
	public List<Message> getMessages() {
		List<Message> messages = new ArrayList<Message>(MessengerData.messageMap.values());
		for (Message msg: messages) {
			System.out.println(msg);
		}
		return new ArrayList<Message>(MessengerData.messageMap.values());
	}
	
	
	public Message getMessage(long id) {
		
		return MessengerData.messageMap.get(id);		
	}
	
	public Message addMessage(Message message) {
		message.setId(MessengerData.messageMap.size() + 1);
		message.setCreated(new Date());
		MessengerData.messageMap.put(message.getId(), message);
		
		System.out.println(MessengerData.messageMap.get(message.getId()));
		
		return MessengerData.messageMap.get(message.getId());		
	}
	
	public Message updateMessage(Message message) {
		
		MessengerData.messageMap.put(message.getId(), message);
		
		return MessengerData.messageMap.get(message.getId());
	}
	
	public Message removeMessage(long id) {
		
		return MessengerData.messageMap.remove(id);
	}
	
}
