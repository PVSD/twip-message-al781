package com.company;

import java.util.ArrayList;

public class Conversation
    {
        public ArrayList<Message> messages = new ArrayList<Message>();

        public Conversation()
            {

            }

        public void SendMessage(String sender, String message)
            {
                messages.add(new Message(sender, message));
            }

        public void PrintMessageHistory()
            {
                for(int i = 0; i < messages.size(); i++)
                    {
                        System.out.println(messages.get(i).getSender() + " : " + messages.get(i).getMessage());
                    }
            }
        public void DeleteMessage(int index)
            {
                messages.remove(index);
            }
    }
