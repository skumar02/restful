package com.java.jersey.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.jersey.messenger.model.Message;
import com.java.jersey.messenger.service.MessengerService;

@Path("/messages")
public class MessengerResource {
	
	private MessengerService service = new MessengerService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		
		return service.getMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") Long id) {
		
		return service.getMessage(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		
		return service.addMessage(message);		
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(Message message) {
		
		return service.updateMessage(message);
	}
	
	@DELETE
	@Path("{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message deleteMessage(@PathParam("messageId")long messageId) {
		
		return service.removeMessage(messageId);
	}
	
}