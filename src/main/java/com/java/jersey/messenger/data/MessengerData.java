package com.java.jersey.messenger.data;

import java.util.HashMap;
import java.util.Map;

import com.java.jersey.messenger.model.Message;

public class MessengerData {
	
	public static Map<Long, Message> messageMap = new HashMap<>();
	
	public MessengerData() {
		
		if (messageMap.size() == 0) {
			messageMap.put(1L, new Message(1L, "Hello Java!", "Sunny"));
		}
		
	}
}
