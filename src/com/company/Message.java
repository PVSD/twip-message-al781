package com.company;

public class Message
    {
        public String sender;
        public String message;

        public Message(String sender, String message)
            {
                this.sender = sender;
                this.message = message;
            }

        public String getSender()
            {
                return sender;
            }

        public String getMessage()
            {
                return message;
            }
    }