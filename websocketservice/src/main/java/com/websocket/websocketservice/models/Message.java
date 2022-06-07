package com.websocket.websocketservice.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message {

    public enum MessageType {
        CHAT, JOIN, LEAVE
    }

    private MessageType messageType;
    private String content;
    private String sender;
}
