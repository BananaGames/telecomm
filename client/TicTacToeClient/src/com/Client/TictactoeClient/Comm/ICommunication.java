package com.Client.TictactoeClient.Comm;

public interface ICommunication {

	void sendMessage(String messageBody, String IPAddress);
	String receiveMessage();
	
}
