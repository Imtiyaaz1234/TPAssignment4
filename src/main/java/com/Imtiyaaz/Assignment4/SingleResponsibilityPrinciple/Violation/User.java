package com.Imtiyaaz.Assignment4.SingleResponsibilityPrinciple.Violation;

/**
 * Created by Ameer on 2017/03/30.
 */
public class User {
    private String sender;
    private String receiver;
    private String content;

    public void setSender(String sender) {

        this.sender = sender;
    }

    public void setReceiver(String receiver) {

        this.receiver = receiver;
    }

    public void setContent(String content) {
        
        this.content = content;
    }

    public String getSender()
    {
        return sender;
    }

    public String getReceiver()
    {
        return receiver;
    }

    public String getContent()
    {
        return content;
    }

    public String toString()
    {
        return String.format("Sender: %s\n Receiver: %s\n Message: %s", getSender(),getReceiver(),getContent());
    }

}
